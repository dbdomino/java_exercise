package com.javastudy.exam.optional;

import java.util.*;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 * repository 저장소,
 */
public class MemoryMemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
        // store.get(id) null이 반환되는것을 방지하기 위해 Optional로 감싸서 반환하는 걸로 약속함.
        // Optional 객체 생성, 값이 null이므로 ofNullable() 메서드 사용
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name))
                .findAny(); // .findAny() 하나라도 찾으면 Optional에 넣어 반환, 없으면 null을 넣은 Optional로 반환
    }
    public void clearStore() {
        store.clear();
    }
}
