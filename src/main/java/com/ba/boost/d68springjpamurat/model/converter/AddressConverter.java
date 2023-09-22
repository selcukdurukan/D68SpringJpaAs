package com.ba.boost.d68springjpamurat.model.converter;

import com.ba.boost.d68springjpamurat.model.dto.request.AddressAddRequest;
import com.ba.boost.d68springjpamurat.model.entity.AddressEntity;

public class AddressConverter {

    public static AddressEntity convertToAddress(AddressAddRequest request) {

        if (request==null)
            return null;

        return AddressEntity.builder()
                .addressName(request.getAddressName())
                .country(request.getCountry())
                .city(request.getCity())
                .neighbourhood(request.getNeighbourhood())
                .street(request.getStreet())
                .postalCode(request.getPostalCode())
                .address(request.getAddress())
                .build();
    }
}
