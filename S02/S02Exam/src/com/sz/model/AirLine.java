package com.sz.model;
// util下面的包，sql下面的包
import java.util.Date;

/**
 * 航班
 */
public class AirLine {

    /**
     * 起飞时间
     */
    private Date startDate;

    /**
     *
     * 班次代号
     */
   private String no;

    /**
     * 起飞地点
     */
   private String startPlace;

    /**
     * 降落地点
     */
   private String endPlace;

    /**
     * 价格
     */
   private double price;

    /**
     * 航空公司代号
     */
   private String aid;

   public AirLine(){

   }

    public AirLine(Date startDate, String no, String startPlace, String endPlace, double price, String aid) {
        this.startDate = startDate;
        this.no = no;
        this.startPlace = startPlace;
        this.endPlace = endPlace;
        this.price = price;
        this.aid = aid;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
       // ("所有的航班信息如下：\n航空公司代号\t班次代号\t起飞时间\t起飞地点\t降落地点\t机票价格");
        return aid + "\t" + no + "\t" +startDate+"\t" +startPlace+"\t" +endPlace+"\t" +price;
    }
}
