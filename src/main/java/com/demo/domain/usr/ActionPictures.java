package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.*;

@Table(name = "action_pictures")
public class ActionPictures extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    private String purl;

    @Column(name = "action_id")
    private String actionId;

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
     * @return purl
     */
    public String getPurl() {
        return purl;
    }

    /**
     * @param purl
     */
    public void setPurl(String purl) {
        this.purl = purl;
    }

    /**
     * @return action_id
     */
    public String getActionId() {
        return actionId;
    }

    /**
     * @param actionId
     */
    public void setActionId(String actionId) {
        this.actionId = actionId;
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