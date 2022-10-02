package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    //find...By - ... 에는 findHelloBy 처럼 설명이 들어가기도 한다.
    List<Member> findTop3HelloBy();
}
