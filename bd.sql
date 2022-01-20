-- -----------------------------------------------------
-- Schema exemplo
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `exemplo` ;

-- -----------------------------------------------------
-- Schema exemplo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `exemplo` DEFAULT CHARACTER SET utf8 ;

USE `exemplo` ;

-- -----------------------------------------------------
-- Table `exemplo`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `exemplo`.`cliente` ;

CREATE TABLE IF NOT EXISTS `exemplo`.`cliente` (
  `idCliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `endereco` VARCHAR(255) NOT NULL,
  `dataCadastro` DATETIME NULL,
  `statusTupla` SMALLINT NOT NULL DEFAULT 1,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `idCliente_UNIQUE` ON `exemplo`.`cliente` (`idCliente` ASC);

-- -----------------------------------------------------
-- Table `exemplo`.`locacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `exemplo`.`locacao` ;

CREATE TABLE IF NOT EXISTS `exemplo`.`locacao` (
  `idLocacao` INT NOT NULL AUTO_INCREMENT,
  `cliente_idCliente` INT NOT NULL,
  `dataLocacao` DATETIME NULL,
  `dataDevolucao` DATETIME NULL,
  `valor` DOUBLE NOT NULL,
  `statusTupla` SMALLINT NOT NULL DEFAULT 1,
  `emprestado` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idLocacao`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `idLocacao_UNIQUE` ON `exemplo`.`locacao` (`idLocacao` ASC);

-- -----------------------------------------------------
-- Table `exemplo`.`filme`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `exemplo`.`filme` ;

CREATE TABLE IF NOT EXISTS `exemplo`.`filme` (
  `idFilme` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(255) NOT NULL,
  `genero` VARCHAR(255) NOT NULL,
  `produtora` VARCHAR(255) NOT NULL,
  `statusTupla` SMALLINT NOT NULL DEFAULT 1,
  `codigo` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idFilme`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `codigo_UNIQUE` ON `exemplo`.`filme` (`codigo` ASC);

CREATE UNIQUE INDEX `idFilme_UNIQUE` ON `exemplo`.`filme` (`idFilme` ASC);

-- -----------------------------------------------------
-- Table `exemplo`.`itensLocacao`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `exemplo`.`itensLocacao` ;

CREATE TABLE IF NOT EXISTS `exemplo`.`itensLocacao` (
  `idItensLocacao` INT NOT NULL AUTO_INCREMENT,
  `locacao_idLocacao` INT NOT NULL,
  `filme_idFilme` INT NOT NULL,
  PRIMARY KEY (`idItensLocacao`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `idItensLocacao_UNIQUE` ON `exemplo`.`itensLocacao` (`idItensLocacao` ASC);

USE `exemplo`;

DELIMITER $$

USE `exemplo`$$
DROP TRIGGER IF EXISTS `exemplo`.`dataCadastro` $$

USE `exemplo`$$
CREATE TRIGGER dataCadastro BEFORE INSERT ON cliente FOR EACH ROW SET NEW.dataCadastro = NOW()$$

USE `exemplo`$$
DROP TRIGGER IF EXISTS `exemplo`.`dataLocacaoDevolucao` $$

USE `exemplo`$$
CREATE TRIGGER dataLocacaoDevolucao BEFORE INSERT ON locacao FOR EACH ROW SET NEW.dataLocacao = NOW(), NEW.dataDevolucao = ADDDATE(NOW(), INTERVAL 5 DAY)$$

DELIMITER ;
