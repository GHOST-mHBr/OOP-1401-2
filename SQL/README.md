# Working with databases and SQL

We will use MySQL as our RDBMS(Relational Database Management System)

## Steps to use MySQL in java

* download and install MySQL community server from [here](https://dev.mysql.com/downloads/mysql)
* add java MySQL connector to your project (i recommend using [Apache Maven](https://jenkov.com/tutorials/maven/maven-tutorial.html) or [Gradle](https://gradle.org/)) and connect to MySQL server from your java code using JDBC ([tutorial1](https://jenkov.com/tutorials/jdbc/index.html), [tutorial2](https://www.baeldung.com/java-connect-mysql))

## SQL queries

keep in mind that SQL queries have some rules:

* they are case insensitive
* they end with semicolons (this is necessary for MySQL i think)

### > List tables or databases

* list all tables of the selected database: `show tables;`
* list all databases: `show databases;`

### > database creation

* create database: `create [database_name]`

### > table creation

* create table inside database: `create table [table_name] (column1 datatype <property1 property2 ...>, column2 datatype <property1 property2 ...>, ...);`

Ex: `create table users (id INTEGER AUTO_INCREMENT PRIMARY KEY, name LONGTEXT, email LONGTEXT, phone_number CHAR(11))`

you can find a list of MySQL data types [here](https://www.w3schools.com/mysql/mysql_datatypes.asp).

### > database Insertion

* insert data into specified columns (other columns will be NULL): `insert into [table_name] (column1, column2, ...) values (value1, value2, value3);`

* inserting a record (all columns have values): `insert into [table_name] values (value1, value2, ...);`

Ex: `insert into users (name , age) values ('ali' , 18);`

Ex: `insert into users values (1, 'ali', 18);`

### > Selections

* select some columns: `select column1 , column2 , ... from [table_name];`

* select all columns: `select * from [table_name];`

* selection with conditions: `select * from [table_name] where condition1 AND condition2 OR condition3 ...;`

Ex: `select name from users where age < 15 or grade < 10;`

Ex: `select * from users;`

### > Database and table deletion

* delete a database: `drop database [database_name];`

* delete a table: `drop table [table_name];`

Ex: `drop database mydb;`

Ex: `drop table mytable;`

### > Data deletion

delete a record with some condition: `delete from [table_name] where [condition];`

Ex: `delete from users where age < 18;`

## Further readings

* [SQL injection vulnerability from w3school](https://www.w3schools.com/sql/sql_injection.asp)
* [SQL injection vulnerability from portswigger](https://portswigger.net/web-security/sql-injection)
* head first SQL book
* [Hibernate website](https://hibernate.org/)
* [JPA and Hibernate from baeldung.com](https://www.baeldung.com/learn-jpa-hibernate)
* [JPA from jenkov.com](https://jenkov.com/tutorials/java-persistence/index.html)
* [MySQL official website](https://www.mysql.com/)
