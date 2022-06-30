# KotlinAPI
## API Kotlin criada para fins didáticos seguindo curso da Alura

# Como testar:

### Como ainda não está implementada a persistência de dados, os mesmos estão estáticos,
### sendo necessário utilizar o seguinte Json na uri http://localhost:8080/topicos/ utilizando o verbo http Post :

{<br>
    "titulo": "Dúvida Kotlin 2", <br>
    "mensagem": "Comom iniciar com Kotlin",<br>
    "idCurso":1,<br>
    "idUsuario":1<br>
}


## Para recuperar os dados inseridos utilize o verbo http Get na seguinte uri http://localhost:8080/topicos/

