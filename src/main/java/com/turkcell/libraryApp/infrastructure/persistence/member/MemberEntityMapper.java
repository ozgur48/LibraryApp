package com.turkcell.libraryApp.infrastructure.persistence.member;

import com.turkcell.libraryApp.domain.member.model.*;
import org.springframework.stereotype.Component;

@Component
public class MemberEntityMapper {
    public JpaMemberEntity toEntity(Member member){
        JpaMemberEntity memberEntity = new JpaMemberEntity();

        memberEntity.setId(member.id().value());
        memberEntity.setName(member.name().value());
        memberEntity.setEmail(member.email().value());
        memberEntity.setPhone(member.phone().value());
        memberEntity.setAddress(new JpaAddress(member.address().street(), member.address().city(), member.address().zipCode(), member.address().country()));
        memberEntity.setMemberShipLevel(member.memberShipLevel());
        memberEntity.setMemberStatus(member.memberStatus());
        return memberEntity;
    }
    public Member toDomain(JpaMemberEntity entity){
        return Member.rehydrate(
                new MemberId(entity.id()),
                new Name(entity.name()),
                new Email(entity.email()),
                new Phone(entity.phone()),
                new Address(entity.address().street(), entity.address().city(), entity.address().zipCode(), entity.address().country()),
                entity.memberShipLevel(),
                entity.memberStatus()
        );
    }
}
