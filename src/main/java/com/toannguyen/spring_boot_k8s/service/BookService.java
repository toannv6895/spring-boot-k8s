package com.toannguyen.spring_boot_k8s.service;

import com.toannguyen.spring_boot_k8s.entity.Book;

import java.util.List;

public interface BookService {
    Book create(Book d);
    Book update(Book d);
    Book getOne(String id);
    List<Book> getAll();
    void delete(String id);
}
