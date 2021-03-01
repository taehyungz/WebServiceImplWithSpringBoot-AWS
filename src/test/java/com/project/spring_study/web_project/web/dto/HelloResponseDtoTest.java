package com.project.spring_study.web_project.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }

}