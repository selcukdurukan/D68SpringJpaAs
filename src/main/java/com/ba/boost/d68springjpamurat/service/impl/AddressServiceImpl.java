package com.ba.boost.d68springjpamurat.service.impl;

import com.ba.boost.d68springjpamurat.model.dto.request.AddressAddRequest;
import com.ba.boost.d68springjpamurat.model.dto.request.AddressUpdateRequest;
import com.ba.boost.d68springjpamurat.model.entity.AddressEntity;
import com.ba.boost.d68springjpamurat.repository.IAddressRepository;
import com.ba.boost.d68springjpamurat.service.IAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements IAddressService {

    private final IAddressRepository addressRepository;

    @Override
    public AddressEntity addAddress(AddressAddRequest request) {
        return null;
    }

    @Override
    public AddressEntity getAddress(Long addressId) {
        return null;
    }

    @Override
    public AddressEntity updateAddress(Long addressId, AddressUpdateRequest request) {
        return null;
    }

    @Override
    public void deleteAddress(Long addressId) {

    }
}
