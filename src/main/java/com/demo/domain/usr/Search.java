package com.demo.domain.usr;

import com.demo.domain.BaseDomain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Search extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    @Column(name = "key_string")
    private String keyString;

    @Column(name = "ref_id")
    private String refId;

    private Integer count;

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
     * @return key_string
     */
    public String getKeyString() {
        return keyString;
    }

    /**
     * @param keyString
     */
    public void setKeyString(String keyString) {
        this.keyString = keyString;
    }

    /**
     * @return ref_id
     */
    public String getRefId() {
        return refId;
    }

    /**
     * @param refId
     */
    public void setRefId(String refId) {
        this.refId = refId;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count
     */
    public void setCount(Integer count) {
        this.count = count;
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