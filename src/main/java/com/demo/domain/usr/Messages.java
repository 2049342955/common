package com.demo.domain.usr;

import com.demo.domain.BaseDomain;
import com.demo.utils.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Messages extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String name;

    private String message;

    private String status;

    private Date date;

    private Integer versions;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }


    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return versions
     */
    public Integer getVersions() {
        return versions;
    }

    /**
     * @param versions
     */
    public void setVersions(Integer versions) {
        this.versions = versions;
    }
}