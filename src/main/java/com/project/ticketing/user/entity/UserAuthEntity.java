package com.project.ticketing.user.entity;

import com.project.ticketing.common.entity.BaseEntity;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
@Builder
public class UserAuthEntity extends BaseEntity {
    @Id
    String userKey;

    String password;

    int failCount;
}
