create type task_status as enum ('Not Started', 'In Progress', 'Completed');
alter table tasks add column status task_status;
alter table tasks add column priority int;