# Sistemas de gerenciamento de uma video locadora

## Instalação:

Esse sistema foi desenvolvido a partir da IDE NetBeans, pois nela existe uma facilidade maior em desenvolver as views.

- Instalar o [Java JDK](https://www.oracle.com/java/technologies/downloads/)
- Instalar a [IDE NetBeans](https://netbeans.apache.org/download/)
- Instalar o banco de dados [MySQL Community](https://dev.mysql.com/downloads/)
- Instalar o [MySQL WorkBench](https://mysql-workbench.br.uptodown.com/windows)

## Script do Banco de dados:

Após o banco de dados ser instalado é necessario executar um Script SQL para poder criar o banco de dados no qual esse sistema irá utilizar.

Para executar o Script basta:

- Abrir o arquivo **bd.sql** com o MySQL WorkBench;
- Após aberto aperte no raio amarelo que será executado;
- Crie uma nova conta de usuario de banco de dados;
- Pronto! Banco criado.

## Abrir projeto e realizar modificações

Será necessario realizar algumas alterações dentro do codigo e do para que seja possivel a conexão com o projeto e com o banco.

- Na classe "ConnectionFactory" altere os dados do usuario e senha pelos qual utiliza;
- Adicione o Driver que está dentro da pasta Lib no projeto.

## Pronto já podera utilizar!
