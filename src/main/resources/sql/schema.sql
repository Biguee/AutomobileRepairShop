DROP TABLE IF EXISTS clients;

CREATE TABLE clients(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(40) NOT NULL ,
  SURNAME VARCHAR(40) NOT NULL,
  NIP VARCHAR(15) NOT NULL
);

DROP TABLE IF EXISTS parts;

CREATE TABLE parts(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  PART_NAME TEXT NOT NULL,
  PART_NUMBER TEXT NOT NULL ,
  price_wholesale FLOAT,
  amount INTEGER NOT NULL
);

DROP TABLE IF EXISTS repairs;

CREATE TABLE repairs(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  repair_name TEXT NOT NULL,
  repair_cost FLOAT,
  repair_Time INTEGER
);

INSERT INTO repairs (repair_name, repair_cost, repair_Time) VALUES (1, 'hamulce', 100, 2);

DROP TABLE IF EXISTS employees;

CREATE TABLE employees(
  ID BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
  employee_name TEXT NOT NULL ,
  employee_surname text NOT NULL ,
  employee_salary FLOAT
);

DROP TABLE IF EXISTS stock;

DROP TABLE IF EXISTS orders;

CREATE TABLE orders(
  ID VARCHAR(30) NOT NULL ,
  client_id BIGINT,
  employee_id BIGINT,
  parts_id BIGINT,
  repairs_id BIGINT
);

INSERT INTO orders (client_id, employee_id, parts_id, repairs_id) VALUES ((SELECT id FROM clients where name='Pawel'),
                                                                          (select id from employees  where employee_salary = 4000.0),
                                                                          (select id from parts where part_number = '4567EIB'),
                                                                          (select id from repairs where repair_time = 3)
);

SELECT * FROM clients where name='Pawel';



