CREATE SEQUENCE requisicao_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE TABLE requisicao
(
    id_requisicao bigint NOT NULL DEFAULT nextval('requisicao_seq'::regclass),
    solicitante character varying(100) COLLATE pg_catalog."default" NOT NULL,
    dt_solicitacao timestamp without time zone NOT NULL,
    descricao text COLLATE pg_catalog."default" NOT NULL,
    observacao text COLLATE pg_catalog."default",
    versao character varying(100) COLLATE pg_catalog."default" NOT NULL,
    dt_conclusao timestamp without time zone,
    ativo boolean NOT NULL,
    concluido boolean NOT NULL,
    id_modulo bigint NOT NULL,
    id_usuario_abertura bigint NOT NULL,
    id_empresa bigint NOT NULL,
    id_usuario_conclusao bigint,
    id_posicao bigint NOT NULL,
    CONSTRAINT requisicao_pkey PRIMARY KEY (id_requisicao),
    CONSTRAINT fk_req_empresa FOREIGN KEY (id_empresa)
        REFERENCES empresa (id_empresa) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_req_modulo FOREIGN KEY (id_modulo)
        REFERENCES modulo (id_modulo) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_req_posicao FOREIGN KEY (id_posicao)
        REFERENCES posicao (id_posicao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_req_usuario_abertura FOREIGN KEY (id_usuario_abertura)
        REFERENCES usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_req_usuario_conclusao FOREIGN KEY (id_usuario_conclusao)
        REFERENCES usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);