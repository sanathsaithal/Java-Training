create schema Airport;

create table Airport.airportDetails (id int primary key not null, name varchar(40), location varchar(40), runway int, noOfAirlines int);

insert into airportDetails values(1,"Mangalore International Airport","Bajpe",2,9);
insert into airportDetails values(4,"Mangalore Airport","Bajpe",2,9);
insert into airportDetails values(5,"Delhi International Airport","Bajpe",2,9);

select * from airportDetails;

select * from airportdetails group by location="bajpe";

update airportdetails set name="Chennai International airport" where id=2;

select * from airportDetails;

create table Airport.empDetails(
eid int primary key not null,
name varchar(30), 
designation varchar(20), 
experience int,
aId int,
constraint foreign key(aId) references airportDetails(id)); 

insert into airportDetails values(2,"Kempegowda Airport","bangalore",10,12);

insert into airportDetails values(3,"Chennai Airport","chennai",5,10);

select * from airportDetails;

insert into empDetails values(1,"sam","ground staff",10,1);

insert into empDetails values(2,"sanath","pailot",5,3);

insert into empdetails values(3,"suresh","manager",13,2),(4,"rama","security",5,1),(5,"raj","accountant",15,3);

select * from empdetails;

delete from empdetails where eid=5;

select * from airport.airportdetails left join empdetails on aId=id;

