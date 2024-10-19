package com.example.one_hour_project.member.repository;

import com.example.one_hour_project.member.repository.repository.entity.Member;
import com.example.one_hour_project.member.repository.repository.entity.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberControllerRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("flature")
                .name("플래처")
                .phoneNumber("010-5914-3810")
                .build();
        // create test
        memberRepository.save(member);

        // get test
        Member foundMember = memberRepository.findById(1L).get();

    }

}

