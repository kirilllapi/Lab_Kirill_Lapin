import java.util.Objects;

public abstract class Stone {
    private String name;
    private float mass;
    private String color;

    public Stone(float mass, String color, String name) {
        this.mass = mass;
        this.color = color;
        this.name = name;
    }

    public float getMass() {
        return this.mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + ": mass: " + mass + " carat, color: " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stone stone = (Stone) o;
        return Float.compare(mass, stone.mass) == 0 && Objects.equals(name, stone.name) && Objects.equals(color, stone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, color);
    }
}
