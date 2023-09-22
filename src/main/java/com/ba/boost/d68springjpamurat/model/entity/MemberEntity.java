package com.ba.boost.d68springjpamurat.model.entity;

import com.ba.boost.d68springjpamurat.model.enums.GenderEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class MemberEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_code")
    private String phoneCode;

    @Column(name = "phone")
    private String phone;

    @Column(name ="age")
    private String age;

    @Column(name="gender")
    @Enumerated(value = EnumType.STRING)
    private GenderEnum gender;

    @Column(name = "is_active")
    private boolean isActive;


}
