public class Radio {
    private int maxStation = 10;
    private int currentStation;
    private int currentVolume;


    public Radio() {
    }


    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }


    public void next() {
        if (currentStation == maxStation - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maxStation - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int targetStation) {
        if (targetStation < 0) {
            return;
        }
        if (targetStation > maxStation - 1) {
            return;
        }
        currentStation = targetStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }
    
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int targetVolume) {
        if (targetVolume < 0) {
            return;
        }
        if (targetVolume > 100) {
            return;
        }
        currentVolume = targetVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
