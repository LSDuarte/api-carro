
create database api
use api

create table api.dbo.carro (
	[id] [bigint] Identity NOT NULL,
	[nome] [Varchar] (255),
	[descricao] [Varchar] (255),
	[url_foto] [Varchar] (255),
	[url_video] [Varchar] (255),
	[latitude] [Varchar] (255),
	[longitude] [Varchar] (255),
	[tipo] [Varchar] (255),	
	PRIMARY KEY ([id]) )
