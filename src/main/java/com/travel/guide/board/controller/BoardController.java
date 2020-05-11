package com.travel.guide.board.controller;

import com.travel.guide.board.model.BoardVO;
import com.travel.guide.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/board")
    public String board(){
        return "board/board";
    }

    @ResponseBody
    @RequestMapping("/getBoardList")
    public List<BoardVO> getBoardList(){
        List<BoardVO> list = boardService.getBoardList();
        return list;
    }
}
