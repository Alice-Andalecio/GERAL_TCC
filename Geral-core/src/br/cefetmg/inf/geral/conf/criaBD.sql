--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.9
-- Dumped by pg_dump version 9.5.9

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: alimento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE alimento (
    cod_alimento integer NOT NULL,
    des_alimento text NOT NULL
);


ALTER TABLE alimento OWNER TO postgres;

--
-- Name: animal; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE animal (
    seq_animal integer NOT NULL,
    cod_grupo integer,
    cod_email character(50) NOT NULL,
    nro_animal character(5) NOT NULL,
    dat_nascimento date,
    idt_tipo character(1),
    idt_status character(50),
    pelagem character varying(25),
    peso integer,
    idade integer,
    nom_animal character varying(30),
    num_sisbov integer,
    desmama date,
    aptidao date,
    num_pai integer,
    num_mae integer,
    entrada date,
    brinco_eletronico integer,
    raca_pura character(30),
    raca_mestica_1 character(30),
    raca_mestica_2 character(30),
    porcentagem_1 integer,
    porcentagem_2 integer,
    nome_pai character(50),
    nome_mae character(30)
);


ALTER TABLE animal OWNER TO postgres;

--
-- Name: animal_medicamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE animal_medicamento (
    seq_animal integer NOT NULL,
    cod_email character(50) NOT NULL,
    seq_medicamento integer NOT NULL,
    cod_medicamento integer,
    dat_inicio date NOT NULL,
    dat_fim date NOT NULL,
    txt_prescricao text NOT NULL,
    qtd_dosagem numeric(7,2),
    qtd_frequencia integer
);


ALTER TABLE animal_medicamento OWNER TO postgres;

--
-- Name: animal_medicamento_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE animal_medicamento_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animal_medicamento_seq_animal_seq OWNER TO postgres;

--
-- Name: animal_medicamento_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE animal_medicamento_seq_animal_seq OWNED BY animal_medicamento.seq_animal;


--
-- Name: animal_medicamento_seq_medicamento_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE animal_medicamento_seq_medicamento_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animal_medicamento_seq_medicamento_seq OWNER TO postgres;

--
-- Name: animal_medicamento_seq_medicamento_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE animal_medicamento_seq_medicamento_seq OWNED BY animal_medicamento.seq_medicamento;


--
-- Name: animal_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE animal_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animal_seq_animal_seq OWNER TO postgres;

--
-- Name: animal_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE animal_seq_animal_seq OWNED BY animal.seq_animal;


--
-- Name: animal_vacina; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE animal_vacina (
    seq_animal integer NOT NULL,
    cod_vacina integer NOT NULL,
    cod_email character(50) NOT NULL,
    seq_vacina integer NOT NULL,
    dat_vacinacao date
);


ALTER TABLE animal_vacina OWNER TO postgres;

--
-- Name: animal_vacina_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE animal_vacina_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animal_vacina_seq_animal_seq OWNER TO postgres;

--
-- Name: animal_vacina_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE animal_vacina_seq_animal_seq OWNED BY animal_vacina.seq_animal;


--
-- Name: animal_vacina_seq_vacina_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE animal_vacina_seq_vacina_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE animal_vacina_seq_vacina_seq OWNER TO postgres;

--
-- Name: animal_vacina_seq_vacina_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE animal_vacina_seq_vacina_seq OWNED BY animal_vacina.seq_vacina;


--
-- Name: comprador; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE comprador (
    cod_cnpj integer NOT NULL,
    nom_comprador character(40) NOT NULL
);


ALTER TABLE comprador OWNER TO postgres;

--
-- Name: controle_producao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE controle_producao (
    seq_compra integer NOT NULL,
    seq_animal integer NOT NULL,
    dat_producao date NOT NULL,
    cod_email character(50) NOT NULL
);


ALTER TABLE controle_producao OWNER TO postgres;

--
-- Name: controle_producao_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE controle_producao_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE controle_producao_seq_animal_seq OWNER TO postgres;

--
-- Name: controle_producao_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE controle_producao_seq_animal_seq OWNED BY controle_producao.seq_animal;


--
-- Name: controle_producao_seq_compra_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE controle_producao_seq_compra_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE controle_producao_seq_compra_seq OWNER TO postgres;

--
-- Name: controle_producao_seq_compra_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE controle_producao_seq_compra_seq OWNED BY controle_producao.seq_compra;


