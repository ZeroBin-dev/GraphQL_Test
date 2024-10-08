package com.example.graphql_test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
  private String id;
  private String title;
  private String author;
}
