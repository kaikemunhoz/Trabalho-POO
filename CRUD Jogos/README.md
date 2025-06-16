# 🎮 Sistema CRUD de Jogos em Java

Este é um projeto de sistema **CRUD (Create, Read, Update, Delete)** desenvolvido em **Java** com foco em ambiente **desktop**, utilizando **programação orientada a objetos (POO)**. O sistema simula o gerenciamento de uma coleção de jogos, permitindo ao usuário cadastrar, visualizar, atualizar e excluir registros.

## 📚 Finalidade

Projeto acadêmico da disciplina de **Programação Orientada a Objetos** ou similar, com o objetivo de praticar os conceitos de POO e estruturação de aplicações em Java.

---

## 🛠️ Tecnologias Utilizadas

- **Java SE 8+**
- **IDE sugerida:** IntelliJ IDEA / Eclipse / NetBeans
- **Scanner (entrada de dados via terminal)**
- **ArrayList (armazenamento temporário em memória)**

---

## ⚙️ Funcionalidades

- ✅ Cadastrar um novo jogo (ID, nome, gênero, plataforma)  
- 📋 Listar todos os jogos cadastrados  
- ✏️ Atualizar informações de um jogo existente  
- ❌ Excluir um jogo a partir do ID  
- 🔍 Verificação de ID duplicado no cadastro

---

## 📦 Estrutura do Projeto

```
CRUDJogos/
├── CRUDJogos.java   --> Classe principal com menu e operações CRUD
├── Jogo.java        --> Classe modelo representando o jogo
└── README.md        --> Este arquivo
```

---

## 🚀 Como Executar

1. **Clone ou baixe** o projeto para sua máquina.
2. **Abra o projeto** em sua IDE Java de preferência.
3. Compile e execute o arquivo `CRUDJogos.java`.
4. Utilize o menu no terminal para interagir com o sistema.

---

## 💡 Exemplo de Uso

```
=== Menu CRUD de Jogos ===
1 - Cadastrar jogo
2 - Listar jogos
3 - Atualizar jogo
4 - Excluir jogo
5 - Sair
Escolha uma opção:
```

---

## 📌 Observações

- Os dados são armazenados apenas em **memória (RAM)** com uso de `ArrayList`. Ao encerrar o programa, os dados são perdidos.
- Para adicionar persistência, recomenda-se o uso de banco de dados como **MySQL** ou **SQLite** junto ao **JDBC**.

---

## 👨‍💻 Autor

> Desenvolvido por **Kaike Munhoz**  
> Curso: **Análise e Desenvolvimento de Sistemas (ADS)**  
> Faculdade: _[Nome da sua faculdade aqui]_  
> Ano: 2025

---

## 📝 Licença

Este projeto é de uso acadêmico e livre para fins educacionais.
