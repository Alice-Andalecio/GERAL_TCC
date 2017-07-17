/*
Created: 10/06/2017
Modified: 17/07/2017
Model: MySQL 5.1
Database: MySQL 5.1
*/


-- Create tables section -------------------------------------------------

-- Table Animal

CREATE TABLE `Animal`
(
  `seq_Animal` Serial NOT NULL,
  `seq_Procedencia` Int,
  `cod_Grupo` Int,
  `seq_Animal_Pai` Int NOT NULL,
  `seq_Animal_Mae` Int NOT NULL,
  `nro_Animal` Char(5) NOT NULL,
  `dat_Nascimento` Date NOT NULL,
  `idt_Tipo` Char(1),
  `idt_Status` Char(1)
)
;

CREATE INDEX `IX_Relationship1` ON `Animal` (`seq_Procedencia`)
;

CREATE INDEX `IX_Relationship2` ON `Animal` (`cod_Grupo`)
;

CREATE INDEX `IX_Relationship3` ON `Animal` (`seq_Animal_Pai`)
;

CREATE INDEX `IX_Relationship4` ON `Animal` (`seq_Animal_Mae`)
;

ALTER TABLE `Animal` ADD  PRIMARY KEY (`seq_Animal`)
;

-- Table Animal_Vacina

CREATE TABLE `Animal_Vacina`
(
  `seq_Animal` Int NOT NULL,
  `cod_Vacina` Int NOT NULL,
  `seq_Vacina` Serial NOT NULL,
  `dat_Vacinacao` Date
)
;

ALTER TABLE `Animal_Vacina` ADD  PRIMARY KEY (`seq_Vacina`,`seq_Animal`,`cod_Vacina`)
;

-- Table Historico_Localizacao

CREATE TABLE `Historico_Localizacao`
(
  `seq_Animal` Int NOT NULL,
  `dat_Inicio_Localizacao` Date NOT NULL,
  `cod_Setor` Int
)
;

CREATE INDEX `IX_Relationship7` ON `Historico_Localizacao` (`cod_Setor`)
;

ALTER TABLE `Historico_Localizacao` ADD  PRIMARY KEY (`dat_Inicio_Localizacao`,`seq_Animal`)
;

-- Table Animal_Medicamento

CREATE TABLE `Animal_Medicamento`
(
  `seq_Animal` Int NOT NULL,
  `seq_Medicamento` Int NOT NULL,
  `cod_Medicamento` Int,
  `dat_Inicio` Date NOT NULL,
  `dat_Fim` Date NOT NULL,
  `txt_prescricao` Text NOT NULL,
  `qtd_Dosagem` Decimal(7,2),
  `qtd_Frequencia` Int
)
;

CREATE INDEX `IX_Relationship15` ON `Animal_Medicamento` (`cod_Medicamento`)
;

ALTER TABLE `Animal_Medicamento` ADD  PRIMARY KEY (`seq_Medicamento`,`seq_Animal`)
;

-- Table Reproducao

CREATE TABLE `Reproducao`
(
  `seq_Reproducao` Serial NOT NULL,
  `seq_Animal_Gestante` Int,
  `seq_Animal` Int,
  `dat_Inseminacao` Date NOT NULL,
  `Hora_Inseminacao` Time,
  `dat_Gestacao` Date NOT NULL
)
;

CREATE INDEX `IX_Relationship20` ON `Reproducao` (`seq_Animal_Gestante`)
;

CREATE INDEX `IX_Relationship21` ON `Reproducao` (`seq_Animal`)
;

ALTER TABLE `Reproducao` ADD  PRIMARY KEY (`seq_Reproducao`)
;

-- Table Producao_Leite

CREATE TABLE `Producao_Leite`
(
  `seq_Animal` Int NOT NULL,
  `dat_Producao` Date NOT NULL,
  `cod_Grupo` Int NOT NULL,
  `qtd_Leite_Manha` Decimal(3,2) NOT NULL DEFAULT 0,
  `qtd_Leite_Tarde` Decimal(3,2) NOT NULL DEFAULT 0
)
;

