/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javastudy;

/**
 *
 * @author ssmokov
 */
public class SoldCar {

    private String carName;//название машины
    private String carMark; //марка автомобиля
    private String carModel; //модель автомобиля
    private int issueYear; //год выпуска
    private String city;//регион, город
    private String volumeEngine;//обїем
    private String kmAge;//пробег
    private int carPrice; //цена
    private String carDescription;//описание

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(String volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public String getKmAge() {
        return kmAge;
    }

    public void setKmAge(String kmAge) {
        this.kmAge = kmAge;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    private String phoneNumbers;//номера телефонов
    
    
}
