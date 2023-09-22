package com.ba.boost.d68springjpamurat.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

}
