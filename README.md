# Person-API
 
 
Neste projeto foi implementado um sistema de gerenciamento de pessoas, usando API REST no Spring Boot e a ferramenta Maven.

Para executar o projeto no terminal, use o seguinte comando:

```
mvn spring-boot:run
```

Para executar, será necessário abrir o seguinte endereço:

```
http://localhost:8080/api/v1/people
```

#### Requisições disponíveis:

- GET
- POST
- PUT
- DELETE

Para buscar, atualizar e deletar por id:

```
http://localhost:8080/api/v1/people/{id}
```

Exemplo de JSON para requisição POST:

```
{
    "firstName": "Ricardo",
    "lastName": "Barcelos",
    "cpf": "163.468.659-25",
    "birthDate": "2005-05-18",
    "phones":[
        {
            "type": "HOME",
            "number": "11 91972039214"
        }
    ],
    "address": {
        "address": "Rua Salvador",
        "number": "265",
        "cep": "295646-065",
        "city": "São Salvador",
        "country": "Brasil"
    }
}
```

Exemplo de JSON para requisição PUT:

```
{
    "id": 1,
    "firstName": "Marcelo",
    "lastName": "Barcelos",
    "cpf": "168.162.659-25",
    "birthDate": "2005-05-18",
    "phones":[
        {
            "id": 1,
            "type": "MOBILE",
            "number": "11 95311039214"
        }
    ],
    "address": {
        "id": 1,
        "address": "Rua Salvador",
        "number": "502 Fundos",
        "cep": "295646-065",
        "city": "São Salvador",
        "country": "Brasil"
    }
}

```
