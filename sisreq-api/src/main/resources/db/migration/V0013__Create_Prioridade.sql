CREATE SEQUENCE prioridade_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE TABLE prioridade
(
    id_prioridade bigint NOT NULL DEFAULT nextval('prioridade_seq'::regclass),
    nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    ativo boolean NOT NULL,
    cor character varying(7) COLLATE pg_catalog."default" NOT NULL,
    nivel character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT prioridade_pkey PRIMARY KEY (id_prioridade)
);