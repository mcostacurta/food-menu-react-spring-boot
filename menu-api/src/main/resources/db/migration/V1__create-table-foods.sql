-- DECLARE @foodDb NVARCHAR(256) = 'food';
-- IF NOT EXISTS (SELECT 1 FROM sys.databases WHERE name = @foodDb)
-- BEGIN
--     EXEC('CREATE DATABASE ' + @foodDb);
-- END;

-- USE [foodDb];
CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE foods (
  id UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  title TEXT NOT NULL, 
  price INTEGER NOT NULL,
  image TEXT
);