package util;

import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 分页切面
 * @author windows
 *
 */
@Aspect
@Component
public class PagerAspect {
	
	@Autowired
	private JdbcTemplate JdbcTemplate;
	
	// 1.自定义切点 
	@Pointcut("execution(* service..*(..))")
	public void selfPointcut() {}
	
	@SuppressWarnings({"rawtypes","unchecked"})
	@Around("selfPointcut()")
	public Object aroundAdvice(ProceedingJoinPoint jp) {
		Object o = null;
		
		// 1.根据JP对象获取Method对象
		MethodSignature signature = (MethodSignature)jp.getSignature();
		Method m = signature.getMethod();
		// 2.Method对象获取是否含有@MiniPager标注
		MiniPager miniPager = (MiniPager)m.getAnnotation(MiniPager.class);
		// 3.做判断	若没有@MiniPager标注，则执行原始的业务方法
		if(miniPager==null) {
			try {
				jp.proceed();
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return o;
		}
		// 4.若加有@MiniPager标注，则加入分页代码
		// Ⅰ.获取总的条目数
		String tableName = miniPager.tableName();
		int totalItems = JdbcTemplate.queryForObject("select count(*) from "+tableName,Integer.class);
		// Ⅱ.根据页大小计算的总的页数
		int pageSize = (Integer)jp.getArgs()[1];
		int pageNo = (Integer)jp.getArgs()[0];
		int totalPages = (totalItems + pageSize -1)/pageSize;
		if(pageNo>=totalPages)pageNo = totalPages;
		// Ⅲ.返回Pager对象
		Pager pager = new Pager();
		try {
			List data = (List)jp.proceed(new Object[] {pageNo,pageSize});
			pager.setData(data);
			pager.setTotal(totalPages);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return pager;		
	}
}
//应该是架构师写的
//程序员开始写代码
