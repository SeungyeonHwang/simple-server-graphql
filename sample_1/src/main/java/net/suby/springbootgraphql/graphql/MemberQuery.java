package net.suby.springbootgraphql.graphql;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import net.suby.springbootgraphql.domain.Member;
import net.suby.springbootgraphql.dto.MemberDto;
import net.suby.springbootgraphql.repository.MemberRepository;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@Transactional
public class MemberQuery implements GraphQLQueryResolver {

    private final MemberRepository memberRepository;

    public MemberDto getMember(int id) {
        Member member = memberRepository.findById(id)
                                        .orElse(null);
        return MemberDto.from(member);
    }
}
