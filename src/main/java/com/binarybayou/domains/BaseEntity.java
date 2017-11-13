package com.binarybayou.domains;

import javax.persistence.*;

/**
 * Created by Joshua Eaton on 8/28/17.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() { return version; }

    public void setVersion(Long version) { this.version = version; }
}
