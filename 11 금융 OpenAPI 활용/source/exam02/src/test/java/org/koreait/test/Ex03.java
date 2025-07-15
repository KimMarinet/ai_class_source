package org.koreait.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
@SpringBootTest
public class Ex03 {
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() throws Exception{
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("123456789");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);
        em.flush();
        em.clear();

        member = em.find(Member.class, member.getSeq());
        Thread.sleep(5000);

        System.out.println(member.getCreatedAt());
        System.out.println(member.getModifiedAt());

        member.setName("(수정)user01");
        em.flush();
        em.clear();

        member = em.find(Member.class, member.getSeq());

        System.out.println(member.getCreatedAt());
        System.out.println(member.getModifiedAt());
    }
}