--
-- Name: grupo; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE grupo (
    cod_grupo integer NOT NULL,
    nom_grupo character(20) NOT NULL,
    "qtd_media_produção" numeric(3,2)
);


ALTER TABLE grupo OWNER TO postgres;

--
-- Name: grupo_alimento_dieta; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE grupo_alimento_dieta (
    cod_grupo integer NOT NULL,
    alimento integer NOT NULL,
    per_composicao numeric(5,2) NOT NULL
);


ALTER TABLE grupo_alimento_dieta OWNER TO postgres;

--
-- Name: historico_localizacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE historico_localizacao (
    seq_animal integer NOT NULL,
    cod_email character(50) NOT NULL,
    dat_inicio_localizacao date NOT NULL,
    cod_setor integer
);


ALTER TABLE historico_localizacao OWNER TO postgres;

--
-- Name: historico_localizacao_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE historico_localizacao_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE historico_localizacao_seq_animal_seq OWNER TO postgres;

--
-- Name: historico_localizacao_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE historico_localizacao_seq_animal_seq OWNED BY historico_localizacao.seq_animal;


--
-- Name: seq_medicamento; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE seq_medicamento
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE seq_medicamento OWNER TO postgres;

--
-- Name: medicamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE medicamento (
    cod_medicamento integer DEFAULT nextval('seq_medicamento'::regclass) NOT NULL,
    des_medicamento character(20) NOT NULL,
    nom_medicamento text NOT NULL
);


ALTER TABLE medicamento OWNER TO postgres;

--
-- Name: parametro; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE parametro (
    cod_parametro character(1) NOT NULL,
    qtd_dia_secagem integer NOT NULL,
    qtd_dia_amamentacao integer NOT NULL
);


ALTER TABLE parametro OWNER TO postgres;

--
-- Name: problema_padrao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE problema_padrao (
    cod_problema character(20) NOT NULL,
    des_problema text NOT NULL
);


ALTER TABLE problema_padrao OWNER TO postgres;

--
-- Name: procedencia; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE procedencia (
    seq_procedencia integer NOT NULL,
    nom_fazenda character(20) NOT NULL,
    nom_proprietario character(40) NOT NULL,
    idt_proprietario character(20)
);


ALTER TABLE procedencia OWNER TO postgres;

--
-- Name: producao_compra; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE producao_compra (
    seq_compra integer NOT NULL,
    cod_cnpj integer NOT NULL,
    cod_problema character(20),
    txt_observacao character varying(200)
);


ALTER TABLE producao_compra OWNER TO postgres;

--
-- Name: producao_compra_seq_compra_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE producao_compra_seq_compra_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE producao_compra_seq_compra_seq OWNER TO postgres;

--
-- Name: producao_compra_seq_compra_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE producao_compra_seq_compra_seq OWNED BY producao_compra.seq_compra;


--
-- Name: producao_leite; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE producao_leite (
    seq_animal integer NOT NULL,
    cod_email character(50) NOT NULL,
    dat_producao date NOT NULL,
    cod_grupo integer NOT NULL,
    qtd_leite_manha numeric(3,2) DEFAULT 0 NOT NULL,
    qtd_leite_tarde numeric(3,2) DEFAULT 0 NOT NULL
);


ALTER TABLE producao_leite OWNER TO postgres;

--
-- Name: producao_leite_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE producao_leite_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE producao_leite_seq_animal_seq OWNER TO postgres;

--
-- Name: producao_leite_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE producao_leite_seq_animal_seq OWNED BY producao_leite.seq_animal;


--
-- Name: rep_parto; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE rep_parto (
    "seq_ReproducaoParto" integer[],
    "nro_Animal" integer,
    "nom_Animal" character(1),
    padrao character(1),
    doadora character(1),
    receptora character(1),
    descarte character(1),
    "perParto1" date,
    "perParto2" date,
    "diasGest" integer,
    tipo character(1),
    retencao integer,
    "dataParto" date,
    "horaParto" time with time zone,
    "tipoParto" character(1),
    grau character(1),
    "numCrias" integer,
    "numCria1" character(1),
    pelagem1 character(1),
    peso1 character(1),
    sexo1 character(1),
    "numCria2" character(1),
    pelagem2 character(1),
    peso2 character(1),
    sexo2 character(1)
);


ALTER TABLE rep_parto OWNER TO postgres;

