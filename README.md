# Sistema de Gestão de Usuários Corporativos 🏢

Aplicação desenvolvida em **Java 21** para modelar e gerenciar diferentes papéis de usuários dentro de um ambiente corporativo/comercial, aplicando conceitos fundamentais de **Orientação a Objetos (POO)** como **Herança**, **Abstração** e **Encapsulamento**.

---

## 📌 Funcionalidades e Regras de Negócio

O sistema divide os acessos em três níveis hierárquicos derivados da classe mãe `Usuario`:

### 1. **Gerente** *(Administrador)*

* **Status Admin:** Sempre `true` por padrão.
* **Ações Exclusivas:**
* Gerar relatório financeiro do sistema.
* Consultar vendas gerais da empresa.



### 2. **Vendedor** *(Não-Administrador)*

* **Status Admin:** Sempre `false`.
* **Atributo Específico:** Controle da quantidade de vendas realizadas.
* **Ações Exclusivas:**
* Realizar venda (incrementa o contador de vendas).
* Consultar total de vendas próprias.



### 3. **Atendente** *(Não-Administrador)*

* **Status Admin:** Sempre `false`.
* **Atributo Específico:** Controle do valor atual disponível em caixa.
* **Ações Exclusivas:**
* Receber pagamentos (incrementa o saldo do caixa).
* Fechar o caixa e exibir o saldo final.



### 4. **Ações Comuns (Classe Mãe `Usuario`)**

Todos os usuários possuem acesso a:

* Realizar login no sistema.
* Realizar logoff.
* Alterar dados cadastrais (nome e e-mail).
* Alterar senha de acesso.

---

## 🏗️ Arquitetura e Modelagem de Classes

```text
                  [ Abstract Class ]
                       Usuario
       (Nome, Email, Senha, eAdministrador)
        /                 |                 \
       /                  |                  \
  Gerente              Vendedor            Atendente
(Admin: true)       (Admin: false)       (Admin: false)
                     quantidadeVendas     valorEmCaixa

```

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21 (JDK 21)
* **IDE Recomendada:** IntelliJ IDEA
* **Versionamento:** Git & GitHub

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git

```


2. **Abra o projeto no IntelliJ IDEA** (ou IDE de sua preferência).
3. **Navegue até o arquivo principal:**
`src/Main.java`
4. **Execute o arquivo `Main.java**` para testar as simulações de login, vendas, fechamento de caixa e permissões de administrador.

---

## ✒️ Autor

Desenvolvido por **[Vinicius Leandro]** durante o treinamento de Java.
