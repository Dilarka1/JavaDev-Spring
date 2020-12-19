DROP TABLE IF EXISTS mentors;
CREATE TABLE mentors(
id INT GENERATED ALWAYS AS IDENTITY ,
first_name varchar (40) not null,
last_name varchar (40) not null,
primary key (id)
);

DROP TABLE IF EXISTS mentor_audit;
CREATE TABLE mentor_audit(
id INT GENERATED ALWAYS AS IDENTITY,
mentor_id INT not null,
last_name varchar (40) not null,
changed_on timestamp (6) not null,
primary key(id)
);

insert into mentors(first_name, last_name) values ('Mickey', 'Mouse');
insert into mentors (first_name, last_name) values ('Donald', 'Duck');
insert into mentors (first_name, last_name) values ('Minnie', 'Mouse');

CREATE OR REPLACE FUNCTION log_last_name_changes()
returns trigger
language plpgsql
as
$$
begin
IF NEW.last_name <> OLD.last_name THEN
INSERT INTO mentor_audit(mentor_id, last_name, changed_on) VALUES
(OLD.id, OLD.last_name, now());
end if;

RETURN new;
end;
$$

CREATE TRIGGER last_name_change
BEFORE update
ON mentors
FOR EACH ROW
EXECUTE PROCEDURE log_last_name_changes();

UPDATE mentors
SET last_name='Goofy'
where id=2;

drop trigger if exists last_name_changes2 ON mentors;

