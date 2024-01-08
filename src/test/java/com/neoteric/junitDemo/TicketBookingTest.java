package com.neoteric.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
@ExtendWith(MockitoExtension.class)
public class TicketBookingTest {
    @Test
    public  void movieTicketGenaration(){
        TicketBookingProcessing ticketGenarated = new TicketBookingProcessing();
        TicketCostmer costmer = new TicketCostmer(984875,"kiran","hyd","AVATHER","B","2");
       TIcketService tIcketService= mock(TIcketService.class);
        ticketGenarated.settIcketService(tIcketService);
       TicketEntity ticket3 = new TicketEntity("kiran","A","13",400);
        when(tIcketService.bookingService(any(java.lang.String.class),any(java.lang.String.class),any(java.lang.String.class))).thenReturn(ticket3);

        TicketEntity ticketBooked= ticketGenarated.ticketGenaratedProcess(costmer);
        Assertions.assertNotNull(ticketBooked);
    }
    @Test
    public  void movieTicketGenaration200(){
        TicketBookingProcessing ticketGenarated = new TicketBookingProcessing();
        TicketCostmer costmer = new TicketCostmer(984875,"kiran","hyd","AVATHER","H","4");
        TIcketService tIcketService= mock(TIcketService.class);
        ticketGenarated.settIcketService(tIcketService);
        TicketEntity ticket3 = new TicketEntity("kiran","H","4",200);
        when(tIcketService.bookingService(any(java.lang.String.class),any(java.lang.String.class),any(java.lang.String.class))).thenReturn(ticket3);
        TicketEntity ticketBooked= ticketGenarated.ticketGenaratedProcess(costmer);
        Assertions.assertNotNull(ticketBooked);
        Assertions.assertEquals(200,ticketBooked.getMoney());

    }
    @Test
    public  void movieTicketGenaration100(){
        TicketBookingProcessing ticketGenarated = new TicketBookingProcessing();
        TicketCostmer costmer = new TicketCostmer(984875,"kiran","hyd","AVATHER","V","2");
        TIcketService tIcketService= mock(TIcketService.class);
        ticketGenarated.settIcketService(tIcketService);
        TicketEntity ticket3 = new TicketEntity("kiran","V","13",100);
        when(tIcketService.bookingService(any(java.lang.String.class),any(java.lang.String.class),any(java.lang.String.class))).thenReturn(ticket3);
        TicketEntity ticketBooked= ticketGenarated.ticketGenaratedProcess(costmer);
        Assertions.assertNotNull(ticketBooked);
        Assertions.assertEquals(100,ticketBooked.getMoney());
    }

}
