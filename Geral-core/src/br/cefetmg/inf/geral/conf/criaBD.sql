/*
Created: 25/10/2017
Modified: 25/10/2017
Model: RE PostgreSQL 9.4
Database: PostgreSQL 9.4
*/


-- Create schemas section -------------------------------------------------

CREATE SCHEMA "public" AUTHORIZATION "postgres"
;

-- Create sequences section -------------------------------------------------

CREATE SEQUENCE "public"."animal_medicamento_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."animal_medicamento_seq_medicamento_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."animal_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."animal_vacina_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."animal_vacina_seq_vacina_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."controle_producao_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."controle_producao_seq_compra_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."historico_localizacao_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."producao_compra_seq_compra_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."producao_leite_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."reproducao_seq_animal_gestante_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."reproducao_seq_animal_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."reproducao_seq_reproducao_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

CREATE SEQUENCE "public"."usuario_id_usuario_seq"
 INCREMENT BY 1
 NO MAXVALUE
 NO MINVALUE
 CACHE 1
;

-- Create tables section -------------------------------------------------

-- Table public.alimento

CREATE TABLE "public"."alimento"(
 "cod_alimento" Integer NOT NULL,
 "des_alimento" Text NOT NULL
)
;

-- Add keys for table public.alimento

ALTER TABLE "public"."alimento" ADD CONSTRAINT "alimento_pkey" PRIMARY KEY ("cod_alimento")
;

-- Table public.animal

CREATE TABLE "public"."animal"(
 "seq_animal" Integer DEFAULT nextval('animal_seq_animal_seq'::regclass) NOT NULL,
 "cod_grupo" Integer,
 "cod_email" Character(50) NOT NULL,
 "nro_animal" Character(5) NOT NULL,
 "dat_nascimento" Date,
 "idt_tipo" Character(1),
 "idt_status" Character(50),
 "pelagem" Character varying(25),
 "peso" Integer,
 "idade" Integer,
 "nom_animal" Character varying(30),
 "num_sisbov" Integer,
 "desmama" Date,
 "aptidao" Date,
 "num_pai" Integer,
 "num_mae" Integer,
 "entrada" Date,
 "brinco_eletronico" Integer,
 "raca_pura" Character(30),
 "raca_mestica_1" Character(30),
 "raca_mestica_2" Character(30),
 "porcentagem_1" Integer,
 "porcentagem_2" Integer,
 "nome_pai" Character(50),
 "nome_mae" Character(30)
)
;

-- Create indexes for table public.animal

CREATE INDEX "ix_relationship2" ON "public"."animal" ("cod_grupo")
;

CREATE INDEX "ix_relationship31" ON "public"."animal" ("cod_email")
;

-- Add keys for table public.animal

ALTER TABLE "public"."animal" ADD CONSTRAINT "animal_pkey" PRIMARY KEY ("seq_animal","cod_email")
;

-- Table public.animal_medicamento

CREATE TABLE "public"."animal_medicamento"(
 "seq_animal" Integer DEFAULT nextval('animal_medicamento_seq_animal_seq'::regclass) NOT NULL,
 "cod_email" Character(50) NOT NULL,
 "seq_medicamento" Integer DEFAULT nextval('animal_medicamento_seq_medicamento_seq'::regclass) NOT NULL,
 "cod_medicamento" Integer,
 "dat_inicio" Date NOT NULL,
 "dat_fim" Date NOT NULL,
 "txt_prescricao" Text NOT NULL,
 "qtd_dosagem" Numeric(7,2),
 "qtd_frequencia" Integer
)
;

-- Create indexes for table public.animal_medicamento

CREATE INDEX "ix_relationship15" ON "public"."animal_medicamento" ("cod_medicamento")
;

-- Add keys for table public.animal_medicamento

ALTER TABLE "public"."animal_medicamento" ADD CONSTRAINT "animal_medicamento_pkey" PRIMARY KEY ("seq_medicamento","seq_animal","cod_email")
;

-- Table public.animal_vacina

CREATE TABLE "public"."animal_vacina"(
 "seq_animal" Integer DEFAULT nextval('animal_vacina_seq_animal_seq'::regclass) NOT NULL,
 "cod_vacina" Integer NOT NULL,
 "cod_email" Character(50) NOT NULL,
 "seq_vacina" Integer DEFAULT nextval('animal_vacina_seq_vacina_seq'::regclass) NOT NULL,
 "dat_vacinacao" Date
)
;

-- Add keys for table public.animal_vacina

