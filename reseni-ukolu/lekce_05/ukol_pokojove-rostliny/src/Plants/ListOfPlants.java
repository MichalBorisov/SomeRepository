package Plants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ListOfPlants {
    private ArrayList<Plant> list = new ArrayList<>();

    public int Size()
    {
        return list.size();
    }

    public void addNewPlant(String name) {
        list.add(new Plant(name));
    }
    public void addNewPlant(Plant plant) {
        list.add(plant);
    }

    public Plant getPlantAtPosition(int position) throws IOException {
        return list.get(position);
    }

    public void removePlant(int index) {
        list.remove(index);
    }
}
