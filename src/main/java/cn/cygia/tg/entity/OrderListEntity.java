package cn.cygia.tg.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_list")
public class OrderListEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "sn")
    private String sn;

    @Column(name = "usedCredits")
    private String usedCredits;

    @Column(name = "totalPrice")
    private Float totalPrice;

    @Column(name = "totalPayPrice")
    private Float totalPaypPrice;

    @Column(name = "userName")
    private String userName;

    @Column(name = "wxNumber")
    private String wxNumber;

    @Column(name = "boxName")
    private String boxName;

    @Column(name = "degaussing")
    private String defaussing;

    @Column(name = "payTime")
    private String payTime;

    @Column(name = "endTime")
    private String endTime;

    @Column(name = "scanTime")
    private String scanTime;

    @Column(name = "createTime")
    private String createTime;

    @Column(name = "orderStatus")
    private String orderStatus;

    @Column(name = "syncTime")
    private String syncTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getUsedCredits() {
        return usedCredits;
    }

    public void setUsedCredits(String usedCredits) {
        this.usedCredits = usedCredits;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getTotalPaypPrice() {
        return totalPaypPrice;
    }

    public void setTotalPaypPrice(Float totalPaypPrice) {
        this.totalPaypPrice = totalPaypPrice;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWxNumber() {
        return wxNumber;
    }

    public void setWxNumber(String wxNumber) {
        this.wxNumber = wxNumber;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getDefaussing() {
        return defaussing;
    }

    public void setDefaussing(String defaussing) {
        this.defaussing = defaussing;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getScanTime() {
        return scanTime;
    }

    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }
}
