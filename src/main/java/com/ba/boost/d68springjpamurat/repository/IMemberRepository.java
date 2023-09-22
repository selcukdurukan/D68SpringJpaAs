package com.ba.boost.d68springjpamurat.repository;

import com.ba.boost.d68springjpamurat.model.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMemberRepository extends JpaRepository<MemberEntity, Long> {

}
