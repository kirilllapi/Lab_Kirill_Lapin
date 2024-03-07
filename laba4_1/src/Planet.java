import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Planet {
    private String namePlanet;
    private double massPlanet;
    private double radiusPlanet;
    private List<Mainland> mainlandList = new ArrayList<>();
    private List<Island> islandList = new ArrayList<>();
    private List<Ocean> oceanList = new ArrayList<>();

    public Planet() {
    }

    public Planet(String namePlanet, double massPlanet, double radiusPlanet) {
        this.namePlanet = namePlanet;
        this.massPlanet = massPlanet;
        this.radiusPlanet = radiusPlanet;
    }

    public Planet(String namePlanet, double massPlanet) {
        this.namePlanet = namePlanet;
        this.massPlanet = massPlanet;
    }

    public Planet(String namePlanet) {
        this.namePlanet = namePlanet;
    }

    public String getNamePlanet() {
        return this.namePlanet;
    }

    public void setNamePlanet(String namePlanet) {
        if (!namePlanet.isBlank()) {
            this.namePlanet = namePlanet;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public double getMassPlanet() {
        return this.massPlanet;
    }

    public void setMassPlanet(double massPlanet) {
        if (massPlanet > 0) {
            this.massPlanet = massPlanet;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public double getRadiusPlanet() {
        return this.radiusPlanet;
    }

    public void setRadiusPlanet(double radiusPlanet) {
        if (radiusPlanet > 0) {
            this.radiusPlanet = radiusPlanet;
        } else {
            System.out.println("Вы ввели неверное значение!");
        }

    }

    public String toString() {
        return "Planet{namePlanet='" + namePlanet + "', massPlanet=" + massPlanet + ", radiusPlanet=" + radiusPlanet + ", mainlandList=" + mainlandList + ", islandList=" + this.islandList + ", oceanList=" + this.oceanList + "}";
    }

    public void addMainland(Mainland Mainland) {
        this.mainlandList.add(Mainland);
    }

    public void addIsland(Island Island) {
        this.islandList.add(Island);
    }

    public void addOcean(Ocean Ocean) {
        this.oceanList.add(Ocean);
    }

    public List<Ocean> getOceanList() {
        return this.oceanList;
    }

    public List<Island> getIslandList() {
        return this.islandList;
    }

    public List<Mainland> getMainlandList() {
        return this.mainlandList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return Double.compare(massPlanet, planet.massPlanet) == 0 && Double.compare(radiusPlanet, planet.radiusPlanet) == 0 && Objects.equals(namePlanet, planet.namePlanet) && Objects.equals(mainlandList, planet.mainlandList) && Objects.equals(islandList, planet.islandList) && Objects.equals(oceanList, planet.oceanList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePlanet, massPlanet, radiusPlanet, mainlandList, islandList, oceanList);
    }
}
