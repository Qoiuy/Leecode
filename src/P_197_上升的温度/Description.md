
sql

查出来 今天和昨天的数据 合并 做成一个中间表？

或者
select 今天 on select 昨天 都有数据

或者 join 能显示两天的数据 然后进行查询


google 搜索 mysql left join自己
select * from t_user t1  left join (select * from t_user) t2 on t1.id=1 and t2.id=2


+---------+------------------+------------------+
| Id(INT) | RecordDate(DATE) | Temperature(INT) |
+---------+------------------+------------------+
|       1 |       2015-01-01 |               10 |
|       2 |       2015-01-02 |               25 |
|       3 |       2015-01-03 |               20 |
|       4 |       2015-01-04 |               30 |
+---------+------------------+------------------+




select w1.id from Weather w1 left join (select * from Weather ) w2 on w2.RecordDate = date_sub(w1.RecordDate,interval 1 day) where w1.Temperature > w2.Temperature

mysql date_sub('2016-08-01',interval 1 day)  获取上一天 测试可以使用

mysql DATE转换 date 转 时间戳 ，再转回 date



----
CREATE TABLE `Weather` (
  `Id` int(11) NOT NULL,
  `RecordDate` datetime NOT NULL,
  `Temperature` int(255) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `test`.`weather`(`Id`, `RecordDate`, `Temperature`) VALUES (1, '2015-01-01 00:00:00', 10);
INSERT INTO `test`.`weather`(`Id`, `RecordDate`, `Temperature`) VALUES (2, '2015-01-02 00:00:00', 25);
INSERT INTO `test`.`weather`(`Id`, `RecordDate`, `Temperature`) VALUES (3, '2015-01-03 00:00:00', 20);
INSERT INTO `test`.`weather`(`Id`, `RecordDate`, `Temperature`) VALUES (4, '2015-01-04 00:00:00', 30);