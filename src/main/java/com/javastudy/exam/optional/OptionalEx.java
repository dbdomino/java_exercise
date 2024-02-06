package com.javastudy.exam.optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();

        Member member = new Member();
        member.setId(2342L);
        member.setName("minod");
        memberRepository.save(member); // 멤버 저장완료

        Optional<Member> result = memberRepository.findByName("minod2");   // 이름으로 찾기
        if (result.isPresent()) {
            // true, 존재하면
            System.out.println(result.isPresent()+"존재");
        } else {
            // false, 존재안함
            System.out.println(result.isPresent()+"존재안함");
        }
        // Optional이 제공하는 ifPresent를 사용해서 null을 확인하는 if 문을 줄일 수 있다.
        result.ifPresent(m -> {   // 존재안할경우 실행안됨. 위보다 간결
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });
    }
}
