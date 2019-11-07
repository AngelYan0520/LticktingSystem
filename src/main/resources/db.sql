# 建立项目数据库的表

# Module One  权限模块 [RBAC设计模式去设计表，非常灵活，扩展性好]
# airsys_user
# airsys_role
# airsys_resource

# Module Two  人资模块 [其实并没有统一的标准，就是根据实际情况设计表]
# ..
# ..

# Module Three  行政模块 [考勤管理 车辆管理 办公用品管理 ]
# ..
# ..

# 例子模块 仅有一张表
create table if not exists account(
	id int primary key auto_increment,
	name varchar(50) not null,
	balance double
);

create table if not exists user(
	id int primary key auto_increment,
	name varchar(50) not null,
	age integer
); 
insert into user(name,age) value('zhansan',18);
insert into user(name,age) value('zhansi',10);
insert into user(name,age) value('zhangwu',20);
insert into user(name,age) value('zhangliu',30);
insert into user(name,age) value('zhangqi',40);


