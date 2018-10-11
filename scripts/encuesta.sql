create table ENCUESTA_TABLE
(
  ID_ENCUESTA NUMBER(10)         not null
    primary key,
  BEBIDA_PREF VARCHAR2(255 char) not null,
  EDAD        NUMBER(10)         not null,
  GENERO      VARCHAR2(255 char) not null,
  ID_PROGRAMA NUMBER(10)
    constraint FKELF8L82A2G9K87SAHXJH643HN
    references PROGRAMA_TABLE
)
/


