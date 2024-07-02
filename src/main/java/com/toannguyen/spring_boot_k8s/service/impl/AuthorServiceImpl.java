package com.toannguyen.spring_boot_k8s.service.impl;

import com.toannguyen.spring_boot_k8s.entity.Author;
import com.toannguyen.spring_boot_k8s.repository.AuthorRepository;
import com.toannguyen.spring_boot_k8s.service.AuthorService;
import org.springframework.stereotype.Service;


import java.util.Collections;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository repository;
    public AuthorServiceImpl(AuthorRepository repo) {
        this.repository = repo;
    }

    public Author create(Author d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Author update(Author d) {
        try {
            return repository.update(d);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Author getOne(String id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public List<Author> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}
