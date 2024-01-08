package com.neoteric.junitDemo;

public class TicketEntity {
    private  String name;
    private  String rowName;
    private  String seatNumber;

    private  int money;


    public TicketEntity(String name, String rowName, String seatNumber, int money) {
        this.name = name;
        this.rowName = rowName;
        this.seatNumber = seatNumber;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getRowName() {
        return rowName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "TicketEntity{" +
                "name='" + name + '\'' +
                ", rowName='" + rowName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
