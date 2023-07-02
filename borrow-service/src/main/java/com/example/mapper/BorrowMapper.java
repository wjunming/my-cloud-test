package com.example.mapper;

import com.example.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BorrowMapper {

    @Select("select * from db_borrow where user_id = #{userId}")
    List<Borrow> getBorrowByUserId(@Param("userId") int userId);

    @Select("select * from db_borrow where book_id = #{bookId}")
    List<Borrow> getBorrowByBookId(@Param("bookId") int bookId);

    @Select("select * from db_borrow where user_id = #{userId} and book_id = #{bookId}")
    Optional<Borrow> getBorrow(@Param("userId") int userId, @Param("bookId") int bookId);
}
