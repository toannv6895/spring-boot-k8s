package com.toannguyen.spring_boot_k8s.service.impl;

import com.toannguyen.spring_boot_k8s.entity.Book;
import com.toannguyen.spring_boot_k8s.repository.BookRepository;
import com.toannguyen.spring_boot_k8s.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    private final BookRepository repository;

    public BookServiceImpl(BookRepository repo) {
        this.repository = repo;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Book create(Book d) {
        try {
            return repository.save(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book update(Book d) {
        try {
            return repository.update(d);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book getOne(String id) {
        try {
            return repository.findById(id).orElse(null);

        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Book> getAll() {
        try {
            return repository.findAll();

        } catch (Exception ex) {
            return Collections.emptyList();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}