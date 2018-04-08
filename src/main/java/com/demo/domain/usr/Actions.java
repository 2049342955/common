package com.demo.domain.usr;

import com.demo.domain.BaseDomain;
import com.demo.utils.CustomDateSerializer;
import com.demo.utils.CustomDateTimeSerializer;
import com.demo.utils.CustomJsonDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Actions extends BaseDomain{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select REPLACE(uuid(),'-','')")
    private String id;

    @Column(name = "action_name")
    private String actionName;

    private String holder;

    private Date date;

    private String address;

    private String summary;

    private String content;

    @Column(name = "startDate")
    private Date startdate;

    @Column(name = "endDate")
    private Date enddate;

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
     * @return action_name
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * @param actionName
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * @return holder
     */
    public String getHolder() {
        return holder;
    }

    /**
     * @param holder
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * @return date
     */
    @JsonSerialize(using = CustomDateTimeSerializer.class)
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return startDate
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getStartdate() {
        return startdate;
    }

    /**
     * @param startdate
     */
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    /**
     * @return endDate
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date getEnddate() {
        return enddate;
    }

    /**
     * @param enddate
     */
    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}