package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Borrow implements Serializable {

    private Integer id;

    private Integer user_id;

    private Integer book_id;
}
