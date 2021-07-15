
use api

select * from user_;

-- Inser User_
insert into user_(nome,email,login,senha) 
		values ('Larissa Duarte','larissa@gmail.com','duarte','$2a$10$An71w5LZlpUFi5j6YGcio.JoNI5fIFhJ3ii6SjSX18X2o.4.u3HA.'),
			   ('Administrador','admin@gmail.com','admin','$2a$10$An71w5LZlpUFi5j6YGcio.JoNI5fIFhJ3ii6SjSX18X2o.4.u3HA.');

insert into user_(nome,email,login,senha) values ('Larissa','larissa@gmail.com','duarte','$2a$10$HKveMsPlst41Ie2LQgpijO691lUtZ8cLfcliAO1DD9TtZxEpaEoJe');
insert into user_(nome,email,login,senha) values ('Admin','admin@gmail.com','admin','$2a$10$HKveMsPlst41Ie2LQgpijO691lUtZ8cLfcliAO1DD9TtZxEpaEoJe');
insert into user_(nome,email,login,senha) values ('User','user@gmail.com','user','$2a$10$HKveMsPlst41Ie2LQgpijO691lUtZ8cLfcliAO1DD9TtZxEpaEoJe');

--drop table user_

insert into role_(nome) values ('ROLE_USER');
insert into role_(nome) values ('ROLE_ADMIN');

insert into user_roles_(user_id,role_id) values(1, 1);
insert into user_roles_(user_id,role_id) values(2, 2);
insert into user_roles_(user_id,role_id) values(3, 1);


select * from role_;
select * from user_;
select * from user_roles_;