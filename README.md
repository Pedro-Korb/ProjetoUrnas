ESCOPO DO PROJETO
Urnas (modelo TSE)
Aluno Pedro Henrique Korb – Pedro.henriquekorb1@gmail.com
04 de novembro de 2024
1.	OBJETIVO
Desenvolver um sistema seguro e eficiente que atenda os perfis de acesso e permita transações de maneira controlada e auditável. Assim como as urnas eletrônicas, o sistema deve garantir autenticidade, integridade dos dados e proteção de informações dos clientes e usuários, devendo fazer um sistema de cadastro de cada pessoa que irá votar, identificando-o como cidadão e somando seu voto (sem identificação) em uma base de dados;

Perfis de Acesso
•	Cliente: Acesso somente na página de cadastro e à sua votação;
•	Admin: O administrador será responsável em verificar se todas as pessoas cadastradas realmente votaram, e emitir a nota eleitoral de cada seção, tendo a base de votos em cada seção eleitoral registrada. 

2.	FUNCIONALIDADES
Autenticação e Criptografia: Utilize uma autenticação segura com senha criptografada (preferencialmente utilizando um método seguro) e um sistema de controle de sessão robusto para garantir que cada usuário tenha acesso somente às suas funções.
Cadastro do cidadão: O cidadão votante de cada seção eleitoral deve preencher seus dados em uma ficha (nome, CPF, data de nascimento) para ter o controle de quantas pessoas votaram em cada urna;
Sistema de votação: 
•	Inicialmente, o projeto é exclusivo para votações municipais (prefeito e vereadores);

•	O sistema irá contar com um algoritmo que conforme o eleitor digita o número do candidato, este já aparece imediatamente como um candidato válido (sendo puxado de uma base de dados), se não aparecer um nenhum candidato, então o voto será anulado;

•	O sistema de votação armazena votos válidos, brancos e nulos;

•	Auditoria e Segurança: Para garantir a integridade dos dados, as informações dos votos devem ser gravadas de maneira que não possam ser alteradas após a confirmação, semelhante ao registro real de votos nas urnas eletrônicas;
•	Gráficos: Se houver possibilidade com a linguagem JAVA, é pretendido realizar gráficos e informações visuais para estabelecer um entendimento facilitado dos votos registrados;

•	Para realizar este projeto, será utilizado conceitos da programação orientada a objetos;

3.	Estrutura Necessária

1.	Classes: 
•	Candidatos – Classe pai dos candidatos seguintes;

•	Pessoa – Classe pai de cidadão e candidatos a cargos político

•	Partido – Classe que emite atributos do partido para candidatos

•	CanditadoPresidente;

•	CanditadoGovernador;

•	CidadaoVotante – Classe filha d para cadastro de pessoas;

•	Votacao – Funcionalidades exclusivas para o voto.

