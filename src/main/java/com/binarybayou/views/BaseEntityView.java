package com.binarybayou.views;

/**
 * Created by sev on 8/26/17.
 */
public abstract class BaseEntityView {

    private Long id;

    public Long getId() {
            return id;
        }

    public void setId(Long id) {
            this.id = id;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseEntityView that = (BaseEntityView) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
            return id != null ? id.hashCode() : 0;
        }

    @Override
    public String toString() {
        return "BaseEntityView{" +
                "id=" + id +
                '}';
    }
}

