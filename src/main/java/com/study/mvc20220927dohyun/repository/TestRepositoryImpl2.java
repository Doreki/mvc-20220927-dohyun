package com.study.mvc20220927dohyun.repository;

import org.springframework.stereotype.Component;

public class TestRepositoryImpl2 implements TestRepository{
    @Override
    public void insert() {
        System.out.println("Test2 저장소에 저장하기");
    }

    @Override
    public void select() {
        System.out.println("Test2 저장소에 저장하기");
    }
}
