package com.example.exemple1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class BookRestController {

	@Autowired
	BookService bookService;

	@GetMapping("/allbooks")
	public Iterable<Book> showAllBooks() {

		return bookService.queryBooks();
	}

	@PostMapping(path = "/addBook", consumes = "application/json")
	public void insertBook(@RequestBody Book book) {

		bookService.queryAddBook(book);

	}

	@DeleteMapping("/deleteBook/{title}")
	public void deleteBook(@PathVariable String title) {

		System.out.println(title);

		if (bookService.findBookByTitle(title) != -1)
			bookService.queryDeleteBook(title);
		
	}

}
