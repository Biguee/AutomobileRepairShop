DROP TABLE IF EXISTS clients;

CREATE TABLE clients(
  ID BIGSERIAL NOT NULL,
  NAME TEXT NOT NULL ,
  SURNAME TEXT NOT NULL,
  NIP TEXT NOT NULL
);

DROP TABLE IF EXISTS parts;

CREATE TABLE parts(
  ID BIGSERIAL NOT NULL ,
  PART_NAME TEXT NOT NULL,
  PART_NUMBER TEXT NOT NULL ,
  price_wholesale FLOAT,
  price_retail FLOAT
);

DROP TABLE IF EXISTS repairs;

CREATE TABLE repairs(
  ID BIGSERIAL NOT NULL ,
  repair_name TEXT NOT NULL,
  repair_cost FLOAT,
  repair_Time INTEGER
);

INSERT INTO repairs (repair_name, repair_cost, repair_Time) VALUES ('hamulce', 100, 2);



