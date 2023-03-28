create schema m06uf4ac1;
use m06uf4ac1;

create table usuari (
                        id int auto_increment primary key,
                        email varchar(100),
                        password varchar(100),
                        address varchar(100),
                        address2 varchar(100),
                        city varchar(100),
                        province varchar(100),
                        zip varchar(50),
                        student varchar(2),
                        time date
);

insert into usuari (email, password, address, address2, city, province, zip, student, time) values
                                                                                                ('test@test.com','123','Address example 1','numero 3 entresuelo','Barcelona','Barcelona','08006','on',now()),
                                                                                                ('test2@test.com','123','Address example 2','numero 33 1a','Lleida','Lleida','08956',null,now());