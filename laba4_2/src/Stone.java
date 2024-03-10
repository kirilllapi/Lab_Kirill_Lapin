import java.util.Objects;

public abstract class Stone {
    protected  String name;
    protected  float mass;
    protected  String color;
    protected  float cost;
    protected  float transparency;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTransparency(float transparency) {
        this.transparency = transparency;
    }

    public float getTransparency() {
        return transparency;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getMass() {
        return mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Float.compare(mass, stone.mass) == 0 && Float.compare(cost, stone.cost) == 0 && Float.compare(transparency, stone.transparency) == 0 && Objects.equals(name, stone.name) && Objects.equals(color, stone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, color, cost, transparency);
    }

    @Override
    public String toString() {
        return "Stone{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", transparency=" + transparency +
                '}';
    }
}
