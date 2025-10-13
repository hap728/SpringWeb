package com.smhrd.web.repository;

import com.smhrd.web.dto.Cloud_Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Cloud_Member, Long> {

    // findAll() : select * from cloud_member
    @Override
    List<Cloud_Member> findAll();

}
