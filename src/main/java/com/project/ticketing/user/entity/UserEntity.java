package com.project.ticketing.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserEntity {
    @Id
    String userKey;

    String userId;


}
