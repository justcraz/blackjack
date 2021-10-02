package com.example.demo.controller.api;

import com.example.demo.model.Board;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/board")
public class BoardRestController {

    @RequestMapping("/get/new")
    public Board getNew(){
        return new Board();
    }
}
