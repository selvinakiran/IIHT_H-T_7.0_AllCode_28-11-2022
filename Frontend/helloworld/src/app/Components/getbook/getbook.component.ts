import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book'
import  { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-getbook',
  templateUrl: './getbook.component.html',
  styleUrls: ['./getbook.component.css']
})
export class GetbookComponent implements OnInit {

  books: Book[] = [];

  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    const promise = this.bookService.getAllBooks();
    promise.subscribe(
      (res) => {
        console.log(res);
        this.books = res as Book[];
      });
  }

  deleteBook(book: any, index: any) {
    const observable = this.bookService.deleteBook(book);
    observable.subscribe(
      (res) => {
        console.log(res);
        this.books.splice(index, 1);
      }
    )
  }
}
