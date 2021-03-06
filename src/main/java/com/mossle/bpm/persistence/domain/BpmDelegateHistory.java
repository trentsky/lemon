package com.mossle.bpm.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BpmDelegateHistory .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "BPM_DELEGATE_HISTORY")
public class BpmDelegateHistory implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private String assignee;

    /** null. */
    private String attorney;

    /** null. */
    private Date delegateTime;

    /** null. */
    private String taskId;

    /** null. */
    private Integer status;

    public BpmDelegateHistory() {
    }

    public BpmDelegateHistory(String assignee, String attorney,
            Date delegateTime, String taskId, Integer status) {
        this.assignee = assignee;
        this.attorney = attorney;
        this.delegateTime = delegateTime;
        this.taskId = taskId;
        this.status = status;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @Column(name = "ASSIGNEE", length = 200)
    public String getAssignee() {
        return this.assignee;
    }

    /**
     * @param assignee
     *            null.
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /** @return null. */
    @Column(name = "ATTORNEY", length = 200)
    public String getAttorney() {
        return this.attorney;
    }

    /**
     * @param attorney
     *            null.
     */
    public void setAttorney(String attorney) {
        this.attorney = attorney;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DELEGATE_TIME", length = 26)
    public Date getDelegateTime() {
        return this.delegateTime;
    }

    /**
     * @param delegateTime
     *            null.
     */
    public void setDelegateTime(Date delegateTime) {
        this.delegateTime = delegateTime;
    }

    /** @return null. */
    @Column(name = "TASK_ID", length = 100)
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @param taskId
     *            null.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /** @return null. */
    @Column(name = "STATUS")
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @param status
     *            null.
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}
