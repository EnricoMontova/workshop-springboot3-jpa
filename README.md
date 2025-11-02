# 🧠 Web Services com Spring Boot e JPA / Hibernate

Este projeto foi desenvolvido como parte do meu aprendizado em **Java e desenvolvimento backend com Spring Boot**, seguindo o curso “Java COMPLETO Programação Orientada a Objetos” do professor **Nélio Alves**.

O objetivo principal é construir, passo a passo, uma **API RESTful completa**, com camadas bem estruturadas e integração com banco de dados usando **JPA / Hibernate**.

---

## 🚀 **Visão Geral**

O sistema simula um **mini e-commerce**, com funcionalidades que permitem:

- 👤 Gerenciar usuários (cadastro, listagem, atualização e remoção);
- 🛒 Criar e consultar pedidos;
- 💳 Registrar pagamentos;
- 📦 Organizar produtos por categorias;
- 🔗 Relacionar entidades com diferentes tipos de associação (One-to-Many, Many-to-Many, One-to-One).

A aplicação foi desenvolvida com **boas práticas de arquitetura**, dividida em camadas:

Controller (Resources) → Service → Repository → Entity

Cada camada tem uma função clara dentro do sistema, garantindo **organização**, **reutilização de código** e **facilidade de manutenção**.

---

## 🧩 **Principais Tecnologias Utilizadas**
- **Linguagem:**  Java 17
- **Framework:** Spring Boot 3
- **ORM** JPA / Hibernate 
- **Banco de Dados:** H2 (modo de teste e memória) 
- **Ferramentas:** Maven, Postman, IntelliJ / VSCode 
- **Controle de versão:** Git e GitHub

---

## 🧠 **Conceitos aplicados**

Durante o desenvolvimento, foram aplicados diversos conceitos importantes do ecossistema Java:

- **Injeção de dependência (@Autowired)**  
- **Mapeamento objeto-relacional (ORM)** com JPA/Hibernate  
- **Relacionamentos entre entidades** (`@OneToMany`, `@ManyToMany`, `@OneToOne`)  
- **Camadas de serviço e repositório** bem definidas  
- **API RESTful** com respostas estruturadas em JSON  
- **Tratamento de dados de teste** com `CommandLineRunner`  
- **Perfis de execução (`@Profile("test")`)** e configuração do banco H2  

---

## 🧱 **Estrutura do Projeto**

com.educandoweb.course
- config/ → Configurações iniciais e dados de teste
- entities/ → Classes de modelo (User, Product, Order, etc.)
- repositories/ → Interfaces que acessam o banco (JPA)
- services/ → Lógica de negócio e regras do sistema
- resources/ → Controladores REST (endpoints da API)
-  CourseApplication.java → Classe principal (ponto de partida do sistema)

## 🧮 **Banco de Dados de Teste (H2)**

A aplicação vem com um banco de dados em memória configurado automaticamente.
Você pode acessá-lo via navegador:

http://localhost:8080/h2-console

> JDBC URL: jdbc:h2:mem:testdb
> Usuário: sa
> Senha: (vazia)

## 💡 **Aprendizados até aqui**

Este projeto tem sido um marco importante na minha formação como desenvolvedor.
Cada etapa, das entidades até as relações complexas, tem me ajudado a entender a arquitetura real de sistemas web, aplicar conceitos sólidos de engenharia de software e ganhar segurança em Java, Spring Boot e bancos relacionais.
