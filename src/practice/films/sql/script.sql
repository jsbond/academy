create database site default character set utf8 DEFAULT COLLATE utf8_general_ci;

use site;

CREATE TABLE `users` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) not NULL ,
  `login` VARCHAR(30) not NULL ,
  `password` VARCHAR(30) not NULL ,
  PRIMARY KEY (`id`)
)
  ENGINE = innoDB
  DEFAULT CHAR SET = utf8;

CREATE TABLE `categories` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) not NULL ,
  PRIMARY KEY (`id`)
)
  ENGINE = innoDB
  DEFAULT CHAR SET = utf8;

CREATE TABLE `movies` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) not NULL ,
  `description` VARCHAR(300) not NULL ,
  `rating` INTEGER not NULL ,
  PRIMARY KEY (`id`)
)
  ENGINE = innoDB
  DEFAULT CHAR SET = utf8;

CREATE TABLE `movies_categories` (
  `movie_id` bigint(20) not NULL,
  `category_id` bigint(20) NOT NULL,
  CONSTRAINT `movies_movies_categories` FOREIGN KEY (`movie_id`) REFERENCES `movies` (`id`),
  CONSTRAINT `categories_movies_categories` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`),
  PRIMARY KEY (`movie_id`, `category_id`)
)
  ENGINE = innoDB
  DEFAULT CHAR SET = utf8;

INSERT INTO `movies` (name, description, rating)
VALUES('Город грехов', 'это город грехов', 100),
  ('5 элемент', 'ну тоже норм', 50);

INSERT INTO `categories`
(name)
VALUES
  ('Ужасы'),
  ('Романтика'),
  ('Боевик'),
  ('Фантастика'),
  ('Триллер')
;

INSERT INTO `movies_categories`
(movie_id, category_id)
VALUES
  (1, 3),
  (1, 5),
  (2, 3),
  (2, 4)
;

INSERT INTO `users`
(name, login, password)
VALUES
  ('Антон', 'anton@mail.ru', 'olala'),
  ('Петя', 'petya@gmail.com', '111'),
  ('Вася', 'vasya@gmail.com', '222'),
  ('Ольга', 'olga@gmail.com', '333')
;



