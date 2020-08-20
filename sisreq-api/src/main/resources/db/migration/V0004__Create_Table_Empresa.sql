CREATE TABLE empresa
(
    id_empresa bigint NOT NULL DEFAULT nextval('empresa_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    dt_expiracao timestamp without time zone NOT NULL,
    dt_cadastro timestamp without time zone NOT NULL,
    CONSTRAINT empresa_pkey PRIMARY KEY (id_empresa)
);