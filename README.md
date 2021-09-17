# Massa de Dados
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/LICENSE) 

# Sobre o projeto

Massa de Dados é uma aplicação construída durante as aulas de Desenvolvimento de Sistemas, do 2º semestre do Curso Técnico de Desenvolvimento de Sistemas, curso da [ETEC de Embu](https://www.etecdeembu.com.br/ "Site da ETEC de Embu").

A aplicação possui dois formulários, o de Listagem e o de Cadastro.

O formulário de Listagem carrega automaticamente no jTextArea uma lista de um arquivo .txt com uma certa quantidade de funcionários, ai temos um jTextField para ser inserido o número do registro funcional do funcionário, após inserir o usuário clica no botão Consultar, se não existir funcionário com esse registro aparece uma mensagem na tela informando "Colaborador não encontrado!". E caso exista, aparece uma mensagem na tela informando "Colaborador encontrado!" e preenche todos os 9 jTextField (Nome, Nome do Pai, Nome da Mãe, Endereço, RG (Registro Geral), Telefone, E-mail Corporativo, Salário Mensal e Departamento), que estão desativados para edição. Também temos o botão Cadastrar Funcionário, que nos leva para o formulário de Cadastro.

O formulário de Cadastro contém 7 jTextArea, cada um carrega um arquivo .txt diferente. Sendo 6 para dados individuais (Nome, Nome de Homens, Nome de Mulheres, Sobrenomes, Sobrenomes Compostos e Lorgadouro) e 1 para listagem de todos os dados de cada funcionário. Ao começar a aplicação o usuário deve ler todos os 6 arquivos dos jTextArea com dados individuais com os botões Ler, caso queira o usuário pode adicionar digitando jTextField abaixo de cada um e clicando os botões Adicionar, e salvar as alterações com os botões Gravar. Abaixo do jTextArea voltado para a listagem temos um jTextField destinado para ser digitado o Número de registros a serem gerados, após preencher o usuário clica no botão Gerar que o programa gera automaticamente, e pode salvar a nova listagem com o botão Gravar. Ele pode também limpar os dados com o botão Limpar, ler o arquivo .txt com a listagem já existente, também pode fechar o formulário com o botão Fechar, que fecha o formulário de Cadastro e volta para o de Listagem, já atualizando a listagem, caso preciso.

## Layout
### Formulário de Listagem
#### Início
![Listar 1](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar01.JPG)

#### Consultando Funcionário pelo Registro Funcional (encontrado)
![Listagem 2](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar02.JPG)
![Listagem 3](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar03.JPG)
![Listagem 4](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar04.JPG)

#### Consultando Funcionário pelo Registro Funcional (não encontrado)
![Listagem 5](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar05.JPG)
![Listagem 6](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Listar06.JPG)

### Formulário de Cadastro
#### Início
![Cadastro 1](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar01.JPG)

#### Lendo os arquivos com dados individuais
![Cadastro 2](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar02.JPG)

#### Adicionando dados as listas com dados individuais
![Cadastro 3](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar03.JPG)
![Cadastro 4](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar04.JPG)

#### Gravando as listas com os novos dados adicionados
![Cadastro 5](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar05.JPG)

#### Lendo a listagem já existente
![Cadastro 6](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar06.JPG)

#### Limpando o jTextArea destinado a listagem
![Cadastro 7](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar07.JPG)

#### Gerando uma nova lista
![Cadastro 8](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar08.JPG)
![Cadastro 9](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar09.JPG)

#### Gravando a nova lista
![Cadastro 10](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar10.JPG)
![Cadastro 11](https://github.com/MatheusCoutinho10/MassaDeDados/blob/master/assets/Cadastrar11.JPG)

# Tecnologias utilizadas
## Back end
- Java
  - Lógicas de Programação
  - Desabilitação de Componentes
  - Leituras e Gravação de arquivos
  - Desativação e Ativação de Visibilidade de Formulários
  - Metódos if/Else para verificação
  - Métodos de loop para armazenamento de dados
  - JOptionPane para exibir a mensagem
## Front end
- Form JFrame
  - JLabel
  - JTextField
  - JButton
  - JTextArea
## Implantação em produção
- Back end: NetBeans IDE
- Front end: NetBeans IDE

# Como executar o projeto

- Pré-requisitos: JRE (Java Runtime Environment)

```bash
# clonar repositório
git clone https://github.com/MatheusCoutinho10/MassaDeDados

# entrar na pasta do executável
cd MassaDeDados

# executar o projeto
MassaDeDados.jar spring-boot:run
```

# Autor

Matheus Henrique Martins Coutinho

https://www.linkedin.com/in/matheushmcoutinho/

# Agradecimentos

[ETEC de Embu](https://www.etecdeembu.com.br/ "Site da ETEC de Embu")
