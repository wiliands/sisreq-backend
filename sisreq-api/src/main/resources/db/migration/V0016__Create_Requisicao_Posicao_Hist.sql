CREATE SEQUENCE requisicao_posicao_hist_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1;
    
CREATE TABLE requisicao_posicao_hist
(
    id_requisicao_posicao_hist bigint NOT NULL DEFAULT nextval('requisicao_posicao_hist_seq'::regclass),
    dt_historico timestamp without time zone NOT NULL,
    id_requisicao bigint NOT NULL,
    id_posicao bigint NOT NULL,
    id_usuario bigint NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT requisicao_posicao_hist_pkey PRIMARY KEY (id_requisicao_posicao_hist),
    CONSTRAINT fk_rph_posicao FOREIGN KEY (id_posicao)
        REFERENCES posicao (id_posicao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_rph_requisicao FOREIGN KEY (id_requisicao)
        REFERENCES requisicao (id_requisicao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_rph_usuario FOREIGN KEY (id_usuario)
        REFERENCES usuario (id_usuario) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);