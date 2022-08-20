package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//db에 있는 테이블을 의미
@Entity
@Data
public class Board {

    //pk지정
    @Id
    //제약을 어떻게 해줄 것인지
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String contents;
    private String customer;
}
