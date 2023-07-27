package ru.netology.radio;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    public int currentStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    public int currentVolume;

    public Radio() {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentStation = minStation;
    }

    public Radio(int size){
        maxStation = minStation + size - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {                // следующая радиостанция
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {               // предыдущая радиостанция
        if (currentStation > minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {      // увеличение громкости
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {        // уменьшение громкости
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}


