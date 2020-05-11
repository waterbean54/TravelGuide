package com.travel.guide.board.mapper;

import com.travel.guide.board.model.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public List<BoardVO> getBoardList();
}
