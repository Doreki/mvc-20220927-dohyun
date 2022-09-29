package com.study.mvc20220927dohyun.controller.api;

import com.study.mvc20220927dohyun.dto.UserReqDto;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class UserTestApi {

    @PostMapping("/api/test/user/param")
    @ResponseBody
    public String addUserParam(@RequestParam String username,
                               @RequestParam String password,
                               @RequestParam String name,
                               @RequestParam String email) {

        Map<String,String> userInfo = new LinkedHashMap<String,String>();

        userInfo.put("username", username);
        userInfo.put("password", password);
        userInfo.put("name", name);
        userInfo.put("email", email);

        System.out.println("userInfo.toString() = " + userInfo.toString());

        return userInfo.toString();
    }

    @PostMapping("/api/test/user/dto")
    @ResponseBody
    public String addUserDto(UserReqDto userReqDto) {

//        Map<String,String> userInfo = new LinkedHashMap<String,String>();
//
//        userInfo.put("id", userReqDto.getName());
//        userInfo.put("password", userReqDto.getPassword());
//        userInfo.put("name", userReqDto.getName());
//        userInfo.put("email", userReqDto.getEmail());

        return userReqDto.toString();
    }

    @ResponseBody //html이 아닌 데이터를 반환해줄때
    @PostMapping("/api/test/user/json") //json객체를 받으려면 @RequestBody 붙여야함
    public Object addUserJSON(@RequestBody UserReqDto userReqDto) {
        List<Map<Integer,UserReqDto>> list = new ArrayList<>();

        Map<Integer, UserReqDto> map = null;

        for (int i = 0; i < 100; i++) {
            if(i == 0 || i % 10 == 0){
                map = new TreeMap<Integer,UserReqDto>();
            }
            map.put(i + 1, userReqDto);

            if((i -9) % 10 == 0) {
                list.add(map);
            }
        }
        return list;
    }
}
