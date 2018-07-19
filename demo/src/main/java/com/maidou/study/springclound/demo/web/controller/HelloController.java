package com.maidou.study.springclound.demo.web.controller;

import com.maidou.study.springclound.demo.web.component.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Book book;
    @RequestMapping("/hello")
    public String index() {
        // TODO: 2018/7/19 0019 输出无论页面还是打印都是乱码
        System.out.printf(book.getname()+"      "+book.getauthor());
        return "狼烟风沙口~~~歌名"+book.getname()+"歌手"+book.getauthor()+book.getM_desc();
    }
}
