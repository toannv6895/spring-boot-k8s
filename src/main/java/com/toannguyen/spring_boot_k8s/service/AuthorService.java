package com.toannguyen.spring_boot_k8s.service;

import com.toannguyen.spring_boot_k8s.entity.Author;

import java.util.List;

public interface AuthorService {
    Author create(Author entity);
    Author update(Author entity);
    Author getOne(String id) ;
    List<Author> getAll();
    void delete(String id);
}
