CREATE SEQUENCE requisicao_contato_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE TABLE requisicao_contato
(
    id_requisicao_contato bigint NOT NULL DEFAULT nextval('requisicao_contato_seq'::regclass),
    dt_contato timestamp without time zone NOT NULL,
    ativo boolean NOT NULL,
    contato character varying(20) COLLATE pg_catalog."default",
    descricao text COLLATE pg_catalog."default",
    id_requisicao bigint NOT NULL,
    id_usuario bigint NOT NULL,
    CONSTRAINT requisicao_contato_pkey PRIMARY KEY (id_requisicao_contato),
    CONSTRAINT fk_req_cont_requisicao FOREIGN KEY (id_requisicao)
        REFERENCES requisicao (id_requisicao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_req_cont_usuario FOREIGN KEY (id_usuario)
        REFERENCES usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);