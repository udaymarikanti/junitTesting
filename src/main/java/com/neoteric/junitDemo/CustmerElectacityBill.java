package com.neoteric.junitDemo;

public class CustmerElectacityBill {
    private  String custId;
    private  String houseNumber;
    private  String flatNO;
    private  int privesUnits;
    private  int prevesentUnits;


    public CustmerElectacityBill(String custId, String houseNumber, String flatNO, int privesUnits, int prevesentUnits) {
        this.custId = custId;
        this.houseNumber = houseNumber;
        this.flatNO = flatNO;
        this.privesUnits = privesUnits;
        this.prevesentUnits = prevesentUnits;
    }

    @Override
    public String toString() {
        return "CustmerElectacityBill{" +
                "custId='" + custId + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", flatNO='" + flatNO + '\'' +
                ", privesUnits=" + privesUnits +
                ", prevesentUnits=" + prevesentUnits +
                '}';
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

    public int getPrivesUnits() {
        return privesUnits;
    }

    public int getPrevesentUnits() {
        return prevesentUnits;
    }
}
