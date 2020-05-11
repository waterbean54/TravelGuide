package com.travel.guide.board.service;

import com.travel.guide.board.mapper.BoardMapper;
import com.travel.guide.board.model.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    @Autowired
    BoardMapper boardMapper;

    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }
}