CREATE INDEX `IX_Relationship16` ON `Producao_Leite` (`cod_Grupo`)
;

ALTER TABLE `Producao_Leite` ADD  PRIMARY KEY (`dat_Producao`,`seq_Animal`)
;

-- Table Grupo

CREATE TABLE `Grupo`
(
  `cod_Grupo` Int NOT NULL,
  `nom_Grupo` Char(20) NOT NULL,
  `qtd_Media_Produção` Decimal(3,2)
)
;

ALTER TABLE `Grupo` ADD  PRIMARY KEY (`cod_Grupo`)
;

-- Table Setor

CREATE TABLE `Setor`
(
  `cod_Setor` Int NOT NULL,
  `nom_Setor` Char(40)
)
;

ALTER TABLE `Setor` ADD  PRIMARY KEY (`cod_Setor`)
;

-- Table Medicamento

CREATE TABLE `Medicamento`
(
  `cod_Medicamento` Int NOT NULL,
  `des_Medicamento` Char(20) NOT NULL
)
;

ALTER TABLE `Medicamento` ADD  PRIMARY KEY (`cod_Medicamento`)
;

-- Table Parametro

CREATE TABLE `Parametro`
(
  `cod_parametro` Char(1) NOT NULL,
  `qtd_Dia_Secagem` Int NOT NULL,
  `qtd_Dia_Amamentacao` Int NOT NULL
)
;

ALTER TABLE `Parametro` ADD  PRIMARY KEY (`cod_parametro`)
;

-- Table Procedencia

CREATE TABLE `Procedencia`
(
  `seq_Procedencia` Int NOT NULL,
  `nom_Fazenda` Char(20) NOT NULL,
  `nom_Proprietario` Char(40) NOT NULL,
  `idt_Proprietario` Char(20)
)
;

ALTER TABLE `Procedencia` ADD  PRIMARY KEY (`seq_Procedencia`)
;

-- Table Vacina

CREATE TABLE `Vacina`
(
  `cod_Vacina` Int NOT NULL,
  `nom_Vacina` Char(20) NOT NULL,
  `qtd_Doses` Int
)
;

ALTER TABLE `Vacina` ADD  PRIMARY KEY (`cod_Vacina`)
;

-- Table Grupo_Alimento_Dieta

CREATE TABLE `Grupo_Alimento_Dieta`
(
  `cod_Grupo` Int NOT NULL,
  `Alimento` Int NOT NULL,
  `per_Composicao` Decimal(5,2) NOT NULL
)
;

ALTER TABLE `Grupo_Alimento_Dieta` ADD  PRIMARY KEY (`cod_Grupo`,`Alimento`)
;

-- Table Alimento

CREATE TABLE `Alimento`
(
  `cod_alimento` Int NOT NULL,
  `des_Alimento` Text NOT NULL
)
;

ALTER TABLE `Alimento` ADD  PRIMARY KEY (`cod_alimento`)
;

-- Table Controle_Producao

CREATE TABLE `Controle_Producao`
(
  `seq_compra` Int NOT NULL,
  `seq_Animal` Int NOT NULL,
  `dat_Producao` Date NOT NULL
)
;

ALTER TABLE `Controle_Producao` ADD  PRIMARY KEY (`dat_Producao`,`seq_Animal`,`seq_compra`)
;

-- Table Comprador

CREATE TABLE `Comprador`
(
  `cod_CNPJ` Int NOT NULL,
  `nom_Comprador` Char(40) NOT NULL
)
;

ALTER TABLE `Comprador` ADD  PRIMARY KEY (`cod_CNPJ`)
;

-- Table Problema_Padrao

CREATE TABLE `Problema_Padrao`
(
  `cod_Problema` Char(20) NOT NULL,
  `des_Problema` Text NOT NULL
)
;

