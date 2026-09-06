public class Radio {
    private int stationsCount = 10;
    private int currentStation;
    private int currentVolume;


    public Radio() {
    }


    public Radio(int stationsCount) {
        this.stationsCount = stationsCount;
    }


    public void next() {
        if (currentStation == stationsCount - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int targetStation) {
        if (targetStation < 0) {
            return;
        }
        if (targetStation > stationsCount - 1) {
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
