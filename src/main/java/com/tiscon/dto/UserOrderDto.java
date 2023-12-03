package com.tiscon.dto;

public class UserOrderDto {

    private String customerName;

    private String tel;

    private String email;

    private String oldPrefectureId;

    private String oldAddress;

    private String newPrefectureId;

    private String newAddress;

    private String box;

    private String bed;

    private String bicycle;

    private String washingMachine;

    private boolean washingMachineInstallation;

    private String time1;

    private String time2;

    private String time3;

    private String month;

    private String wish;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public int getBox() {
        return Integer.parseInt(box);
    }

    public void setBox(String box) {
        this.box = box;
    }

    public int getBed() {
        return Integer.parseInt(bed);
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public int getBicycle() {
        return Integer.parseInt(bicycle);
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public int getWashingMachine() {
        return Integer.parseInt(washingMachine);
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(Boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getTime3() {
        return time3;
    }

    public void setTime3(String time3) {
        this.time3 = time3;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

}
