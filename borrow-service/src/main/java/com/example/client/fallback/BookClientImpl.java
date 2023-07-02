package com.example.client.fallback;

import com.example.client.BookClient;
import com.example.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookClientImpl implements BookClient {

    @Override
    public Book getBookById(int id) {
        return new Book();
    }
}
