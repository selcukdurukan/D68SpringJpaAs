package com.ba.boost.d68springjpamurat.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressUpdateRequest {

    @NotNull
    private String addressName;

    @NotNull
    private String country;

    @NotNull
    private String city;

    @NotNull
    private String neighbourhood;

    @NotNull
    private String street;

    private String postalCode;
    private String address;
}
