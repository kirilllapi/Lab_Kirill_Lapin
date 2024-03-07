
import java.util.Objects;

public class Mainland {
    private String mainlandName;
    private double mainlandSquare;

    public Mainland(String mainlandName, double mainlandSquare) {
        this.mainlandName = mainlandName;
        this.mainlandSquare = mainlandSquare;
    }

    public Mainland(String mainlandName) {
        this.mainlandName = mainlandName;
    }

    public Mainland() {
    }

    public String getMainlandName() {
        return this.mainlandName;
    }

    public void setMainlandName(String mainlandName) {
        if (!mainlandName.isBlank()) {
            this.mainlandName = mainlandName;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public double getMainlandSquare() {
        return this.mainlandSquare;
    }

    public void setMainlandSquare(double mainlandSquare) {
        if (mainlandSquare > 0.0) {
            this.mainlandSquare = mainlandSquare;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    @Override
    public String toString() {
        return "Mainland{" +
                "mainlandName='" + mainlandName + '\'' +
                ", mainlandSquare=" + mainlandSquare +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mainland mainland = (Mainland) o;
        return Double.compare(mainlandSquare, mainland.mainlandSquare) == 0 && Objects.equals(mainlandName, mainland.mainlandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mainlandName, mainlandSquare);
    }
}
