CREATE TABLE permissao
(
    id_permissao bigint NOT NULL DEFAULT nextval('permissao_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    chave character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT permissao_pkey PRIMARY KEY (id_permissao)
);