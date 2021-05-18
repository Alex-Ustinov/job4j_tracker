create table items (
    id serial primary key,
    name varchar(255)
)

insert into items(name) values ('chair');
insert into items(name) values ('table');
insert into items(name) values ('window');
insert into items(name) values ('electric');