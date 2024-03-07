import java.util.Objects;

public class SemiPreciousStone extends PreciousStone {
    private String inclusions;
    private String cracks;

    public SemiPreciousStone(float mass, String color, String name, float cost, float transparency, float hardness, float prevalence, String inclusions, String cracks) {
        super(mass, name, color, cost, transparency, hardness, prevalence);
        this.inclusions = inclusions;
        this.cracks = cracks;
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public String getColor() {
        return super.getColor();
    }

    public float getMass() {
        return super.getMass();
    }

    public void setMass(float mass) {
        super.setMass(mass);
    }

    public float getCost() {
        return super.getCost();
    }

    public void setCost(float cost) {
        super.setCost(cost);
    }

    public float getHardness() {
        return super.getHardness();
    }

    public void setHardness(float hardness) {
        super.setHardness(hardness);
    }

    public float getPrevalence() {
        return super.getPrevalence();
    }

    public void setPrevalence(float prevalence) {
        super.setPrevalence(prevalence);
    }

    public float getTransparency() {
        return super.getTransparency();
    }

    public void setTransparency(float transparency) {
        super.setTransparency(transparency);
    }

    public String getCracks() {
        return this.cracks;
    }

    public void setCracks(String cracks) {
        this.cracks = cracks;
    }

    public String getInclusions() {
        return this.inclusions;
    }

    public void setInclusions(String inclusions) {
        this.inclusions = inclusions;
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getName() {
        return super.getName();
    }

    public String toString() {
        return super.toString() + ", inclusions: " + inclusions + ", cracks: " + cracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SemiPreciousStone that = (SemiPreciousStone) o;
        return Objects.equals(inclusions, that.inclusions) && Objects.equals(cracks, that.cracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), inclusions, cracks);
    }
}
