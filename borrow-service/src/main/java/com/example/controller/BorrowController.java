package com.example.controller;

import com.example.service.BorrowService;
import com.example.vo.BorrowVO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class BorrowController {

    private final BorrowService borrowService;

    public BorrowController(BorrowService borrowService) {
        this.borrowService = borrowService;
    }

    @GetMapping("/borrow/{userId}")
//    @HystrixCommand(fallbackMethod = "onError")
    public BorrowVO getUserBorrowDetailByUserId(@PathVariable("userId") int userId) {
        return borrowService.getUserBorrowDetailByUserId(userId);
    }

    public BorrowVO onError(int userId) {
        return new BorrowVO(null, Collections.emptyList());
    }
}
