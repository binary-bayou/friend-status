package com.binarybayou.domains;

import org.springframework.data.domain.Persistable;

import javax.persistence.Entity;

/**
 * Created by Joshua Eaton on 8/15/17.
 */
@Entity(name = "User")
public class User extends BaseEntity implements Persistable<Long> {
    @Override
    public boolean isNew() {
        return false;
    }
}
