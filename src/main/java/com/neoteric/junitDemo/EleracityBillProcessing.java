package com.neoteric.junitDemo;

import javax.xml.crypto.Data;
import java.util.Date;

public class EleracityBillProcessing{
    public void setEletracityService(EletracityService eletracityService) {
        this.eletracityService = eletracityService;
    }

    EletracityService eletracityService;

    public ElectracityBill genarateBill(CustmerElectacityBill bill1) {
        int unit = bill1.getPrivesUnits() - bill1.getPrevesentUnits();
        ElectracityBill bill2 = eletracityService.genarateEletracityBill(unit, bill1.getCustId(), bill1.getPrevesentUnits(), bill1.getHouseNumber(), bill1.getFlatNO(), bill1.getPrevesentUnits(), new Date());
        return bill2;
    }


//       int amount = 0;
//       if(unit == 100){
//           amount = unit;
//       }
//        if(unit == 200){
//            amount = unit*2;
//        }
//        if(unit == 300){
//            amount = unit*3;
//        }
//        ElectracityBill bill2 = new ElectracityBill(bill1.getCustId(), bill1.getHouseNumber(), bill.getFlatNO(), amount,new Date());
//        return  bill2;

    }

