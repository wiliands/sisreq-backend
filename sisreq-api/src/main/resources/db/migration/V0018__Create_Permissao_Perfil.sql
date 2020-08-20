CREATE TABLE permissao_perfil
(
    id_permissao bigint NOT NULL,
    id_perfil bigint NOT NULL,
    CONSTRAINT permissao_perfil_pkey PRIMARY KEY (id_permissao, id_perfil),
    CONSTRAINT fk_pp_perfil FOREIGN KEY (id_perfil)
        REFERENCES perfil (id_perfil) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk_pp_permissao FOREIGN KEY (id_permissao)
        REFERENCES permissao (id_permissao) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
);