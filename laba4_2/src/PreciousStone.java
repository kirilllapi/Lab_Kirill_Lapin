import java.util.Objects;

public class PreciousStone extends Stone {

    private float prevalence;
    private float refraction;
    private float hardness;

    public PreciousStone(float mass, String color, String name, float transparency, float cost, float refraction, float prevalence, float hardness) {
        this.mass = mass;
        this.color = color;
        this.name = name;
        this.transparency = transparency;
        this.cost = cost;
        this.refraction = refraction;
        this.prevalence = prevalence;
        this.hardness = hardness;
    }

    public void setPrevalence(float prevalence) {
        this.prevalence = prevalence;
    }

    public float getPrevalence() {
        return prevalence;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public float getHardness() {
        return hardness;
    }

    public float getRefraction() {
        return refraction;
    }

    public void setRefraction(float refraction) {
        this.refraction = refraction;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public float getTransparency() {
        return super.getTransparency();
    }

    @Override
    public void setTransparency(float transparency) {
        super.setTransparency(transparency);
    }

    @Override
    public float getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(float cost) {
        super.setCost(cost);
    }

    @Override
    public float getMass() {
        return super.getMass();
    }

    @Override
    public void setMass(float mass) {
        super.setMass(mass);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PreciousStone stone = (PreciousStone) o;
        return Float.compare(prevalence, stone.prevalence) == 0 && Float.compare(refraction, stone.refraction) == 0 && Float.compare(hardness, stone.hardness) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), prevalence, refraction, hardness);
    }

    @Override
    public String toString() {
        return  "PreciousStone: "+ "name='" + name + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", transparency=" + transparency  +
                ", prevalence=" + prevalence +
                ", refraction=" + refraction +
                ", hardness=" + hardness;
    }
}
