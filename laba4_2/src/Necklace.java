import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Necklace {
    private String name;
    private List<PreciousStone> stones = new ArrayList();

    public Necklace(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addStoneList(PreciousStone stone) {
        this.stones.add(stone);
    }

    public List<PreciousStone> getStonesList() {
        return this.stones;
    }

    public String toString() {
        return "Necklace{name='" + name + "', stones=" + stones + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Necklace necklace = (Necklace) o;
        return Objects.equals(name, necklace.name) && Objects.equals(stones, necklace.stones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stones);
    }
}
