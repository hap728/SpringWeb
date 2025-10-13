package com.smhrd.web.service;

import com.smhrd.web.dto.Cloud_Member;
import com.smhrd.web.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository repo;

    public  MemberService(MemberRepository repo){
        this.repo=repo;
    }

    // 전체 명단 조회
    public List<Cloud_Member> memberList(){
        return repo.findAll();
    }


}
