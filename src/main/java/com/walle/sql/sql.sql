# 创建数据库
CREATE DATABASE girl
  DEFAULT CHARSET = UTF8;

#创建女孩表
CREATE TABLE girl (
  id      INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name    VARCHAR(12)     NOT NULL,
  cupSize VARCHAR(1)      NOT NULL,
  age     INT             NOT NULL
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = UTF8
  COMMENT ='女孩库';
#创建班级
CREATE TABLE klass (
  id   INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name VARCHAR(12)     NOT NULL
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = UTF8
  COMMENT ='班级表';

#给班级添加数据
INSERT INTO klass VALUES (1, '一年级2班');
#创建学生表
CREATE TABLE student (
  id     INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  name   VARCHAR(12)     NOT NULL,
  gender CHAR            NOT NULL,
  age    INT             NOT NULL,
  kid    INT             NOT NULL
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = UTF8
  COMMENT ='学生表';

#给班级添加学生
INSERT INTO student VALUES (1, '小明', '男', 12, 1);
INSERT INTO student VALUES (2, '小黄', '男', 8, 1);
INSERT INTO student VALUES (3, '晓丽', '女', 9, 1);
INSERT INTO student VALUES (4, '积木', '男', 10, 1);
INSERT INTO student VALUES (5, '路西', '女', 12, 1);