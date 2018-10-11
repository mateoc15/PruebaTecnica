create table ADMINISTRADOR_TABLE
(
  ID_ADMIN   NUMBER(10)         not null
    primary key,
  CONTRASENA VARCHAR2(255 char) not null,
  USUARIO    VARCHAR2(255 char) not null
    constraint UK_38OCW66D01JNUHIH2AXN3MKJ4
    unique
)
/


