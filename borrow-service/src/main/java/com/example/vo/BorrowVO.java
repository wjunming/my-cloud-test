package com.example.vo;

import com.example.entity.Book;
import com.example.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class BorrowVO implements Serializable {

    private User user;

    private List<Book> books;
}
