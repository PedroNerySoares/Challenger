CREATE TABLE arquivo (
  idarq INT NOT NULL AUTO_INCREMENT,
  nmarq VARCHAR(255) NULL,
  nrtamarq DECIMAL(5,2) NULL,
  
  PRIMARY KEY (idarq));

CREATE TABLE transacao (
  id INT NOT NULL AUTO_INCREMENT,
  bancoOrigem VARCHAR(45) NULL,
  agenciaOrigem CHAR(4) NULL,
  ContaOrigem CHAR(7) NULL,
  bancoDestino VARCHAR(45) NULL,
  agenciaDestino CHAR(4) NULL,
  ContaDestino CHAR(7) NULL,
  valorTransacao DECIMAL(10,2) NULL,
  dataHoraTransacao DATE NULL,
  TRANSACAOcol VARCHAR(45) NULL,
  PRIMARY KEY (ID));

  
  CREATE TABLE `challenger`.`usuario` (
  `id` INT NOT NULL  AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));
  