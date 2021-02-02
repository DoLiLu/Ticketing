package com.project.ticketing.user.entity;

import com.project.ticketing.common.entity.BaseEntity;
import com.project.ticketing.common.type.Gender;
import com.project.ticketing.common.type.UserType;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Builder
public class UserEntity extends BaseEntity {
    @Id
    String userKey;

    String userId;

    String email;

    UserType type;

    String birthday;

    Gender gender;

}
