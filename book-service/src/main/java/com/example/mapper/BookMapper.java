package com.example.mapper;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface BookMapper {

    @Select("select id, title, remark from db_book where id = #{id}")
    Optional<Book> getBookById(@Param("id") int id);
}
