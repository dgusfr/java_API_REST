# API de Tarefas

Uma API simples para gerenciamento de tarefas, desenvolvida em Java com Spring Boot. Permite adicionar, listar e remover tarefas via requisições HTTP.

## Sumário

- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Status](#status)
- [Descrição](#descrição)
- [Funcionalidades](#funcionalidades)
- [Documentação](#documentacao)
- [Autor](#autor)

## Tecnologias Utilizadas

<div style="display: flex; justify-content: space-between; align-items: center; width: 100%;">
  <img src="images/java.png" alt="Logo Java" width="150"/>
  <img src="images/springboot.png" alt="Logo Spring Boot" width="105"/>
</div>


## Status

![Em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge)

## Descrição

Esta API permite o gerenciamento simples de tarefas, onde é possível adicionar, visualizar e deletar tarefas. É uma aplicação REST que pode ser consumida por qualquer cliente HTTP, como Postman, cURL ou Front-ends integrados.

## Funcionalidades

- **Listar Tarefas**: Recupera todas as tarefas cadastradas na API.
- **Adicionar Tarefa**: Adiciona uma nova tarefa ao sistema.
- **Remover Todas as Tarefas**: Apaga todas as tarefas registradas.

## Documentação

### Endpoints da API

#### **1. Listar todas as tarefas**
**Método:** `GET`  
**URL:** `/api/tasks`  
**Resposta:**
```json
[ "Tarefa 1", "Tarefa 2" ]
```

<br>
---

#### **2. Adicionar uma nova tarefa**
**Método:** `POST`  
**URL:** `/api/tasks`  
**Body:** (JSON)
```json
"Nova tarefa"
```

<br>

**Resposta:** `200 OK`

#### **3. Deletar todas as tarefas**
**Método:** `DELETE`  
**URL:** `/api/tasks`  
**Resposta:** `200 OK`

## Autor

Desenvolvido por Diego Franco

