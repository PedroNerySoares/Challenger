CREATE TABLE `challenger`.`transacao` (
  `id` INT NOT NULL,
  `bancoOrigem` VARCHAR(45) NULL,
  `agenciaOrigem` CHAR(4) NULL,
  `ContaOrigem` CHAR(7) NULL,
  `bancoDestino` VARCHAR(45) NULL,
  `agenciaDestino` CHAR(4) NULL,
  `ContaDestino` CHAR(7) NULL,
  `valorTransacao` DECIMAL(5,2) NULL,
  `dataHoraTransacao` DATE NULL,
  PRIMARY KEY (`id`));

  
  INSERT INTO `challenger`.`transacao` (`id`, `bancoOrigem`, `agenciaOrigem`, `ContaOrigem`, `bancoDestino`, `agenciaDestino`, `ContaDestino`, `valorTransacao`, `dataHoraTransacao`) VALUES ('1', 'BANCO SANTANDER', '0001', '00000-1', 'BRADESCO', '0002', '20000-7', 5.200, NOW());
  