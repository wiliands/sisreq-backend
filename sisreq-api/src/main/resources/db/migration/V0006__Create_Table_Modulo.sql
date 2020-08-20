CREATE TABLE modulo
(
    id_modulo bigint NOT NULL DEFAULT nextval('modulo_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT modulo_pkey PRIMARY KEY (id_modulo)
);