import java.util.Objects;

public class Island {
    private String islandName;
    private double islandSquare;
    private String islandClimate;

    public Island() {
    }

    public Island(String islandName, String islandClimate, double islandSquare) {
        this.islandName = islandName;
        this.islandSquare = islandSquare;
        this.islandClimate = islandClimate;
    }

    public Island(String islandName, double islandSquare) {
        this.islandName = islandName;
        this.islandSquare = islandSquare;
    }

    public Island(String islandName) {
        this.islandName = islandName;
    }

    public String getIslandName() {
        return this.islandName;
    }

    public void setIslandName(String islandName) {
        if (!islandName.isBlank()) {
            this.islandName = islandName;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public double getIslandSquare() {
        return this.islandSquare;
    }

    public void setIslandSquare(double islandSquare) {
        if (islandSquare > 0) {
            this.islandSquare = islandSquare;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public String getIslandClimate() {
        return this.islandClimate;
    }

    public void setIslandClimate(String islandClimate) {
        if (!islandClimate.isBlank()) {
            this.islandClimate = islandClimate;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    @Override
    public String toString() {
        return "Island{" +
                "islandName='" + islandName + '\'' + ", islandSquare=" + islandSquare +
                ", islandClimate='" + islandClimate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Island island = (Island) o;
        return Double.compare(islandSquare, island.islandSquare) == 0 && Objects.equals(islandName, island.islandName) && Objects.equals(islandClimate, island.islandClimate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(islandName, islandSquare, islandClimate);
    }
}