--
-- Name: reproducao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE reproducao (
    seq_reproducao integer NOT NULL,
    seq_animal_gestante integer NOT NULL,
    seq_animal integer NOT NULL,
    dat_inseminacao date NOT NULL,
    hora_inseminacao time without time zone,
    dat_gestacao date NOT NULL,
    cod_email character(50)
);


ALTER TABLE reproducao OWNER TO postgres;

--
-- Name: reproducao_seq_animal_gestante_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE reproducao_seq_animal_gestante_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE reproducao_seq_animal_gestante_seq OWNER TO postgres;

--
-- Name: reproducao_seq_animal_gestante_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE reproducao_seq_animal_gestante_seq OWNED BY reproducao.seq_animal_gestante;


--
-- Name: reproducao_seq_animal_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE reproducao_seq_animal_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE reproducao_seq_animal_seq OWNER TO postgres;

--
-- Name: reproducao_seq_animal_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE reproducao_seq_animal_seq OWNED BY reproducao.seq_animal;


--
-- Name: reproducao_seq_reproducao_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE reproducao_seq_reproducao_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE reproducao_seq_reproducao_seq OWNER TO postgres;

--
-- Name: reproducao_seq_reproducao_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE reproducao_seq_reproducao_seq OWNED BY reproducao.seq_reproducao;


--
-- Name: setor; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE setor (
    cod_setor integer NOT NULL,
    nom_setor character(40)
);


ALTER TABLE setor OWNER TO postgres;

--
-- Name: usuario_id_usuario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE usuario_id_usuario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE usuario_id_usuario_seq OWNER TO postgres;

--
-- Name: usuario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE usuario (
    cod_email character(50) NOT NULL,
    txt_senha text NOT NULL,
    nom_usuario character varying(100) NOT NULL,
    id_usuario integer DEFAULT nextval('usuario_id_usuario_seq'::regclass) NOT NULL,
    email_verificado boolean DEFAULT false,
    codigo_validacao integer
);


ALTER TABLE usuario OWNER TO postgres;

--
-- Name: vacina; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE vacina (
    cod_vacina integer NOT NULL,
    nom_vacina character(20) NOT NULL,
    qtd_doses integer
);


ALTER TABLE vacina OWNER TO postgres;

