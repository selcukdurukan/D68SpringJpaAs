package com.ba.boost.d68springjpamurat.controller;

import com.ba.boost.d68springjpamurat.model.converter.MemberConverter;
import com.ba.boost.d68springjpamurat.model.dto.request.CreateMemberRequest;
import com.ba.boost.d68springjpamurat.model.dto.request.UpdateMemberRequest;
import com.ba.boost.d68springjpamurat.model.dto.response.MemberResponse;
import com.ba.boost.d68springjpamurat.model.entity.MemberEntity;
import com.ba.boost.d68springjpamurat.service.IMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final IMemberService memberService;

    /**
     * localhost:8080/member/create
     * @param request
     * @return
     */



    @PostMapping("/create")
    public MemberResponse createMember(@RequestBody CreateMemberRequest request) {
        return MemberConverter.convertToResponse(memberService.createMember(request));
    }

    /**
     * localhost:8080/member/{memberId}
     * @param memberId
     * @return
     */
    @GetMapping("/{memberId}")
    public MemberResponse getMember(@PathVariable Long memberId) {
        return MemberConverter.convertToResponse(memberService.getMember(memberId));
    }

    @PutMapping("/{memberId}")
    public MemberResponse updateMember(@PathVariable Long memberId, @RequestBody UpdateMemberRequest request) {
        return MemberConverter.convertToResponse(memberService.updateMember(memberId, request));
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Long memberId) {
        memberService.deleteMember(memberId);
    }


}
