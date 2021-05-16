package Plants;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListOfPlants listOfPlants= new ListOfPlants();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("kvetiny.txt")))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        listOfPlants.addNewPlant("TEST1");
        listOfPlants.addNewPlant("TEST2");
        listOfPlants.removePlant(1);

        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("vystup.txt")))) {
            for (int index = 0; index < listOfPlants.Size(); index++)
            {
                writer.write(listOfPlants.getPlantAtPosition(index).getWateringInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
