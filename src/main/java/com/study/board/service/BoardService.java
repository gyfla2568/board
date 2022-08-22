package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    //원래는 private BoardRepository boardRepository;=new 이렇게 하는데, autowired사용하면 됨
   private BoardRepository boardRepository;

    //Board라는 클래스에 board라는 이름의 변수를 넣어준다,
    //글 작성
    public void write(Board board){

        boardRepository.save(board);
    }
    //게시글 리스트 처리
    public List<Board> boardList(){
        return boardRepository.findAll();
    }
    //특정 게시글 불러오기
    public Board boardView(Integer id){
        return boardRepository.findById(id).get();
    }
    //특정 게시글 삭제
    public void boardDelete(Integer id){
        boardRepository.deleteById(id);
    }
}
