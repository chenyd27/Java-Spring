package com.cyd.pojo;

public class Address {
    private String address;
    private int number;
    public Address(){}
    public Address(String address,int number){
        this.address = address;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", number=" + number +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
