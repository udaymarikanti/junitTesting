package com.neoteric.junitDemo;

public class TIcketService {

    public TicketEntity bookingService(String name ,String rowNumber, String seatNumber ){
    String seltedTicket = "";
    int amount = 0;
        if( seltedTicket == "A" ||seltedTicket == "B" ||seltedTicket == "C" )
    {
        amount = 300;
    }
        if( seltedTicket == "G" ||seltedTicket == "H" ||seltedTicket == "I" )
    {
        amount = 200;
    }
        if( seltedTicket == "U" ||seltedTicket == "V" ||seltedTicket == "W" )
    {
        amount = 100;
    }

        TicketEntity ticketEntity = new TicketEntity(name,rowNumber,seatNumber,amount);
    return ticketEntity;
    }
}
