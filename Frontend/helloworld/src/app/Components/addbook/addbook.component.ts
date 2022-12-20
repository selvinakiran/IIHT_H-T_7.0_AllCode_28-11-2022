import { Component, OnInit } from '@angular/core';
import Book from 'src/app/Entity/book'
import  { BookService } from 'src/app/Services/book.service';
import Swal from 'sweetalert2';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addbook',
  templateUrl: './addbook.component.html',
  styleUrls: ['./addbook.component.css']
})
export class AddbookComponent implements OnInit {

  book: Book = new Book();

  

  constructor(private bookService: BookService,private router:Router) {

  }

  
  
  
  createBook() {
    const observables = this.bookService.createBook(this.book);
    observables.subscribe(
      (res: any) => {
        Swal.fire("done","Book has been added successfully","success")
        console.log(res);
      }, function (error) {
        console.log(error);
        alert("Something went wrong !, Please try again");
      }
    )
      this.allbooks();
  }

allbooks(){
  this.router.navigate(["/Get-books"])
}
  ngOnInit(): void {
   
    
  }
}
