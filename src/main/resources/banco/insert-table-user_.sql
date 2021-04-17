
use api

select * from user_;
-- Inser User_
insert into user_(nome,email,login,senha) values ('Larissa Duarte','larissa@gmail.com','duarte','$2a$10$An71w5LZlpUFi5j6YGcio.JoNI5fIFhJ3ii6SjSX18X2o.4.u3HA.'),
												 ('Administrador','admin@gmail.com','admin','$2a$10$An71w5LZlpUFi5j6YGcio.JoNI5fIFhJ3ii6SjSX18X2o.4.u3HA.');

--drop table user_