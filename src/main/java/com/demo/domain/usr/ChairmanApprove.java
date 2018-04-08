package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "chairman_approve")
public class ChairmanApprove extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String uid;

    private String cid;

    @Column(name = "approve_date")
    private Date approveDate;

    private Integer status;

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
     * @return uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }


    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return approve_date
     */
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
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
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