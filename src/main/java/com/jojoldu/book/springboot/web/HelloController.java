package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//RestController
//컨트롤러를 JSON으로 반환하는 컨트롤러로 만들어줌.
@RestController
public class HelloController {
    //HTTP Method인 Get 요청을 받을 수 있는 API를 만들어줌
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}