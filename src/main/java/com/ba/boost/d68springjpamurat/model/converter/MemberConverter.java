package com.ba.boost.d68springjpamurat.model.converter;

import com.ba.boost.d68springjpamurat.model.dto.request.CreateMemberRequest;
import com.ba.boost.d68springjpamurat.model.dto.response.MemberResponse;
import com.ba.boost.d68springjpamurat.model.entity.MemberEntity;
import com.ba.boost.d68springjpamurat.model.enums.GenderEnum;

import java.util.Date;

public class MemberConverter {

    public static MemberEntity convertToMember(CreateMemberRequest request) {
        if (request == null)
            return null;

        return MemberEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .phoneCode(request.getPhoneCode())
                .phone(request.getPhone())
                .gender(convertToGender(request.getGender()))
                .createdDate(new Date())
                .build();
    }

    public static MemberResponse convertToResponse(MemberEntity member) {
        if (member == null)
            return null;

        return MemberResponse.builder()
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .email(member.getEmail())
                .phone(member.getPhoneCode() + member.getPhone())
                .build();
    }

    private static GenderEnum convertToGender(String gender) {
        if (gender == null)
            return null;

        return switch (gender) {
            case "MALE" -> GenderEnum.MALE;
            case "FEMALE" -> GenderEnum.FEMALE;
            default -> null;
        };
    }




}