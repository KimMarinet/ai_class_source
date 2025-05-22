package org.koreait.member.repositories;

import org.koreait.member.entities.MemberVO;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MemberRepository extends ListCrudRepository<MemberVO, Long> {

   boolean existsByEmail(String email);
   Optional<MemberVO> findByEmail(String email);

   List<MemberVO> findByRegDtBetween(LocalDateTime sdate, LocalDateTime edate);
}
