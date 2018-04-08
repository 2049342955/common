package com.demo.domain.usr;

import com.demo.domain.BaseDomain;
import com.demo.utils.CustomDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.util.Date;

@Table(name = "action_approve")
public class ActionApprove extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String aid;

    @Column(name = "approve_date")
    private Date approveDate;

    private String status;

    private String description;

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
     * @return aid
     */
    public String getAid() {
        return aid;
    }

    /**
     * @param aid
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    /**
     * @return approve_date
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getApproveDate() {
        return approveDate;
    }

    /**
     * @param approveDate
     */
    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
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