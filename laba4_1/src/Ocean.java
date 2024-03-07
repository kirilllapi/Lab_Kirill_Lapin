import java.util.Objects;

public class Ocean {
    private String oceanName;
    private double oceanSquare;
    private int oceanDepth;

    public Ocean() {
    }

    public Ocean(String oceanName) {
        this.oceanName = oceanName;
    }

    public Ocean(String oceanName, double oceanSquare) {
        this.oceanName = oceanName;
        this.oceanSquare = oceanSquare;
    }

    public Ocean(String oceanName, double oceanSquare, int oceanDepth) {
        this.oceanName = oceanName;
        this.oceanSquare = oceanSquare;
        this.oceanDepth = oceanDepth;
    }

    public String getOceanName() {
        return this.oceanName;
    }

    public void setOceanName(String oceanName) {
        if (!oceanName.isBlank()) {
            this.oceanName = oceanName;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public double getOceanSquare() {
        return this.oceanSquare;
    }

    public void setOceanSquare(int oceanSquare) {
        if (oceanSquare > 0) {
            this.oceanSquare = (double) oceanSquare;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public int getOceanDepth() {
        return this.oceanDepth;
    }

    public void setOceanDepth(int oceanDepth) {
        if (oceanDepth > 0) {
            this.oceanDepth = oceanDepth;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    @Override
    public String toString() {
        return "Ocean{" + "oceanName='" + oceanName + '\'' + ", oceanSquare=" + oceanSquare + ", oceanDepth=" + oceanDepth + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ocean ocean = (Ocean) o;
        return Double.compare(oceanSquare, ocean.oceanSquare) == 0 && oceanDepth == ocean.oceanDepth && Objects.equals(oceanName, ocean.oceanName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oceanName, oceanSquare, oceanDepth);
    }
}
