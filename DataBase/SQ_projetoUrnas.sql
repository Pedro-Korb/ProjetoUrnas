
CREATE TABLE `candidato` (
  `idCandidato` int(11) NOT NULL AUTO_INCREMENT,
  `cargoPolitico` varchar(45) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `apelido` varchar(45) DEFAULT NULL,
  `vice` varchar(45) DEFAULT NULL,
  `idPartido` int(11) DEFAULT NULL,
  `idPessoa` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCandidato`),
  KEY `idPartido` (`idPartido`),
  KEY `idPessoa` (`idPessoa`),
  CONSTRAINT `candidato_ibfk_1` FOREIGN KEY (`idPartido`) REFERENCES `partido` (`idPartido`),
  CONSTRAINT `candidato_ibfk_2` FOREIGN KEY (`idPessoa`) REFERENCES `pessoa` (`idPessoa`)
)



CREATE TABLE `eleitor` (
  `idEleitor` int(11) NOT NULL AUTO_INCREMENT,
  `numeroTitulo` varchar(45) DEFAULT NULL,
  `idPessoa` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEleitor`),
  KEY `idPessoa` (`idPessoa`),
  CONSTRAINT `eleitor_ibfk_1` FOREIGN KEY (`idPessoa`) REFERENCES `pessoa` (`idPessoa`)
)


CREATE TABLE `endereco` (
  `idEndereco` int(11) NOT NULL AUTO_INCREMENT,
  `pais` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `zonaEleitoral` int(11) DEFAULT NULL,
  `sessaoEleitoral` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEndereco`)
)


CREATE TABLE `partido` (
  `idPartido` int(11) NOT NULL AUTO_INCREMENT,
  `numero` int(11) DEFAULT NULL,
  `nomePartido` varchar(45) DEFAULT NULL,
  `siglaPartido` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPartido`)
)


CREATE TABLE `pessoa` (
  `idPessoa` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `idEndereco` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPessoa`),
  KEY `idEndereco` (`idEndereco`),
  CONSTRAINT `pessoa_ibfk_1` FOREIGN KEY (`idEndereco`) REFERENCES `endereco` (`idEndereco`)
)


CREATE TABLE `urna` (
  `idUrna` int(11) NOT NULL AUTO_INCREMENT,
  `cidade` varchar(45) DEFAULT NULL,
  `zonaEleitoral` int(11) DEFAULT NULL,
  `sessaoEleitoral` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUrna`)
)


CREATE TABLE `voto` (
  `idVoto` int(11) NOT NULL AUTO_INCREMENT,
  `anoVoto` int(11) DEFAULT NULL,
  `idEleitor` int(11) DEFAULT NULL,
  `idUrna` int(11) DEFAULT NULL,
  `idCandidato` int(11) DEFAULT NULL,
  PRIMARY KEY (`idVoto`),
  KEY `idEleitor` (`idEleitor`),
  KEY `idUrna` (`idUrna`),
  KEY `idCandidato` (`idCandidato`),
  CONSTRAINT `voto_ibfk_1` FOREIGN KEY (`idEleitor`) REFERENCES `eleitor` (`idEleitor`),
  CONSTRAINT `voto_ibfk_2` FOREIGN KEY (`idUrna`) REFERENCES `urna` (`idUrna`),
  CONSTRAINT `voto_ibfk_3` FOREIGN KEY (`idCandidato`) REFERENCES `candidato` (`idCandidato`)
)
