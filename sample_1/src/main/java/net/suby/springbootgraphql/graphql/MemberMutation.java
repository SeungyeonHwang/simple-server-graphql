package net.suby.springbootgraphql.graphql;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.suby.springbootgraphql.domain.Member;
import net.suby.springbootgraphql.domain.Role;
import net.suby.springbootgraphql.dto.MemberDto;
import net.suby.springbootgraphql.repository.MemberRepository;
import net.suby.springbootgraphql.repository.RoleRepository;

import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Transactional
public class MemberMutation implements GraphQLMutationResolver {

    private final MemberRepository memberRepository;

    private final RoleRepository roleRepository;

    public MemberDto createMember(MemberDto memberDto) {
        Member member = memberRepository.save(Member.builder()
                                                    .loginId(memberDto.getLoginId())
                                                    .name(memberDto.getName())
                                                    .password(memberDto.getPassword())
                                                    .build());
        return MemberDto.from(member);
    }

    public Boolean deleteMember(int id){
        Optional<Member> optionalMember = memberRepository.findById(id);
        Role role = roleRepository.findByMemberId(id);
        if(optionalMember.isPresent()) {
            roleRepository.delete(role);
            memberRepository.delete(optionalMember.get());
        }
        return true;
    }
}
