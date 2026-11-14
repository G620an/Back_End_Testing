create schema esercizi;
use esercizi;

create table Catalogo;
use Catalogo;

create table Fornitore (
    piva integer auto_increment,
    nome varchar(40) not null,
    città varchar(40) not null,
    primary key (piva)
);

create table Marca(
    id Integer auto_increment,
    nome varchar(40),
    città varchar(40),
    primary key (id)
);

create table Merce(
    codice integer auto_increment,
    nome varchar(40),
    marca Integer,
    primary key (codice),
    foreign key (marca) references Marca(id)
);

create table Fornitura(
    fornitore integer,
    merce integer,
    prezzo float(6,2) not null,
    primary key (fornitore, merce),
    foreign key (fornitore) references Fornitore(piva),
    foreign key (merce) references Merce(codice)
);