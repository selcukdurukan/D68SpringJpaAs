package com.ba.boost.d68springjpamurat.repository;

import com.ba.boost.d68springjpamurat.model.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<AddressEntity, Long> {
}
