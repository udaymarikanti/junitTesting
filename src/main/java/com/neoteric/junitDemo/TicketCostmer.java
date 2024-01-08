package com.neoteric.junitDemo;

public class TicketCostmer {

    private int mobileNo;
    private String name;
    private String address;
    private String movieName;
    private String rowName;
    private String seatNumber;

    public TicketCostmer(int mobileNo, String name, String address, String movieName, String rowName, String seatNumber) {
        this.mobileNo = mobileNo;
        this.name = name;
        this.address = address;
        this.movieName = movieName;
        this.rowName = rowName;
        this.seatNumber = seatNumber;
    }

    public int getMobileNo() {
        return mobileNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getRowName() {
        return rowName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "TicketCostmer{" +
                "mobileNo=" + mobileNo +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", movieName='" + movieName + '\'' +
                ", rowName='" + rowName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                '}';
    }
}


