package com.study.mvc20220927dohyun.dto;

import lombok.*;

@Data
public class TestReqDto {
    private String strData;
    private String name;
    private int number;

    public TestReqDto(String strData, String name, int number) {
        this.strData = strData;
        this.name = name;
        this.number = number;
    }
}
