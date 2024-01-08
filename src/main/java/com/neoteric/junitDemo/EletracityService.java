package com.neoteric.junitDemo;

import java.util.Date;

public class EletracityService {
    public ElectracityBill genarateEletracityBill(int unit ,String custId, int currentUnits, String houseNumber, String flatNO,  int amount, Date billMonth){
        int currentCharege = 0;
       if(unit == 100){
           currentCharege = unit;
       }
        if(unit == 200){
            currentCharege = unit*2;
        }
        if(unit == 300){
            currentCharege = unit*3;
        }
        ElectracityBill bill = new ElectracityBill(custId,houseNumber,flatNO,currentCharege,billMonth);
        return bill;
    }
}
