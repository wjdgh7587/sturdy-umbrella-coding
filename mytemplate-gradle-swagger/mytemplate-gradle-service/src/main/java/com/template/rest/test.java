package com.template.rest;

import com.template.entity.Member;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class test {


    @GetMapping("/test")
    @Operation(summary = "Testing")
    public String test(){

        Member member = Member.builder()
                .name("JJeongho!!!")
                .build();

        log.info(member.getName());

        return member.getName();
    }
}
