CREATE TABLE usuario
(
    id_usuario bigint NOT NULL DEFAULT nextval('usuario_seq'::regclass),
    nome character varying(100) NOT NULL,
    nome_completo character varying(100) NOT NULL,
    login character varying(20) NOT NULL,
    senha character varying(50) NOT NULL,
    administrador boolean NOT NULL,
    dt_expiracao timestamp without time zone NOT NULL,
    ativo boolean NOT NULL,
    CONSTRAINT usuario_pkey PRIMARY KEY (id_usuario)
);