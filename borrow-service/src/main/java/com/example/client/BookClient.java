package com.example.client;

import com.example.client.fallback.BookClientImpl;
import com.example.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "book-service", fallback = BookClientImpl.class)
public interface BookClient {

    @GetMapping("/book/{id}")
    Book getBookById(@PathVariable("id") int id);
}
