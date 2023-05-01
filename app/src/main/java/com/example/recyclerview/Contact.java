package com.example.recyclerview;

public class Contact {
    private int sno;
    private String moNumber;
    private String name;


    public Contact(int sno, String moNumber, String name) {
        this.sno = sno;
        this.moNumber = moNumber;
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getMoNumber() {
        return moNumber;
    }

    public void setMoNumber(String moNumber) {
        this.moNumber = moNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
