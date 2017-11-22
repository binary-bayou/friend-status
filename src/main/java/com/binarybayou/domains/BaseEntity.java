package com.binarybayou.domains;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Joshua Eaton on 8/28/17.
 */
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getVersion() { return version; }

    public void setVersion(Date version) { this.version = version; }
}