--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal ALTER COLUMN seq_animal SET DEFAULT nextval('animal_seq_animal_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_medicamento ALTER COLUMN seq_animal SET DEFAULT nextval('animal_medicamento_seq_animal_seq'::regclass);


--
-- Name: seq_medicamento; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_medicamento ALTER COLUMN seq_medicamento SET DEFAULT nextval('animal_medicamento_seq_medicamento_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_vacina ALTER COLUMN seq_animal SET DEFAULT nextval('animal_vacina_seq_animal_seq'::regclass);


--
-- Name: seq_vacina; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_vacina ALTER COLUMN seq_vacina SET DEFAULT nextval('animal_vacina_seq_vacina_seq'::regclass);


--
-- Name: seq_compra; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY controle_producao ALTER COLUMN seq_compra SET DEFAULT nextval('controle_producao_seq_compra_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY controle_producao ALTER COLUMN seq_animal SET DEFAULT nextval('controle_producao_seq_animal_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_localizacao ALTER COLUMN seq_animal SET DEFAULT nextval('historico_localizacao_seq_animal_seq'::regclass);


--
-- Name: seq_compra; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_compra ALTER COLUMN seq_compra SET DEFAULT nextval('producao_compra_seq_compra_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_leite ALTER COLUMN seq_animal SET DEFAULT nextval('producao_leite_seq_animal_seq'::regclass);


--
-- Name: seq_reproducao; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao ALTER COLUMN seq_reproducao SET DEFAULT nextval('reproducao_seq_reproducao_seq'::regclass);


--
-- Name: seq_animal_gestante; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao ALTER COLUMN seq_animal_gestante SET DEFAULT nextval('reproducao_seq_animal_gestante_seq'::regclass);


--
-- Name: seq_animal; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao ALTER COLUMN seq_animal SET DEFAULT nextval('reproducao_seq_animal_seq'::regclass);


--
-- Data for Name: alimento; Type: TABLE DATA; Schema: public; Owner: postgres
--

--
-- Data for Name: animal; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: animal_medicamento; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: animal_medicamento_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('animal_medicamento_seq_animal_seq', 1, false);


--
-- Name: animal_medicamento_seq_medicamento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('animal_medicamento_seq_medicamento_seq', 1, false);


--
-- Name: animal_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('animal_seq_animal_seq', 9, true);


--
-- Data for Name: animal_vacina; Type: TABLE DATA; Schema: public; Owner: postgres
--


--
-- Name: animal_vacina_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('animal_vacina_seq_animal_seq', 1, false);


--
-- Name: animal_vacina_seq_vacina_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('animal_vacina_seq_vacina_seq', 1, false);


--
-- Data for Name: comprador; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: controle_producao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: controle_producao_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('controle_producao_seq_animal_seq', 1, false);


--
-- Name: controle_producao_seq_compra_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('controle_producao_seq_compra_seq', 1, false);


--
-- Data for Name: grupo; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Data for Name: grupo_alimento_dieta; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: historico_localizacao; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: historico_localizacao_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('historico_localizacao_seq_animal_seq', 1, false);


--
-- Data for Name: medicamento; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: parametro; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: problema_padrao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: procedencia; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: producao_compra; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: producao_compra_seq_compra_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('producao_compra_seq_compra_seq', 1, false);


--
-- Data for Name: producao_leite; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: producao_leite_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('producao_leite_seq_animal_seq', 1, false);


--
-- Data for Name: rep_parto; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: reproducao; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Name: reproducao_seq_animal_gestante_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('reproducao_seq_animal_gestante_seq', 1, false);


--
-- Name: reproducao_seq_animal_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('reproducao_seq_animal_seq', 1, false);


--
-- Name: reproducao_seq_reproducao_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('reproducao_seq_reproducao_seq', 1, false);


--
-- Name: seq_medicamento; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('seq_medicamento', 3, true);


--
-- Data for Name: setor; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- Data for Name: usuario; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: usuario_id_usuario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('usuario_id_usuario_seq', 29, true);


--
-- Data for Name: vacina; Type: TABLE DATA; Schema: public; Owner: postgres
--




--
-- Name: alimento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY alimento
    ADD CONSTRAINT alimento_pkey PRIMARY KEY (cod_alimento);


--
-- Name: animal_medicamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_medicamento
    ADD CONSTRAINT animal_medicamento_pkey PRIMARY KEY (seq_medicamento, seq_animal, cod_email);


--
-- Name: animal_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal
    ADD CONSTRAINT animal_pkey PRIMARY KEY (seq_animal, cod_email);


--
-- Name: animal_vacina_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_vacina
    ADD CONSTRAINT animal_vacina_pkey PRIMARY KEY (seq_vacina, seq_animal, cod_vacina, cod_email);


--
-- Name: comprador_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY comprador
    ADD CONSTRAINT comprador_pkey PRIMARY KEY (cod_cnpj);


--
-- Name: controle_producao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY controle_producao
    ADD CONSTRAINT controle_producao_pkey PRIMARY KEY (dat_producao, seq_animal, seq_compra, cod_email);


--
-- Name: grupo_alimento_dieta_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grupo_alimento_dieta
    ADD CONSTRAINT grupo_alimento_dieta_pkey PRIMARY KEY (cod_grupo, alimento);


--
-- Name: grupo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grupo
    ADD CONSTRAINT grupo_pkey PRIMARY KEY (cod_grupo);


--
-- Name: historico_localizacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_localizacao
    ADD CONSTRAINT historico_localizacao_pkey PRIMARY KEY (dat_inicio_localizacao, seq_animal, cod_email);


--
-- Name: medicamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY medicamento
    ADD CONSTRAINT medicamento_pkey PRIMARY KEY (cod_medicamento);


--
-- Name: parametro_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY parametro
    ADD CONSTRAINT parametro_pkey PRIMARY KEY (cod_parametro);


--
-- Name: problema_padrao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY problema_padrao
    ADD CONSTRAINT problema_padrao_pkey PRIMARY KEY (cod_problema);


--
-- Name: procedencia_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY procedencia
    ADD CONSTRAINT procedencia_pkey PRIMARY KEY (seq_procedencia);


--
-- Name: producao_compra_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_compra
    ADD CONSTRAINT producao_compra_pkey PRIMARY KEY (seq_compra);


--
-- Name: producao_leite_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_leite
    ADD CONSTRAINT producao_leite_pkey PRIMARY KEY (dat_producao, seq_animal, cod_email);


--
-- Name: reproducao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao
    ADD CONSTRAINT reproducao_pkey PRIMARY KEY (seq_reproducao);


--
-- Name: setor_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY setor
    ADD CONSTRAINT setor_pkey PRIMARY KEY (cod_setor);


--
-- Name: usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY usuario
    ADD CONSTRAINT usuario_pkey PRIMARY KEY (cod_email);


--
-- Name: vacina_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY vacina
    ADD CONSTRAINT vacina_pkey PRIMARY KEY (cod_vacina);


--
-- Name: ix_relationship15; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship15 ON animal_medicamento USING btree (cod_medicamento);


--
-- Name: ix_relationship16; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship16 ON producao_leite USING btree (cod_grupo);


--
-- Name: ix_relationship2; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship2 ON animal USING btree (cod_grupo);


--
-- Name: ix_relationship20; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship20 ON reproducao USING btree (seq_animal_gestante, cod_email);


--
-- Name: ix_relationship21; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship21 ON reproducao USING btree (seq_animal, cod_email);


--
-- Name: ix_relationship27; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship27 ON producao_compra USING btree (cod_cnpj);


--
-- Name: ix_relationship28; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship28 ON producao_compra USING btree (cod_problema);


--
-- Name: ix_relationship31; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship31 ON animal USING btree (cod_email);


--
-- Name: ix_relationship7; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX ix_relationship7 ON historico_localizacao USING btree (cod_setor);


--
-- Name: relationship10; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grupo_alimento_dieta
    ADD CONSTRAINT relationship10 FOREIGN KEY (alimento) REFERENCES alimento(cod_alimento) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship14; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_medicamento
    ADD CONSTRAINT relationship14 FOREIGN KEY (seq_animal, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship15; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_medicamento
    ADD CONSTRAINT relationship15 FOREIGN KEY (cod_medicamento) REFERENCES medicamento(cod_medicamento) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship16; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_leite
    ADD CONSTRAINT relationship16 FOREIGN KEY (cod_grupo) REFERENCES grupo(cod_grupo) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship2; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal
    ADD CONSTRAINT relationship2 FOREIGN KEY (cod_grupo) REFERENCES grupo(cod_grupo) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship20; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao
    ADD CONSTRAINT relationship20 FOREIGN KEY (seq_animal_gestante, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship21; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY reproducao
    ADD CONSTRAINT relationship21 FOREIGN KEY (seq_animal, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship22; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_localizacao
    ADD CONSTRAINT relationship22 FOREIGN KEY (seq_animal, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship23; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_vacina
    ADD CONSTRAINT relationship23 FOREIGN KEY (seq_animal, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship24; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal_vacina
    ADD CONSTRAINT relationship24 FOREIGN KEY (cod_vacina) REFERENCES vacina(cod_vacina) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship25; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_leite
    ADD CONSTRAINT relationship25 FOREIGN KEY (seq_animal, cod_email) REFERENCES animal(seq_animal, cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship26; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY controle_producao
    ADD CONSTRAINT relationship26 FOREIGN KEY (seq_animal, cod_email, dat_producao) REFERENCES producao_leite(seq_animal, cod_email, dat_producao) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship27; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_compra
    ADD CONSTRAINT relationship27 FOREIGN KEY (cod_cnpj) REFERENCES comprador(cod_cnpj) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship28; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY producao_compra
    ADD CONSTRAINT relationship28 FOREIGN KEY (cod_problema) REFERENCES problema_padrao(cod_problema) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship29; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY controle_producao
    ADD CONSTRAINT relationship29 FOREIGN KEY (seq_compra) REFERENCES producao_compra(seq_compra) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship31; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal
    ADD CONSTRAINT relationship31 FOREIGN KEY (cod_email) REFERENCES usuario(cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship33; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY animal
    ADD CONSTRAINT relationship33 FOREIGN KEY (cod_email) REFERENCES usuario(cod_email) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship7; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY historico_localizacao
    ADD CONSTRAINT relationship7 FOREIGN KEY (cod_setor) REFERENCES setor(cod_setor) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: relationship9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY grupo_alimento_dieta
    ADD CONSTRAINT relationship9 FOREIGN KEY (cod_grupo) REFERENCES grupo(cod_grupo) ON UPDATE RESTRICT ON DELETE RESTRICT;


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

