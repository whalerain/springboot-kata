use `spring-boot-kata`;

CREATE TABLE `sys_user` (
    `user_id`         int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username`        varchar(1024)    NOT NULL unique,
    `password_encoded` varchar(1024)   NOT NULL,
    `age`             int(3)           NOT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB
DEFAULT CHARSET = utf8mb4;

insert into sys_user values (1,'Felordcn','{noop}12345',18);