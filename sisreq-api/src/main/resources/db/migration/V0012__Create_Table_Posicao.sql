CREATE TABLE posicao
(
    id_posicao bigint NOT NULL DEFAULT nextval('posicao_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT posicao_pkey PRIMARY KEY (id_posicao)
);