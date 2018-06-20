package cn.cygia.tg.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_grade")
public class UserGradeEntity {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "workNumber")
    private String workNumber;

    @Column(name = "enteringTime")
    private String enteringTime;

    @Column(name = "wxNumber")
    private String wxNumber;

    @Column(name = "remainingCredits")
    private String remainingCredits;

    @Column(name = "usedMoney")
    private String usedMoney;

    @Column(name = "usedCredits")
    private String usedCredits;

    @Column(name = "updateTime")
    private String updateTime;

    @Column(name = "prepaidUserStatus")
    private String prepaidUserStatus;

    @Column(name = "deleted")
    private String deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public String getEnteringTime() {
        return enteringTime;
    }

    public void setEnteringTime(String enteringTime) {
        this.enteringTime = enteringTime;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public String getRemainingCredits() {
        return remainingCredits;
    }

    public void setRemainingCredits(String remainingCredits) {
        this.remainingCredits = remainingCredits;
    }

    public String getUsedMoney() {
        return usedMoney;
    }

    public void setUsedMoney(String usedMoney) {
        this.usedMoney = usedMoney;
    }

    public String getUsedCredits() {
        return usedCredits;
    }

    public void setUsedCredits(String usedCredits) {
        this.usedCredits = usedCredits;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getPrepaidUserStatus() {
        return prepaidUserStatus;
    }

    public void setPrepaidUserStatus(String prepaidUserStatus) {
        this.prepaidUserStatus = prepaidUserStatus;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