ALTER TABLE "public"."animal_vacina" ADD CONSTRAINT "animal_vacina_pkey" PRIMARY KEY ("seq_vacina","seq_animal","cod_vacina","cod_email")
;

-- Table public.comprador

CREATE TABLE "public"."comprador"(
 "cod_cnpj" Integer NOT NULL,
 "nom_comprador" Character(40) NOT NULL
)
;

-- Add keys for table public.comprador

ALTER TABLE "public"."comprador" ADD CONSTRAINT "comprador_pkey" PRIMARY KEY ("cod_cnpj")
;

-- Table public.controle_producao

CREATE TABLE "public"."controle_producao"(
 "seq_compra" Integer DEFAULT nextval('controle_producao_seq_compra_seq'::regclass) NOT NULL,
 "seq_animal" Integer DEFAULT nextval('controle_producao_seq_animal_seq'::regclass) NOT NULL,
 "dat_producao" Date NOT NULL,
 "cod_email" Character(50) NOT NULL
)
;

-- Add keys for table public.controle_producao

ALTER TABLE "public"."controle_producao" ADD CONSTRAINT "controle_producao_pkey" PRIMARY KEY ("dat_producao","seq_animal","seq_compra","cod_email")
;

-- Table public.grupo

CREATE TABLE "public"."grupo"(
 "cod_grupo" Integer NOT NULL,
 "nom_grupo" Character(20) NOT NULL,
 "qtd_media_produção" Numeric(3,2)
)
;

-- Add keys for table public.grupo

ALTER TABLE "public"."grupo" ADD CONSTRAINT "grupo_pkey" PRIMARY KEY ("cod_grupo")
;

-- Table public.grupo_alimento_dieta

CREATE TABLE "public"."grupo_alimento_dieta"(
 "cod_grupo" Integer NOT NULL,
 "alimento" Integer NOT NULL,
 "per_composicao" Numeric(5,2) NOT NULL
)
;

-- Add keys for table public.grupo_alimento_dieta

ALTER TABLE "public"."grupo_alimento_dieta" ADD CONSTRAINT "grupo_alimento_dieta_pkey" PRIMARY KEY ("cod_grupo","alimento")
;

-- Table public.historico_localizacao

CREATE TABLE "public"."historico_localizacao"(
 "seq_animal" Integer DEFAULT nextval('historico_localizacao_seq_animal_seq'::regclass) NOT NULL,
 "cod_email" Character(50) NOT NULL,
 "dat_inicio_localizacao" Date NOT NULL,
 "cod_setor" Integer
)
;

-- Create indexes for table public.historico_localizacao

CREATE INDEX "ix_relationship7" ON "public"."historico_localizacao" ("cod_setor")
;

-- Add keys for table public.historico_localizacao

ALTER TABLE "public"."historico_localizacao" ADD CONSTRAINT "historico_localizacao_pkey" PRIMARY KEY ("dat_inicio_localizacao","seq_animal","cod_email")
;

-- Table public.medicamento

CREATE TABLE "public"."medicamento"(
 "cod_medicamento" Integer NOT NULL,
 "des_medicamento" Character(20) NOT NULL
)
;

-- Add keys for table public.medicamento

ALTER TABLE "public"."medicamento" ADD CONSTRAINT "medicamento_pkey" PRIMARY KEY ("cod_medicamento")
;

-- Table public.parametro

CREATE TABLE "public"."parametro"(
 "cod_parametro" Character(1) NOT NULL,
 "qtd_dia_secagem" Integer NOT NULL,
 "qtd_dia_amamentacao" Integer NOT NULL
)
;

-- Add keys for table public.parametro

ALTER TABLE "public"."parametro" ADD CONSTRAINT "parametro_pkey" PRIMARY KEY ("cod_parametro")
;

-- Table public.problema_padrao

CREATE TABLE "public"."problema_padrao"(
 "cod_problema" Character(20) NOT NULL,
 "des_problema" Text NOT NULL
)
;

-- Add keys for table public.problema_padrao

ALTER TABLE "public"."problema_padrao" ADD CONSTRAINT "problema_padrao_pkey" PRIMARY KEY ("cod_problema")
;

-- Table public.procedencia

CREATE TABLE "public"."procedencia"(
 "seq_procedencia" Integer NOT NULL,
 "nom_fazenda" Character(20) NOT NULL,
 "nom_proprietario" Character(40) NOT NULL,
 "idt_proprietario" Character(20)
)
;

-- Add keys for table public.procedencia

ALTER TABLE "public"."procedencia" ADD CONSTRAINT "procedencia_pkey" PRIMARY KEY ("seq_procedencia")
;

