package com.jp.springboot.repository;

import com.jp.springboot.Application;
import com.jp.springboot.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class MemberCrudTest {
    @Autowired
    MemberRepository repository;

    @Test
    public void saveMemberTest() throws Exception {
        Member member = new Member();
        member.setName("Oliver Evans");

        repository.save(member);
    }

    @Test
    public void deleteMemberTest() throws Exception {
        repository.deleteById(1L);
    }
}
