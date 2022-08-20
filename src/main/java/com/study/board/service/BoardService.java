package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    //원래는 private BoardRepository boardRepository;=new 이렇게 하는데, autowired사용하면 됨
   private BoardRepository boardRepository;

    //Board라는 클래스에 board라는 이름의 변수를 넣어준다,
    public void write(Board board){

        boardRepository.save(board);
    }
}
