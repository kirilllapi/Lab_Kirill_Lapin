import java.util.Objects;

public class PreciousStone extends Stone {
    private float cost;
    private float transparency;
    private float hardness;
    private float prevalence;

    public PreciousStone(float mass, String name, String color, float cost, float transparency, float hardness, float prevalence) {
        super(mass, color, name);
        this.cost = cost;
        this.transparency = transparency;
        this.hardness = hardness;
        this.prevalence = prevalence;
    }

    public float getMass() {
        return super.getMass();
    }

    public void setMass(float mass) {
        super.setMass(mass);
    }

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getHardness() {
        return this.hardness;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }

    public float getPrevalence() {
        return this.prevalence;
    }

    public void setPrevalence(float prevalence) {
        this.prevalence = prevalence;
    }

    public float getTransparency() {
        return this.transparency;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String toString() {
        return super.toString() + ", cost: " + cost + "$, transparency: " + transparency + " in frac., hardness: " + hardness + " in frac., prevalence: " + prevalence + " in frac.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PreciousStone that = (PreciousStone) o;
        return Float.compare(cost, that.cost) == 0 && Float.compare(transparency, that.transparency) == 0 && Float.compare(hardness, that.hardness) == 0 && Float.compare(prevalence, that.prevalence) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cost, transparency, hardness, prevalence);
    }
}
