package com.study.mvc20220927dohyun.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserReqDto {

    String username;
    String password;
    String name;
    String email;
}
