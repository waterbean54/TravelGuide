package com.travel.guide.account.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Account {

    private long id_num;
    private String id_email;
    private String pw_password;
    private Timestamp dt_regist;

}
