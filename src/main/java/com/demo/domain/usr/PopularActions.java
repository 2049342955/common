package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "popular_actions")
public class PopularActions extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String aid;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "sort_seq")
    private Integer sortSeq;

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
     * @return start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return sort_seq
     */
    public Integer getSortSeq() {
        return sortSeq;
    }

    /**
     * @param sortSeq
     */
    public void setSortSeq(Integer sortSeq) {
        this.sortSeq = sortSeq;
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