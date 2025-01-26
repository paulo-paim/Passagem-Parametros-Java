
# Passagem de Parâmetros Em Java/Spring

Neste projeto, o intuito era desenvolver os principais métodos de passagem de parâmetros em uma API em Java utilizando Spring.

Foi construído uma API que se conecta com uma base de dados PostgreSQL com o intuito de armazenar dados de pessoa, tais como nome, cpf, rg, rua, numero, bairro, cidade.


### Body
Quando encaminhamos uma requisição com informações no corpo da requisição, devemos receber essa informação como @RequestBody.
No caso desta API, este recurso foi utilizado para a criação de novos cadastros (POST).

### Path Variable
Este recurso é muito utilizado quando queremos buscar as informações de um recurso por meio de algum dado conhecido. No projeto, este recurso foi implementado para buscar as informações da pessoa com base no id gerado no momento de inclusão no banco de dados.
Este recurso foi implementado por meio da anotação @PathVariable e o id da pessoa fica na própria URL (api/pessoa/2).

### Query Param
Esta opção é muito utilizada quando queremos criar filtros de busca, por exemplo, em uma loja de produtos. Precisamos utilizar a anotação @RequestParam, além de indicar se é obrigatória ou não. Quando utlizamos o query param, os filtros aplicados ficam na URL, antecedidos de um ? (api/pessoa/buscar?nome=Paulo).

### Header
Outra forma de enviarmos parâmetros para a API é por meio do Header da requisição HTTP. Neste caso, precisamos adicionar a anotação @RequestHeader no controller que receberá a informação passada.
No caso desta API, este recurso foi criado para realizar a busca de uma pessoa, similar ao Path Variable.
