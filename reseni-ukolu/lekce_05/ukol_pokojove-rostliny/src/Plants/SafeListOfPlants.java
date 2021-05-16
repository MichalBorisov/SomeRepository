package Plants;

import Plants.Plant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;

public class SafeListOfPlants {
    ArrayList<Plant> list = new ArrayList<>();

    public void addNewPlant() {

        list.add(new Plant("slunecnice"));
    }

    public Plant getPlantAtPosition(Plant plant, int position) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        position = Integer.parseInt(bis.readLine());
        return list.get(position);
    }

    public void removePlant() {
        list.remove(0);
    }
}
