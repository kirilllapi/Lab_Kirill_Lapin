public class CreateNecklace {
    public static void CreatePreciousStone(Necklace coolBeads) {
        coolBeads.addStoneList(new PreciousStone(10.0f, "Red", "Ruby", 0.95f, 1500.0f, 1.77f, 0.8f, 9.0f));
        coolBeads.addStoneList(new PreciousStone(8.5f, "Green", "Emerald", 0.85f, 1700.0f, 1.58f, 0.7f, 7.5f));
        coolBeads.addStoneList(new PreciousStone(12.0f, "Blue", "Sapphire", 0.92f, 600.0f, 1.76f, 0.85f, 9.0f));
        coolBeads.addStoneList(new PreciousStone(9.3f, "Yellow", "Topaz", 0.88f, 2400.0f, 1.62f, 0.75f, 8.0f));
        coolBeads.addStoneList(new PreciousStone(11.5f, "Pink", "Tourmaline", 0.91f, 4350.0f, 1.62f, 0.7f, 7.0f));
    }

    public static void CreateSemiPreciousStone(Necklace coolBeads) {
        coolBeads.addStoneList(new SemiPreciousStone(8.0f, "Blue", "Lapis Lazuli", 0.1f, 150.0f, "yes", "no", 0.6f));
        coolBeads.addStoneList(new SemiPreciousStone(7.5f, "Red", "Jasper", 0.24f, 120.0f, "yes", "yes", 0.5f));
        coolBeads.addStoneList(new SemiPreciousStone(6.8f, "Green", "Malachite", 0.01f, 100.0f, "no", "no", 0.4f));
        coolBeads.addStoneList(new SemiPreciousStone(9.2f, "Purple", "Amethyst", 0.53f, 180.0f, "no", "no", 0.7f));
        coolBeads.addStoneList(new SemiPreciousStone(7.7f, "Yellow", "Citrine", 0.34f, 130.0f, "yes", "no", 0.6f));
    }
}
