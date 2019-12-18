create table `user` (
    `id` int(11) unsigned not null auto_increment comment '用户ID',
    `login_name` varchar(225) not null comment '登录名称',
    `user_name` varchar(225) not null comment '用户名称',
    `password` varchar(500) not null comment '用户加密密码',
    `status` tinyint(2) unsigned not null default 0 comment '',
    `is_deleted` tinyint(1) unsigned not null default 0 comment '是否已逻辑删除',
    primary key (`id`)
) engine = innodb default charset = utf8mb4;