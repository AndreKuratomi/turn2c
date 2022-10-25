## TURN2C-API

- [Sobre](#sobre)
- [Instalação](#instalação)
- [Documentação](#documentação)
- [Termos de uso](#termos-de-uso)
- [Referências](#referências)

<br>

# Sobre

<b>Turn2C-API</b> é uma aplicação de gerenciamento de clientes e vendedores. Esta aplicação utiliza a linguagem <b>Java</b>, o framework <b>Spring Boot</b> e o banco de dados <b>MySQL</b>.
<br>

# Instalação

<h5>0. Primeiramente, é necessário já ter instalado na própria máquina:</h5>

- Um <b>editor de código</b>, conhecido também como <b>IDE</b>. Por exemplo, o <b>[Visual Studio Code (VSCode)](https://code.visualstudio.com/)</b>.

- Uma <b>ferramenta cliente de API REST</b>. Por exemplo, o <b>[Insomnia](https://insomnia.rest/download)</b> ou o <b>[Postman](https://www.postman.com/product/rest-client/)</b>.

- <b>Java</b> e pacotes essenciais como

<b>OpenJDK</b>:

```
sudo apt install default-jdk
```

<b>OpenJRE 11</b>:

```
sudo apt install default-jre
```

<b>Oracle Java</b>:

```
sudo add-apt-repository ppa:webupd8team/java
```

E por fim <b>Java 11</b>:

```
sudo apt install oracle-java11-installer
```

- <p> E versionar o diretório para receber o clone da aplicação:</p>

```
git init
```

<br>
<h5>1. Fazer o clone do repositório <span>Turn2C-API</span> na sua máquina pelo terminal do computador ou pelo do IDE:</h5>

```
git clone https://github.com/AndreKuratomi/PrototipoLogin-API.git
```

<!-- <p>Entrar na pasta criada:</p>

```
cd PrototipoLogin-API
```

Após feito o clone do repositório PrototipoLogin-API, instalar:

O ambiente virtual e atualizar suas dependências com o seguinte comando:

```
python -m venv venv --upgrade-deps
```

Ative o seu ambiente virtual com o comando:

```
source/venv/bin/activate
```

Instalar suas dependências:

```
pip install -r requirements.txt
```

E rodar a aplicação:

```
code .
```

<br>

<h5>2. Feitas as instalações precisamos criar nosso arquivo de variáveis de ambiente, o <span style="text-decoration: underline">.env</span>:</h5>

```
touch .env
```

Dentro dele precisamos definir nossas variáveis de ambiente:

```
EMAIL_HOST_USER=user_mail
EMAIL_HOST_PASSWORD=password

POSTGRES_DB=database
POSTGRES_HOST=host
POSTGRES_PASSWORD=password
POSTGRES_USER=user
```

<b>Obs:</b> as informações contidas no arquivo <b>.env</b> não devem ser compartilhadas. O arquivo já consta no <b>.gitignore</b> para não ser subido no repositório. -->

# Documentação

Para ter acesso às descrições, detalhes das rotas e seus retornos, conferir documentação completa no link a seguir:

https://insomnia-documentation-mauve.vercel.app/

# Termos de uso

Esse projeto atende a fins exclusivamente didáticos e sem nenhum intuito comercial.

# Referências

- [Java](https://docs.aws.amazon.com/ec2/index.html)
- [Java (Oracle install)](https://docs.oracle.com/en/java/javase/19/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8)
- [Java (install on Linux Ubuntu)](https://phoenixnap.com/kb/how-to-install-java-ubuntu)
- [Java (W3Schools)](https://www.w3schools.com/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Boot Initializr](https://start.spring.io/)
<!--
- [DjangoMail](https://docs.djangoproject.com/en/4.1/topics/email/)
- [Django Rest framework](https://www.django-rest-framework.org/#)
- [Docker](https://docs.docker.com/)
- [Dotenv](https://www.npmjs.com/package/dotenv)
- [Insomnia-documenter](https://www.npmjs.com/package/insomnia-documenter)
- [Insomnia-documenter (quick tutorial)](https://www.youtube.com/watch?v=pq2u3FqVVy8)
- [JWT](https://github.com/auth0/node-jsonwebtoken) -->
