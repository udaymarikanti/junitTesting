package com.neoteric.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

public class ElectracityBillProcessingTest {

    @Test
    public void genarateEleracityBill(){
        EleracityBillProcessing billProcessing = new EleracityBillProcessing();
        CustmerElectacityBill custmerElectacityBill = new CustmerElectacityBill("123","10/1234","7/g",100,200);
        EletracityService eletracityService = mock(EletracityService.class);


        ElectracityBill electracityBill = billProcessing.genarateBill(custmerElectacityBill);
        Assertions.assertNotNull(electracityBill);
    }
    @Test
    public void genarateEleracityBill100(){
        EleracityBillProcessing billProcessing = new EleracityBillProcessing();
        CustmerElectacityBill custmerElectacityBill = new CustmerElectacityBill("123","10/1234","7/g",100,300);
        ElectracityBill electracityBill = billProcessing.genarateBill(custmerElectacityBill);
        Assertions.assertNotNull(electracityBill);
       Assertions.assertEquals(400,electracityBill.getAmount());
    }
    @Test
    public void genarateEleracityBill200(){
        EleracityBillProcessing billProcessing = new EleracityBillProcessing();
        CustmerElectacityBill custmerElectacityBill = new CustmerElectacityBill("123","10/1234","7/g",100,400);
        ElectracityBill electracityBill = billProcessing.genarateBill(custmerElectacityBill);
        Assertions.assertNotNull(electracityBill);
        Assertions.assertEquals(900,electracityBill.getAmount());
    }
}
