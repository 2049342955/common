package com.demo.domain.usr;

import com.demo.domain.BaseDomain;
import com.demo.utils.CustomDateSerializer;
import com.demo.utils.CustomJsonDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Corporation extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String name;

    @Column(name = "createdBy")
    private String createdby;

    private String aim;

    @Column(name = "createdDate")
    private Date createddate;

    private String description;

    private String code;


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
     * @return createdBy
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * @param createdby
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    /**
     * @return aim
     */
    public String getAim() {
        return aim;
    }

    /**
     * @param aim
     */
    public void setAim(String aim) {
        this.aim = aim;
    }

    /**
     * @return createdDate
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * @param createddate
     */
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}