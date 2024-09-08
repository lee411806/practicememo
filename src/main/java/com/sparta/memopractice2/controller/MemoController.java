package com.sparta.memopractice2.controller;


import com.sparta.memopractice2.dto.MemoResponseDto;
import com.sparta.memopractice2.dto.RequestDto;
import com.sparta.memopractice2.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;


    // @RequestBody -> 자동으로 json 데이터 java로 매핑한다.
    // jackon lib을 통해 그렇게 만드는데 jackson은 spring에 있다.
    @PostMapping("/memos")
    public void memoCreate(@RequestBody RequestDto requestDto){
        memoService.memoCreate(requestDto);
    }

    @GetMapping("/memos")
    public List<MemoResponseDto> getMemos(){

    return null;
    }



}
