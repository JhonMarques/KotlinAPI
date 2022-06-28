# KotlinAPI
## API Kotlin criada para fins didáticos seguindo curso da Alura

# Como testar:

### Como ainda não está implementada a persistência de dados, os mesmos estão estáticos,
### sendo necessário tilizar o seguinte Json na uri ##http://localhost:8080/topicos/ utilizando o verbo http Post :

{
    "titulo": "Dúvida Kotlin 2",
    "mensagem": "Comom iniciar com Kotlin",
    "idCurso":1,
    "idUsuario":1
}


## Para recuperar os dados inseridos utilize o verbo http Get na seguinte uri ##http://localhost:8080/topicos/

