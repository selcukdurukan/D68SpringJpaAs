package com.ba.boost.d68springjpamurat.service;

import com.ba.boost.d68springjpamurat.model.dto.request.CreateMemberRequest;
import com.ba.boost.d68springjpamurat.model.dto.request.UpdateMemberRequest;
import com.ba.boost.d68springjpamurat.model.entity.MemberEntity;


public interface IMemberService {

    MemberEntity createMember(CreateMemberRequest request);

    MemberEntity getMember(Long id);

    void deleteMember(Long id);

    MemberEntity updateMember(Long id, UpdateMemberRequest request);

}
