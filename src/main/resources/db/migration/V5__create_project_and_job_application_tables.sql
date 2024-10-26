create table if not exists projects (
	id bigserial not null primary key,
	project_name varchar(32)
);

create type application_status as enum ('Not Applied', 'Application Sent', 'Recruiter Call', 'Code Challenge', 'Waiting', 'Interview', 'Rejected', 'Hired!');
create table if not exists job_applications (
	id bigserial not null primary key,
	company varchar(32),
	status application_status,
	last_updated timestamptz,
	next_action timestamp
);