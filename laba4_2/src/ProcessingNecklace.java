import java.util.ArrayList;
import java.util.List;

public class ProcessingNecklace {

    /**
     * Sorting the stones by cost
     *
     * @param stoneList List of stones
     * @return Sorted list of stones
     */
    public static List<PreciousStone> SortedStone(List<PreciousStone> stoneList) {
        int lenList = stoneList.size();

        for (int i = 1; i < lenList; ++i) {
            for (int j = 0; j < lenList - i; ++j) {

                float firstCost = (stoneList.get(j)).getCost();
                float nextCost = (stoneList.get(j + 1)).getCost();

                if (firstCost < nextCost) {
                    PreciousStone temp = stoneList.get(j);
                    stoneList.set(j, stoneList.get(j + 1));
                    stoneList.set(j + 1, temp);
                }
            }
        }
        return stoneList;
    }

    /**
     * @param stoneList  List of stones
     * @param firstValue - First value of transparency
     * @param lastValue  - Last value of transparency
     * @return List of stones with a certain transparency value
     */
    public static List<PreciousStone> FindStone(List<PreciousStone> stoneList, float firstValue, float lastValue) {
        List<PreciousStone> transparencyList = new ArrayList<>();
        for (PreciousStone stone : stoneList) {
            float transparency = stone.getTransparency();
            if (firstValue <= transparency && transparency <= lastValue) {
                transparencyList.add(stone);
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
    public static float CostStones(List<PreciousStone> stones) {
        float cost = 0;
        for (PreciousStone stone : stones) {
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
    public static float massStones(List<PreciousStone> stones) {
        float mass = 0;
        for (PreciousStone stone : stones) {
            mass += stone.getMass();
        }
        return mass;
    }
}
