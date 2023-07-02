package com.example.service.impl;

import com.example.client.BookClient;
import com.example.client.UserClient;
import com.example.entity.Book;
import com.example.entity.Borrow;
import com.example.entity.User;
import com.example.mapper.BorrowMapper;
import com.example.service.BorrowService;
import com.example.vo.BorrowVO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BorrowServiceImpl implements BorrowService {

    private final BorrowMapper borrowMapper;
    private final UserClient userClient;
    private final BookClient bookClient;

    public BorrowServiceImpl(BorrowMapper borrowMapper,
                             UserClient userClient,
                             BookClient bookClient) {
        this.borrowMapper = borrowMapper;
        this.userClient = userClient;
        this.bookClient = bookClient;
    }

    @Override
    public BorrowVO getUserBorrowDetailByUserId(int userId) {
        List<Borrow> borrows = borrowMapper.getBorrowByUserId(userId);
        User user = userClient.getUserById(userId);
        List<Book> books = borrows.stream()
            .map(b -> bookClient.getBookById(b.getBook_id()))
            .collect(Collectors.toList());
        return new BorrowVO(user, books);
    }
}
