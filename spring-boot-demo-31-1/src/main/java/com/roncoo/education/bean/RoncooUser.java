package com.roncoo.education.bean;

import java.io.Serializable;
import java.util.Date;

public class RoncooUser implements Serializable {
    private Integer id;

    private String name;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName())
        .append(" [").append("Hash = ")
        .append(hashCode())
        .append(", id=").append(id)
        .append(", name=").append(name)
        .append(", createTime=").append(createTime)
        .append(", serialVersionUID=").append(serialVersionUID)
        .append("]");
        return sb.toString();
    }
}