Funcionamento do projeto

Para executar o projeto, deve-se primeiro baixar o arquivo zip ou clonar o repositório.
O segundo passo é configurar a conexão do banco de dados no seu computador, exatamente igual ao que está no application.properties, ou seja, deverá possuir a base de dados, usuário e senha com o mesmo nome que está sinalizado no arquivo de conexão.
Logo após carregar todo o projeto e possuir a base dados com o nome exatamente igual ao do arquivo application.properties, você deverá executar o arquivo "JavaApiApplication.java" e verificar se a conexão foi bem sucedida e se o projeto está rodando.
O quarto e último passo, é testar todas as rotas no postman ou swagger, definindo o método que você quer testar (POST, DELETE, PUT, PATCH E GET), colocando o caminho da rota, sendo http://localhost:8080/empresas/ para empresas e http://localhost:8080/produtos/ para os produtos, e passando as informações no cabeçalho, selecionando a opção "raw" e definindo o envio como "JSON".
Um detalhe para os métodos DELETE, PUT, PATCH e GET específico, é que deverá ser passado o CNPJ da empresa no caminho da URL, logo após o "empresas/" e no caso dos  produtos deverá ser passado o ID do produto depois de "produtos/".
Os métodos POST e PUT, deverão ser informados todos os campos, juntamente com o valor.


Integrantes do grupo:
Artur Normandia Silva; RA: 2920482321021
Rafael Benício Santos; RA: 2920482321017
Tayna dos Santos; RA: 2920482321020
Yasmin Monteiro Silva; RA: 2920482321016
