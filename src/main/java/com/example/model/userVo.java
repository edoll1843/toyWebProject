package com.example.model;

import lombok.*;

@Getter
@Setter
@ToString
public class userVo { //유저 VO
    private String id;  //유저고유 num(auto++)
    private String regDate; //회원가입 날짜
    private String updateDate; //수정 날짜\
    private String loginId; //로그인 아이디
    private String loginPw; //로그인 pw
    private String name;    //사용자 이름
    private String email;   //사용자 이메일
    private String cellphoneNo; //사용자 번호
}
