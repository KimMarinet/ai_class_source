package org.koreait.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@Transactional
@SpringBootTest
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

//    @BeforeEach
//    void init(){
//        em.getTransaction().begin();
//    }
//
//    @AfterEach
//    void after(){
//        em.getTransaction().commit();
//    }

    @Test
    void test1(){
        Member member = new Member();

        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("123456789");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태로 만들기 -> 엔티티의 변화를 감지할 수 있도록 영속성 콘텍스 메모리에 전달
        em.flush(); // 변화 상태를 DB에 영구 반영

        em.detach(member); // 콘텍스 메모리에서 빠짐

        member.setName("(수정)user01"); // update
        em.flush();

        em.merge(member); // 다시 콘텍스 메모리에 추가 (단 변화 감지를 위해  SELECT 문이 재차 실행됨)

//        em.remove(member); // 삭제 아님!!! 제거  상태로 영속 상태를 변경
//        em.flush(); // delete query 실행
    }
}
