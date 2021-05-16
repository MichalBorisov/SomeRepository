package Plants;

import java.time.LocalDate;

public class Plant {
    String name;
    LocalDate planted;
    LocalDate watering;
    int frequencyOfWatering;
    String note;

    public Plant(String name, LocalDate planted, LocalDate watering, int frequencyOfWatering, String note) {
        this.name = name;
        this.planted = planted;
        this.watering = watering;
        this.frequencyOfWatering = frequencyOfWatering;
        this.note = note;
    }

    public Plant() {
        this.note = "";
        this.watering = LocalDate.now();
    }

    public Plant( String name) {
        this();
        this.name = name;
        this.frequencyOfWatering = 7;
        this.planted = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPlanted() {
        return planted;
    }

    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }

    public LocalDate getWatering() {
        return watering;
    }

    public void setWatering(LocalDate watering) throws PlantException {
        if (watering.isBefore(planted)) {
            throw new PlantException("Watering cannot be older than planting!");
        } else this.watering = watering;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) throws PlantException {
        if (frequencyOfWatering <= 0) {
            throw new PlantException("Frequency of Watering has to be greater than 0!");
        } else this.frequencyOfWatering = frequencyOfWatering;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getWateringInfo() {
        String info = "";
        String nextRecommendedWatering = String.valueOf(getWatering().plusDays(getFrequencyOfWatering()));
        info = getName() + " " + getWatering() + " " + nextRecommendedWatering;
        return info;
    }
}
