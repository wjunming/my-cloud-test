package com.example.service.impl;

import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookMapper bookMapper;

    public BookServiceImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public Book getBookById(int id) {
        return bookMapper.getBookById(id)
            .orElseThrow(() -> new IllegalArgumentException("illegal book id"));
    }
}
