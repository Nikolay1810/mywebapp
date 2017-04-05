DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS Role;

CREATE TABLE users
(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(15),
  lastname VARCHAR(20),
  city VARCHAR(30),
  email VARCHAR(25) UNIQUE,
  password VARCHAR(30),
  enubled INTEGER
);

INSERT INTO users VALUES (NULL, 'nick', 'dalas', 'dnipro', 'user@gmail.com', '11111', 1);
INSERT INTO users VALUES (NULL, 'angela', 'hike', 'kyiv', 'ang@yahoo.com', '12345', 0);

CREATE  TABLE role
{
id INTEGER PRIMARY KEY AUTO_INCREMENT,
roleId INTEGER,
userId INTEGER,
FOREIGN KEY (userId) REFERENCES users(id);
};

INSERT INTO role VALUES (1, 1, 1);
INSERT INTO role VALUES (2);
INSERT INTO role VALUES (3);