package web.model;

import java.text.NumberFormat;
import java.util.Locale;

public class Car {
    private int id;
    private String vin;
    private int year;
    private String manufacturer;
    private String model;
    private String trim;
    private String engine;
    private String drive;
    private String bodyColor;
    private String interiorColor;
    private int priceUsd;
    private int mileageKm;
    private String condition;

    public Car() {
    }

    public Car(int id, String vin, int year, String manufacturer, String model, String trim, String engine, String drive, String bodyColor, String interiorColor, int priceUsd, int mileageKm, String condition) {
        this.id = id;
        this.vin = vin;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
        this.trim = trim;
        this.engine = engine;
        this.drive = drive;
        this.bodyColor = bodyColor;
        this.interiorColor = interiorColor;
        this.priceUsd = priceUsd;
        this.mileageKm = mileageKm;
        this.condition = condition;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String getInteriorColor() {
        return interiorColor;
    }

    public void setInteriorColor(String interiorColor) {
        this.interiorColor = interiorColor;
    }

    public int getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(int priceUsd) {
        this.priceUsd = priceUsd;
    }

    public int getMileageKm() {
        return mileageKm;
    }

    public void setMileageKm(int mileageKm) {
        this.mileageKm = mileageKm;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}



