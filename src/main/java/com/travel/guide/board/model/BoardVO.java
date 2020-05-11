package com.travel.guide.board.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
//@NoArgsConstructor
public class BoardVO{

    private String dc_subject;
    private String dc_content;
    private String id_email;
    private String id_tags;
    private String id_images;
    private Timestamp dt_first_regist;
    private Timestamp dt_last_regist;


}
