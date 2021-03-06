package net.suby.springbootgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.suby.springbootgraphql.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

}
