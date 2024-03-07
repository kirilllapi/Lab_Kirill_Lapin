import java.util.List;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 6e24, 6.37e6);
        CreatePlanet.CreateMainlands(earth);
        CreatePlanet.CreateIslands(earth);
        CreatePlanet.CreateOceans(earth);

        System.out.print("""
                ------Menu------
                1. Print information about the planet
                2. Print the list of continents
                3. Print the number of continents
                                
                 Choosing an action:\s""");

        Scanner sc = new Scanner(System.in);
        MenuBar choice;
        try {
            int userInput = sc.nextInt();
            choice = MenuBar.values()[userInput - 1];

        } catch (Exception e) {
            choice = MenuBar.EXIT;
        }
        switch (choice) {
            case PRINTPLANET:
                PrintPlanet(earth);
                break;
            case PRINTCONTINENTS:
                PrintContinents(earth);
                break;
            case PRINTCOUNT:
                PrintCountContinents(earth);
                break;
            case EXIT:
                System.out.println("You entered the wrong number!");
                break;
        }
        sc.close();
    }

    /**
     * Print the list of continents
     *
     * @param earth Object Planet
     */
    static void PrintContinents(Planet earth) {
        System.out.println("\n### List of continents ###");
        List<Mainland> Mainlands = earth.getMainlandList();
        for (Mainland mainland : Mainlands) {
            System.out.println("Continent: " + mainland.getMainlandName());
        }
    }

    /**
     * Print information about the planet
     *
     * @param earth Object Planet
     */
    static void PrintPlanet(Planet earth) {
        System.out.printf("Name planet: %s0 \n", earth.getNamePlanet());
        System.out.printf("Mass planet: %s kg\n", earth.getMassPlanet());
        System.out.printf("Radius planet: %s m\n", earth.getRadiusPlanet());
    }

    /**
     * Print the number of continents
     *
     * @param earth Object Planet
     */
    static void PrintCountContinents(Planet earth) {
        System.out.println("Number of continents: " + earth.getMainlandList().size() + " pc.");
    }
}