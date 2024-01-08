package com.neoteric.junitDemo;

import java.util.Date;

public class ElectracityBill {
    private  String custId;
    private  String houseNumber;
    private  String flatNO;
    private  int amount;
    private Date month;

    public ElectracityBill(String custId, String houseNumber, String flatNO,  int amount, Date month) {
        this.custId = custId;
        this.houseNumber = houseNumber;
        this.flatNO = flatNO;
        this.amount = amount;
        this.month = month;
    }

    public String getCustId() {
        return custId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getFlatNO() {
        return flatNO;
    }



    public int getAmount() {
        return amount;
    }

    public Date getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "ElectracityBill{" +
                "custId='" + custId + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNO='" + flatNO + '\'' +
                ", amount=" + amount +
                ", month=" + month +
                '}';
    }
}