-- Table public.producao_compra

CREATE TABLE "public"."producao_compra"(
 "seq_compra" Integer DEFAULT nextval('producao_compra_seq_compra_seq'::regclass) NOT NULL,
 "cod_cnpj" Integer NOT NULL,
 "cod_problema" Character(20),
 "txt_observacao" Character varying(200)
)
;

-- Create indexes for table public.producao_compra

CREATE INDEX "ix_relationship28" ON "public"."producao_compra" ("cod_problema")
;

CREATE INDEX "ix_relationship27" ON "public"."producao_compra" ("cod_cnpj")
;

-- Add keys for table public.producao_compra

ALTER TABLE "public"."producao_compra" ADD CONSTRAINT "producao_compra_pkey" PRIMARY KEY ("seq_compra")
;

-- Table public.producao_leite

CREATE TABLE "public"."producao_leite"(
 "seq_animal" Integer DEFAULT nextval('producao_leite_seq_animal_seq'::regclass) NOT NULL,
 "cod_email" Character(50) NOT NULL,
 "dat_producao" Date NOT NULL,
 "cod_grupo" Integer NOT NULL,
 "qtd_leite_manha" Numeric(3,2) DEFAULT 0 NOT NULL,
 "qtd_leite_tarde" Numeric(3,2) DEFAULT 0 NOT NULL
)
;

-- Create indexes for table public.producao_leite

CREATE INDEX "ix_relationship16" ON "public"."producao_leite" ("cod_grupo")
;

-- Add keys for table public.producao_leite

ALTER TABLE "public"."producao_leite" ADD CONSTRAINT "producao_leite_pkey" PRIMARY KEY ("dat_producao","seq_animal","cod_email")
;

-- Table public.reproducao

CREATE TABLE "public"."reproducao"(
 "seq_reproducao" Integer DEFAULT nextval('reproducao_seq_reproducao_seq'::regclass) NOT NULL,
 "seq_animal_gestante" Integer DEFAULT nextval('reproducao_seq_animal_gestante_seq'::regclass) NOT NULL,
 "seq_animal" Integer DEFAULT nextval('reproducao_seq_animal_seq'::regclass) NOT NULL,
 "dat_inseminacao" Date NOT NULL,
 "hora_inseminacao" Time,
 "dat_gestacao" Date NOT NULL,
 "cod_email" Character(50)
)
;

-- Create indexes for table public.reproducao

CREATE INDEX "ix_relationship20" ON "public"."reproducao" ("seq_animal_gestante","cod_email")
;

CREATE INDEX "ix_relationship21" ON "public"."reproducao" ("seq_animal","cod_email")
;

-- Add keys for table public.reproducao

ALTER TABLE "public"."reproducao" ADD CONSTRAINT "reproducao_pkey" PRIMARY KEY ("seq_reproducao")
;

-- Table public.setor

CREATE TABLE "public"."setor"(
 "cod_setor" Integer NOT NULL,
 "nom_setor" Character(40)
)
;

-- Add keys for table public.setor

ALTER TABLE "public"."setor" ADD CONSTRAINT "setor_pkey" PRIMARY KEY ("cod_setor")
;

-- Table public.usuario

CREATE TABLE "public"."usuario"(
 "cod_email" Character(50) NOT NULL,
 "txt_senha" Text NOT NULL,
 "nom_usuario" Character varying(100) NOT NULL,
 "id_usuario" Integer DEFAULT nextval('usuario_id_usuario_seq'::regclass) NOT NULL
)
;

-- Add keys for table public.usuario

ALTER TABLE "public"."usuario" ADD CONSTRAINT "usuario_pkey" PRIMARY KEY ("cod_email")
;

-- Table public.vacina

CREATE TABLE "public"."vacina"(
 "cod_vacina" Integer NOT NULL,
 "nom_vacina" Character(20) NOT NULL,
 "qtd_doses" Integer
)
;

-- Add keys for table public.vacina

