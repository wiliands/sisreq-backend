CREATE TABLE perfil
(
    id_perfil bigint NOT NULL DEFAULT nextval('perfil_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT perfil_pkey PRIMARY KEY (id_perfil)
);