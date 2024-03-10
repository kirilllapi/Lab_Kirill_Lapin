import java.util.Objects;

public class SemiPreciousStone extends Stone {
    private String inclusions;
    private String cracks;
    private float cleavage;

    public SemiPreciousStone(float mass, String color, String name, float transparency, float cost, String inclusions, String cracks, float cleavage) {
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.transparency = transparency;
        this.cost = cost;
        this.inclusions = inclusions;
        this.cracks = cracks;
        this.cleavage = cleavage;
    }

    public void setInclusions(String inclusions) {
        this.inclusions = inclusions;
    }

    public String getInclusions() {
        return inclusions;
    }

    public void setCracks(String cracks) {
        this.cracks = cracks;
    }

    public String getCracks() {
        return cracks;
    }

    public float getCleavage() {
        return cleavage;
    }

    public void setCleavage(float cleavage) {
        this.cleavage = cleavage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SemiPreciousStone that = (SemiPreciousStone) o;
        return Float.compare(cleavage, that.cleavage) == 0 && Objects.equals(inclusions, that.inclusions) && Objects.equals(cracks, that.cracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inclusions, cracks, cleavage);
    }

    @Override
    public String toString() {
        return  "SemiPreciousStone: " + "name='" + name + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", transparency=" + transparency +
                ", inclusions='" + inclusions + '\'' +
                ", cracks='" + cracks + '\'' +
                ", cleavage=" + cleavage;
    }
}
