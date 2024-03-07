import java.util.List;
import java.util.Scanner;

public class TaskMain {
    public static void main(String[] args) {
        Necklace coolBeads = new Necklace("coolBeads");
        CreateNecklace.CreatePreciousStone(coolBeads);
        CreateNecklace.CreateSemiPreciousStone(coolBeads);

        System.out.print("""
                ------Menu------
                1. Print the total mass of stones
                2. Print the total cost of the stones
                3. Sort the stones by cost
                4. Find the transparency of the stones
                                
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
            case TOTALMASS:
                FindTotalMass(coolBeads);
                break;
            case TOTALCOST:
                FindTotalCost(coolBeads);
                break;
            case TOTALSORTED:
                System.out.println("### List of stones ###");
                TotalSortedStones(coolBeads);
                break;
            case FINDTRANSPARENCY:
                System.out.print("Enter the first transparency value: ");
                float fistValue = sc.nextFloat();
                System.out.print("\nEnter the last transparency value: ");
                float lastValue = sc.nextFloat();
                System.out.println("\n### List of stones ###");
                FindTransparency(coolBeads, fistValue, lastValue);
                break;
            case EXIT:
                System.out.println("You entered the wrong number!");
                break;

        }
        sc.close();
    }

    public static void PrintStone(List<PreciousStone> Stones) {
        for (PreciousStone stone : Stones) {
            System.out.println(stone);
        }
        System.out.println("\n");
    }

    public static void FindTotalMass(Necklace coolBeads) {
        System.out.println("Total mass of the stones: " + ProcessingNecklace.massStones(coolBeads.getStonesList()) + " carat");
    }

    public static void FindTotalCost(Necklace coolBeads) {
        System.out.println("Total coast of the stones: " + ProcessingNecklace.CostStones(coolBeads.getStonesList()) + "$");
    }

    public static void FindTransparency(Necklace coolBeads, float firstValue, float lastValue) {
        PrintStone(ProcessingNecklace.FindStone(coolBeads.getStonesList(), firstValue, lastValue));
    }

    public static void TotalSortedStones(Necklace coolBeads) {
        PrintStone(ProcessingNecklace.SortedStone(coolBeads.getStonesList()));
    }
}

