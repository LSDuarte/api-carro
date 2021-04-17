use api

create table api.dbo.user_ (
   [id] [bigint] Identity NOT NULL,
   [email] [Varchar] (255),
   [login] [Varchar] (255),
   [nome]  [Varchar] (255),
   [senha]  [Varchar] (255),
   PRIMARY KEY ([id]))

create table api.dbo.role_ (
   [id] [bigint] Identity NOT NULL,
   [nome]  [Varchar] (255),
   PRIMARY KEY ([id]))

create table api.dbo.user_roles_ (
   [user_id] [bigint] Identity NOT NULL,
   [role_id] [bigint] Identity NOT NULL)

 