ALTER TABLE "public"."vacina" ADD CONSTRAINT "vacina_pkey" PRIMARY KEY ("cod_vacina")
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE "public"."animal" ADD CONSTRAINT "relationship2" FOREIGN KEY ("cod_grupo") REFERENCES "public"."grupo" ("cod_grupo") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal" ADD CONSTRAINT "relationship31" FOREIGN KEY ("cod_email") REFERENCES "public"."usuario" ("cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal" ADD CONSTRAINT "relationship33" FOREIGN KEY ("cod_email") REFERENCES "public"."usuario" ("cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal_medicamento" ADD CONSTRAINT "relationship14" FOREIGN KEY ("seq_animal", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal_medicamento" ADD CONSTRAINT "relationship15" FOREIGN KEY ("cod_medicamento") REFERENCES "public"."medicamento" ("cod_medicamento") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal_vacina" ADD CONSTRAINT "relationship23" FOREIGN KEY ("seq_animal", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."animal_vacina" ADD CONSTRAINT "relationship24" FOREIGN KEY ("cod_vacina") REFERENCES "public"."vacina" ("cod_vacina") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."controle_producao" ADD CONSTRAINT "relationship29" FOREIGN KEY ("seq_compra") REFERENCES "public"."producao_compra" ("seq_compra") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."controle_producao" ADD CONSTRAINT "relationship26" FOREIGN KEY ("seq_animal", "cod_email", "dat_producao") REFERENCES "public"."producao_leite" ("seq_animal", "cod_email", "dat_producao") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."grupo_alimento_dieta" ADD CONSTRAINT "relationship10" FOREIGN KEY ("alimento") REFERENCES "public"."alimento" ("cod_alimento") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."grupo_alimento_dieta" ADD CONSTRAINT "relationship9" FOREIGN KEY ("cod_grupo") REFERENCES "public"."grupo" ("cod_grupo") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."historico_localizacao" ADD CONSTRAINT "relationship22" FOREIGN KEY ("seq_animal", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."historico_localizacao" ADD CONSTRAINT "relationship7" FOREIGN KEY ("cod_setor") REFERENCES "public"."setor" ("cod_setor") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."producao_compra" ADD CONSTRAINT "relationship27" FOREIGN KEY ("cod_cnpj") REFERENCES "public"."comprador" ("cod_cnpj") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."producao_compra" ADD CONSTRAINT "relationship28" FOREIGN KEY ("cod_problema") REFERENCES "public"."problema_padrao" ("cod_problema") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."producao_leite" ADD CONSTRAINT "relationship25" FOREIGN KEY ("seq_animal", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."producao_leite" ADD CONSTRAINT "relationship16" FOREIGN KEY ("cod_grupo") REFERENCES "public"."grupo" ("cod_grupo") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."reproducao" ADD CONSTRAINT "relationship20" FOREIGN KEY ("seq_animal_gestante", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE "public"."reproducao" ADD CONSTRAINT "relationship21" FOREIGN KEY ("seq_animal", "cod_email") REFERENCES "public"."animal" ("seq_animal", "cod_email") ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER SEQUENCE "public"."animal_medicamento_seq_animal_seq" OWNED BY "public"."animal_medicamento"."seq_animal"
;
ALTER SEQUENCE "public"."animal_medicamento_seq_medicamento_seq" OWNED BY "public"."animal_medicamento"."seq_medicamento"
;
ALTER SEQUENCE "public"."animal_seq_animal_seq" OWNED BY "public"."animal"."seq_animal"
;
ALTER SEQUENCE "public"."animal_vacina_seq_animal_seq" OWNED BY "public"."animal_vacina"."seq_animal"
;
ALTER SEQUENCE "public"."animal_vacina_seq_vacina_seq" OWNED BY "public"."animal_vacina"."seq_vacina"
;
ALTER SEQUENCE "public"."controle_producao_seq_animal_seq" OWNED BY "public"."controle_producao"."seq_animal"
;
ALTER SEQUENCE "public"."controle_producao_seq_compra_seq" OWNED BY "public"."controle_producao"."seq_compra"
;
ALTER SEQUENCE "public"."historico_localizacao_seq_animal_seq" OWNED BY "public"."historico_localizacao"."seq_animal"
;
ALTER SEQUENCE "public"."producao_compra_seq_compra_seq" OWNED BY "public"."producao_compra"."seq_compra"
;
ALTER SEQUENCE "public"."producao_leite_seq_animal_seq" OWNED BY "public"."producao_leite"."seq_animal"
;
ALTER SEQUENCE "public"."reproducao_seq_animal_gestante_seq" OWNED BY "public"."reproducao"."seq_animal_gestante"
;
ALTER SEQUENCE "public"."reproducao_seq_animal_seq" OWNED BY "public"."reproducao"."seq_animal"
;
ALTER SEQUENCE "public"."reproducao_seq_reproducao_seq" OWNED BY "public"."reproducao"."seq_reproducao"
;

-- Create roles section -------------------------------------------------

CREATE ROLE "pg_signal_backend"
;

-- Grant permissions section -------------------------------------------------

