SELECT * FROM task;
insert into reg  values("kutty","stark","kuttystarkk001@gmail.com"),("kandha","kandha","kandhasamyk001@gmail.com");

use abc;
create table task (
name varchar(30),
dob date,
gender varchar(14),
mobile long  ,
email varchar(26) 
);
drop table task;
select * from task;
alter table task
modify dob int unique;
