package com.example.model;

import lombok.*;

@Getter
@Setter
@ToString
public class userVo { //유저 VO
    private String id;
    private String regDate;
    private String updateDate;
    private String loginId;
    private String loginPw;
    private String name;
    private String email;
    private String cellphoneNo;
}
