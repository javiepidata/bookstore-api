# Bookstore API
This application illustrates an API implementation to manage objects of type Book, using Anypoint Studio's tooling for building REST APIs with RAML interfaces: APIkit
## How it Works
This application is based on a RAML specification file, which you can find in the src/main/api folder in the package explorer. 
The bookstore API consists of five flows to manage books.
#### getBooksFlow
#### updateBookFlow
#### deleteBookFlow
#### getBookByIdFlow
#### addBookFlow

In all request you must include a header called User
Send a GET request to http://localhost:8081/api/books, You should receive a response with books stored.

Send a POST to http://localhost:8081/api/books with the body equals to

```
    {
        "title": "Logica",
        "author": "Aristoteles",
        "pages": 545
    }
```

You should receive a response with the book data and status code 201.

```{
    "title": "Logica",
    "author": "Aristoteles",
    "pages": 545,
    "id": 4
}
```

Send a PUT request to http://localhost:8081/api/books/4 with the body equals to

```{
    "title": "Metafisica",
    "author": "Aristoteles",
    "pages": 628,
    "id": 4
}
```

You should receive a response with status code 200 ok.

Send a GET request to http://localhost:8081/api/books?title=Metafisica
You should receive the book requested with status code 200 ok.

Send a DELETE request to http://localhost:8081/api/books/4
You should receive a response with status code 204.

 

