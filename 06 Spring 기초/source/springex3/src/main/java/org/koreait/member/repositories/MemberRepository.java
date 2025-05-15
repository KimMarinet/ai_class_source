package org.koreait.member.repositories;

import org.koreait.member.entities.Member;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    List<Member> findByRegDtBetweenOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime edate);
    List<Member> findByRegDtBetweenAndNameContainingOrderByRegDtDesc(LocalDateTime sdate, LocalDateTime edate, String keyword);

    @Query("SELECT * FROM MEMBER WHERE regDt BETWEEN :s AND :e AND name LIKE :key ORDER BY regDt DESC")
    List<Member> getMembers(@Param("s") LocalDateTime sdate,@Param("e") LocalDateTime edate,
                            @Param("key") String keyword);
}
