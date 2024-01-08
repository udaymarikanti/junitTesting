package com.neoteric.junitDemo;

public class TicketBookingProcessing {

    // int totalSets=40;
    TIcketService tIcketService;
    public TicketEntity ticketGenaratedProcess(TicketCostmer ticket ) {
        TicketEntity ticket1 = tIcketService.bookingService(ticket.getName(), ticket.getRowName(), ticket.getSeatNumber());


        //   TicketBookingProcessing ticket1 = new TicketBookingProcessing();
        return ticket1;
    }
        public void settIcketService(TIcketService tIcketService) {
            this.tIcketService = tIcketService;
        }


 //       String setedTicket = ticket.getRowName();
//        int amount = 0;
//        if( setedTicket == "A" ||setedTicket == "B" ||setedTicket == "C" )
//        {
//            amount = 300;
//        }
//        if( setedTicket == "G" ||setedTicket == "H" ||setedTicket == "I" )
//        {
//            amount = 200;
//        }
//        if( setedTicket == "U" ||setedTicket == "V" ||setedTicket == "W" )
//        {
//            amount = 100;
//        }


      //  TicketEntity ticket1 = new TicketEntity(ticket1.getName(),setedTicket,ticket1.getSeatNumber(),ticket1.getMoney());

    }
    

