package com.ubb.cms;

import org.hibernate.annotations.Table;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Alexandra Muresan on 4/10/2017.
 */
@Entity
@javax.persistence.Table(name="edition")
public class Edition {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="conference_id", referencedColumnName = "id")
    private Conference conference;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference= conference;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public void setBeginningDate(Date beginningDate) {
        this.beginningDate = beginningDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPaperSubmissionDeadline() {
        return paperSubmissionDeadline;
    }

    public void setPaperSubmissionDeadline(Date paperSubmissionDeadline) {
        this.paperSubmissionDeadline = paperSubmissionDeadline;
    }

    public Date getFinalDeadline() {
        return finalDeadline;
    }

    public void setFinalDeadline(Date finalDeadline) {
        this.finalDeadline = finalDeadline;
    }

    private Date beginningDate;
    private Date endingDate;

    public Edition(int id, Conference conference, Date beginningDate, Date endingDate, String name, Date paperSubmissionDeadline, Date finalDeadline) {
        this.id = id;
        this.conference = conference;
        this.beginningDate = beginningDate;
        this.endingDate = endingDate;
        this.name = name;
        this.paperSubmissionDeadline = paperSubmissionDeadline;
        this.finalDeadline = finalDeadline;
    }

    public Edition(){

    }

    private String name;
    private Date paperSubmissionDeadline;
    private Date finalDeadline;

}
