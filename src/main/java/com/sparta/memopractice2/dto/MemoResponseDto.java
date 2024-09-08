package com.sparta.memopractice2.dto;

import lombok.Getter;


//초기화 할 때 값 다들 넣어지니까 참고하는 getter만 설정
// 빈 생성자 자동생성됨으로 생성자 애너테이션 안걸어줌
@Getter
public class MemoResponseDto {
    private Long id;
    private String contents;


    public MemoResponseDto(Long id, String contents) {
        this.id = id;
        this.contents = contents;
    }

}
