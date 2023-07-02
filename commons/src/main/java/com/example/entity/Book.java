package com.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {

    private Integer id;

    private String title;

    private String remark;
}
