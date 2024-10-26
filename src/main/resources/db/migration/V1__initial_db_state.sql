create table if not exists tasks (
	id bigserial not null primary key,
	task_name varchar(256),
	creator_id bigserial references user_id
);

CREATE TABLE if not exists users (
	id bigserial not null primary key,
	name varchar(64)
);
	
