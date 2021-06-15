package ru.netology.domain;

public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;

    public Radio(int maxStation, int currentStation) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;
    }

    public Radio() {
    }

    public Radio(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setPrevStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void setNextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setPrevVolume() {
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void setNextVolume() {
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }
}