ALTER TABLE `Problema_Padrao` ADD  PRIMARY KEY (`cod_Problema`)
;

-- Table Producao_Compra

CREATE TABLE `Producao_Compra`
(
  `seq_compra` Serial NOT NULL,
  `cod_CNPJ` Int NOT NULL,
  `cod_Problema` Char(20),
  `txt_observacao` Varchar(200)
)
;

CREATE INDEX `IX_Relationship28` ON `Producao_Compra` (`cod_Problema`)
;

CREATE INDEX `IX_Relationship27` ON `Producao_Compra` (`cod_CNPJ`)
;

ALTER TABLE `Producao_Compra` ADD  PRIMARY KEY (`seq_compra`)
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE `Animal` ADD CONSTRAINT `Relationship1` FOREIGN KEY (`seq_Procedencia`) REFERENCES `Procedencia` (`seq_Procedencia`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal` ADD CONSTRAINT `Relationship2` FOREIGN KEY (`cod_Grupo`) REFERENCES `Grupo` (`cod_Grupo`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal` ADD CONSTRAINT `Relationship3` FOREIGN KEY (`seq_Animal_Pai`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal` ADD CONSTRAINT `Relationship4` FOREIGN KEY (`seq_Animal_Mae`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Historico_Localizacao` ADD CONSTRAINT `Relationship7` FOREIGN KEY (`cod_Setor`) REFERENCES `Setor` (`cod_Setor`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Grupo_Alimento_Dieta` ADD CONSTRAINT `Relationship9` FOREIGN KEY (`cod_Grupo`) REFERENCES `Grupo` (`cod_Grupo`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Grupo_Alimento_Dieta` ADD CONSTRAINT `Relationship10` FOREIGN KEY (`Alimento`) REFERENCES `Alimento` (`cod_alimento`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal_Medicamento` ADD CONSTRAINT `Relationship14` FOREIGN KEY (`seq_Animal`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal_Medicamento` ADD CONSTRAINT `Relationship15` FOREIGN KEY (`cod_Medicamento`) REFERENCES `Medicamento` (`cod_Medicamento`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Producao_Leite` ADD CONSTRAINT `Relationship16` FOREIGN KEY (`cod_Grupo`) REFERENCES `Grupo` (`cod_Grupo`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Reproducao` ADD CONSTRAINT `Relationship20` FOREIGN KEY (`seq_Animal_Gestante`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Reproducao` ADD CONSTRAINT `Relationship21` FOREIGN KEY (`seq_Animal`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Historico_Localizacao` ADD CONSTRAINT `Relationship22` FOREIGN KEY (`seq_Animal`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal_Vacina` ADD CONSTRAINT `Relationship23` FOREIGN KEY (`seq_Animal`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Animal_Vacina` ADD CONSTRAINT `Relationship24` FOREIGN KEY (`cod_Vacina`) REFERENCES `Vacina` (`cod_Vacina`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Producao_Leite` ADD CONSTRAINT `Relationship25` FOREIGN KEY (`seq_Animal`) REFERENCES `Animal` (`seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Controle_Producao` ADD CONSTRAINT `Relationship26` FOREIGN KEY (`dat_Producao`, `seq_Animal`) REFERENCES `Producao_Leite` (`dat_Producao`, `seq_Animal`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Producao_Compra` ADD CONSTRAINT `Relationship27` FOREIGN KEY (`cod_CNPJ`) REFERENCES `Comprador` (`cod_CNPJ`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Producao_Compra` ADD CONSTRAINT `Relationship28` FOREIGN KEY (`cod_Problema`) REFERENCES `Problema_Padrao` (`cod_Problema`) ON DELETE RESTRICT ON UPDATE RESTRICT
;

ALTER TABLE `Controle_Producao` ADD CONSTRAINT `Relationship29` FOREIGN KEY (`seq_compra`) REFERENCES `Producao_Compra` (`seq_compra`) ON DELETE RESTRICT ON UPDATE RESTRICT
;
