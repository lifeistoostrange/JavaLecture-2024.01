SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS addrBook;
DROP TABLE IF EXISTS users;




/* Create Tables */

CREATE TABLE addrBook
(
	aid int NOT NULL,
	name varchar(16) DEFAULT '' NOT NULL,
	tel varchar(16),
	email varchar(32),
	birthDay date,
	uid varchar(12) DEFAULT '' NOT NULL
);


CREATE TABLE users
(
	uid varchar(12) DEFAULT '' NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);



/* Create Foreign Keys */

ALTER TABLE addrBook
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



