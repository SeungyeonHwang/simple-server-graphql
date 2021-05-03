package net.suby.springbootgraphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.suby.springbootgraphql.domain.Member;
import net.suby.springbootgraphql.domain.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByMemberId(int memberId);
}
