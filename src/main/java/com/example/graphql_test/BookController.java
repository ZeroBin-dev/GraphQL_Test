package com.example.graphql_test;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequiredArgsConstructor
public class BookController {

  private static Map<String, Book> books = new HashMap<>();

  static {
    books.put("1", new Book("1", "Harry Potter and the Philosopher's Stone", "J.K. Rowling"));
    books.put("2", new Book("2", "The Hobbit", "J.R.R. Tolkien"));
  }

  @QueryMapping
  public Book getBookById(@Argument String id) {
    return books.get(id);
  }

}
