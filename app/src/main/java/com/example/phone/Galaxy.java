package com.example.phone;

public class Galaxy extends Phone implements Ringable {

    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        return String.format(this.getVersionNumber(), this.getRingTone());
    }

    @Override
    public String unlock() {
        return ("unLocking");
    }

    @Override
    public String displayInfo() {

        return String.format(this.getVersionNumber(), this.getCarrier());
    }

}
