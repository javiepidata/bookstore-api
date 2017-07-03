# Bookstore API
This application illustrates an API implementation to manage objects of type Book, using APIkit for building REST APIs with RAML interfaces.
## How it Works
This application is based on a RAML specification file, which you can find in the src/main/api folder in the package explorer. 
The bookstore API consists of five flows to manage books.
In all request you must include a header called User

#### addBookFlow
Send a POST to http://localhost:8081/api/books with the body equals to

```json
    {
        "title": "Logica",
        "author": "Aristoteles",
        "pages": 545
    }
```
You should receive a response with the book data and status code 201.
```json
    {
        "title": "Logica",
        "author": "Aristoteles",
        "pages": 545,
        "id": 4
    }
```
#### getBooksFlow
Send a GET request to http://localhost:8081/api/books, You should receive a response with books stored.
You can use query parameters. Send a GET request to http://localhost:8081/api/books?title=Metafisica
You should receive the book requested with status code 200 ok.

#### updateBookFlow
Send a PUT request to http://localhost:8081/api/books/4 with the body equals to

```json
    {
        "title": "Metafisica",
        "author": "Aristoteles",
        "pages": 628,
        "id": 4
    }
```
You should receive a response with status code 200 ok.

#### deleteBookFlow
Send a DELETE request to http://localhost:8081/api/books/4
You should receive a response with status code 204.

## Exception Strategy Mappings
Studio automatically generates several global exception strategy mappings that the Main flow references to send error responses in HTTP-status-code-friendly format.
The project also has one additional exception strategy defined for the error code 409
 

