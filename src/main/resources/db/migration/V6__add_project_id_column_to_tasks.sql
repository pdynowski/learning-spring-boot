alter table tasks add column if not exists project_id int;
alter table tasks add constraint fk_project_id foreign key (project_id) references projects (id);