package org.koreait.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex02 {
    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init(){
        Member member = new Member();

        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("123456789");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);
        em.flush();
        em.clear();
    }

    @Test
    void test1(){
        Member member = em.find(Member.class, 1L);
        System.out.println(member);

        Member member1 = em.find(Member.class, 1L);
        System.out.println(member1);
    }
}