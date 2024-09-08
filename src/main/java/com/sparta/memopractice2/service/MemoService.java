package com.sparta.memopractice2.service;


import com.sparta.memopractice2.dto.MemoResponseDto;
import com.sparta.memopractice2.dto.RequestDto;
import com.sparta.memopractice2.entity.Memo;
import com.sparta.memopractice2.repository.MemoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {

    private final MemoRepository memoRepository;

    public void memoCreate(RequestDto requestDto) {


        Memo memo = new Memo();
//        memo.setUserName(requestDto.getUserName());
        memo.setContents(requestDto.getContents());

        memoRepository.save(memo);

    }

    public List<Memo> showmemos() {


        return null;

    }
}
