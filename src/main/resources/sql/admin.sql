-- database
DROP DATABASE IF EXISTS garage;
CREATE DATABASE garage;

-- user
DROP USER IF EXISTS mechanic;
CREATE USER mechanic WITH PASSWORD 'mechanic';

-- privileges
GRANT ALL PRIVILEGES ON DATABASE garage TO mechanic;
GRANT USAGE ON SCHEMA public TO mechanic;
ALTER USER mechanic WITH SUPERUSER;