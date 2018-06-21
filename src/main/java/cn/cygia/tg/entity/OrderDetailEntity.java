package cn.cygia.tg.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetailEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "comSn")
    private String conSn;

    @Column(name = "pictureUrl")
    private String pictureUrl;

    @Column(name = "specification")
    private String specification;

    @Column(name = "sellPrice")
    private Float sellPrice;

    @Column(name = "payPrice")
    private Float payPrice;

    @Column(name = "payStatus")
    private String payStatus;

    @Column(name = "number")
    private Integer number;

    @Column(name = "orderSn")
    private String orderSn;

    @Column(name = "orderId")
    private Integer orderId;

    @Column(name = "ogn_number")
    private String ognNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConSn() {
        return conSn;
    }

    public void setConSn(String conSn) {
        this.conSn = conSn;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Float getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Float sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOgnNumber() {
        return ognNumber;
    }

    public void setOgnNumber(String ognNumber) {
        this.ognNumber = ognNumber;
    }
}
