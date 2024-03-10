import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Necklace {
    private String name;
    private List<Stone> stones = new ArrayList<Stone>();

    public Necklace(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Stone> getStonesList() {
        return stones;
    }

    public void addStoneList(Stone stones) {
        this.stones.add(stones);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Necklace necklace = (Necklace) o;
        return Objects.equals(name, necklace.name) && Objects.equals(stones, necklace.stones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stones);
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "name='" + name + '\'' +
                ", stones=" + stones +
                '}';
    }

    /**
     * Sorting the stones by cost
     *
     * @param stoneList List of stones
     * @return Sorted list of stones
     */
    public static List<Stone> SortedStone(List<Stone> stoneList) {
        int lenList = stoneList.size();

        for (int i = 1; i < lenList; ++i) {
            for (int j = 0; j < lenList - i; ++j) {

                float firstCost = (stoneList.get(j)).getCost();
                float nextCost = (stoneList.get(j + 1)).getCost();

                if (firstCost < nextCost) {
                    Stone temp = stoneList.get(j);
                    stoneList.set(j, stoneList.get(j + 1));
                    stoneList.set(j + 1, temp);
                }
            }
        }
        return stoneList;
    }

    /**
     * Find a stone by transparency
     * @param stoneList  List of stones
     * @param firstValue - First value of transparency
     * @param lastValue  - Last value of transparency
     * @return List of stones with a certain transparency value
     */
    public static List<Stone> FindStone(List<Stone> stoneList, float firstValue, float lastValue) {
        List<Stone> transparencyList = new ArrayList<>();
        for (Stone stones : stoneList) {
            float transparency = stones.getTransparency();
            if (firstValue <= transparency && transparency <= lastValue) {
                transparencyList.add(stones);
            }
        }
        return transparencyList;
    }

    /**
     * Find the total cost of the stones
     *
     * @param stones List of stones
     * @return Total cost of stones
     */
    public static float CostStones(List<Stone> stones) {
        float cost = 0;
        for (Stone stone : stones) {
            cost += stone.getCost();
        }
        return cost;
    }

    /**
     * Find the total mass of stones
     *
     * @param stones List of stones
     * @return Total cost of stones
     */
    public static float massStones(List<Stone> stones) {
        float mass = 0;
        for (Stone stone : stones) {
            mass += stone.getMass();
        }
        return mass;
    }

}
