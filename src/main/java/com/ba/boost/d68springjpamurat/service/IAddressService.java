package com.ba.boost.d68springjpamurat.service;

import com.ba.boost.d68springjpamurat.model.dto.request.AddressAddRequest;
import com.ba.boost.d68springjpamurat.model.dto.request.AddressUpdateRequest;
import com.ba.boost.d68springjpamurat.model.entity.AddressEntity;

public interface IAddressService {

    AddressEntity addAddress(AddressAddRequest request);
    AddressEntity getAddress(Long addressId);
    AddressEntity updateAddress(Long addressId, AddressUpdateRequest request);
    void deleteAddress(Long addressId);

}
