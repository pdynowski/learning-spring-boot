alter table tasks alter column status TYPE varchar(32);
drop type if exists task_status;