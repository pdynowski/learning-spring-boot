create table if not exists statuses (
	id bigserial not null primary key,
	name varchar(32)
);

create table if not exists projects_statuses (
	id bigserial not null primary key,
	project_id integer references projects,
	status_id integer references statuses,
	column_order integer not null
);