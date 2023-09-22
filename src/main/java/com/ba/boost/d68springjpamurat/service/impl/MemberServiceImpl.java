package com.ba.boost.d68springjpamurat.service.impl;

import com.ba.boost.d68springjpamurat.exception.GlobalException;
import com.ba.boost.d68springjpamurat.model.converter.MemberConverter;
import com.ba.boost.d68springjpamurat.model.dto.request.CreateMemberRequest;
import com.ba.boost.d68springjpamurat.model.dto.request.UpdateMemberRequest;
import com.ba.boost.d68springjpamurat.model.entity.MemberEntity;
import com.ba.boost.d68springjpamurat.repository.IMemberRepository;
import com.ba.boost.d68springjpamurat.service.IMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Optional;

@Transactional
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements IMemberService {

    private final IMemberRepository memberRepository;

    @Override
    public MemberEntity createMember(CreateMemberRequest request) {
        return memberRepository.save(MemberConverter.convertToMember(request));
    }

    @Override
    public MemberEntity getMember(Long id) {
        Optional<MemberEntity> member = memberRepository.findById(id);
        if (member.isEmpty())
            throw new GlobalException("Person not found", HttpStatus.BAD_REQUEST);
        return member.get();
    }

    @Override
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }

    @Override
    public MemberEntity updateMember(Long memberId, UpdateMemberRequest request) {
        MemberEntity member = getMember(memberId);

        if (request.getPhone() != null) member.setPhone(request.getPhone());
        if (request.getPhoneCode() != null) member.setPhoneCode(request.getPhoneCode());
        if (request.getEmail() != null) member.setEmail(request.getEmail());

        member.setUpdatedDate(new Date());
        return memberRepository.save(member);
    }
}
