import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

const BASE_URL = "http://localhost:3000/book";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  //create new book
  createBook(book: {
    bookName: String;
    authorName: String;
    price: number;
    genre: String;
    borrowed: boolean;
  }) {
    return this.http.post(BASE_URL + "/addbook", book);
  }

  //get all books
  getAllBooks() {
    return this.http.get(BASE_URL + "/allbooks");
  }

  //delete book
  deleteBook(book: any) {
    return this.http.delete(BASE_URL + "/remove/" + book.id);
  }

}
