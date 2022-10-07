package com.study.mvc20220927dohyun.service;

import org.springframework.stereotype.Component;

@Component("ts2")
public class TestServiceImpl2 implements TestService{
    @Override
    public void logic1() {
        System.out.println("테스트2 클래스에서 logic1 메소드 실행");
    }

    @Override
    public void logic2() {
        System.out.println("테스트2 클래스에서 logic1 메소드 실행");
    }
}
