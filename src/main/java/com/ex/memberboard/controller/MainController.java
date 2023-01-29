package com.ex.memberboard.controller;

import com.ex.memberboard.dto.BoardSaveDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("movie_tap")
    public String movie_tap(){return "movie_tap";}

    @GetMapping("book_tap")
    public String book_tap(){return "book_tap";}


}
