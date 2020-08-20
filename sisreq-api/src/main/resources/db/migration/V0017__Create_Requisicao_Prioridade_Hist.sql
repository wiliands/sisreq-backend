CREATE SEQUENCE requisicao_prioridade_hist_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE TABLE requisicao_prioridade_hist
(
    id_requisicao_prioridade_hist bigint NOT NULL DEFAULT nextval('requisicao_prioridade_hist_seq'::regclass),
    dt_historico timestamp without time zone NOT NULL,
    ativo boolean NOT NULL,
    id_requisicao bigint NOT NULL,
    id_prioridade bigint NOT NULL,
    id_usuario bigint NOT NULL,
    CONSTRAINT requisicao_prioridade_hist_pkey PRIMARY KEY (id_requisicao_prioridade_hist),
    CONSTRAINT fk_rprih_prioridade FOREIGN KEY (id_prioridade)
        REFERENCES prioridade (id_prioridade) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_rprih_requisicao FOREIGN KEY (id_requisicao)
        REFERENCES requisicao (id_requisicao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_rprih_usuario FOREIGN KEY (id_usuario)
        REFERENCES usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);