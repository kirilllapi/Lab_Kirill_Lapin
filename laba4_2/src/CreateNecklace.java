public class CreateNecklace {
    public static void CreatePreciousStone(Necklace coolBeads) {
        coolBeads.addStoneList(new PreciousStone(100.5F, "Diamond", "Transparent", 5000.0F, 0.9F, 10.0F, 0.001F));
        coolBeads.addStoneList(new PreciousStone(50.2F, "Ruby", "Red", 3000.0F, 0.8F, 9.0F, 0.002F));
        coolBeads.addStoneList(new PreciousStone(75.3F, "Sapphire", "Blue", 4000.0F, 0.85F, 9.5F, 0.003F));
        coolBeads.addStoneList(new PreciousStone(120.8F, "Emerald", "Green", 4500.0F, 0.87F, 8.5F, 0.0025F));
        coolBeads.addStoneList(new PreciousStone(95.7F, "Topaz", "Yellow", 2500.0F, 0.75F, 8.0F, 0.004F));
    }

    public static void CreateSemiPreciousStone(Necklace coolBeads) {
        coolBeads.addStoneList(new SemiPreciousStone(10.5F, "Green", "Heliodorus", 100.0F, 0.8F, 7.5F, 0.5F, "yes", "no"));
        coolBeads.addStoneList(new SemiPreciousStone(5.2F, "Blue", "Malachite", 80.0F, 0.7F, 8.0F, 0.6F, "no", "yes"));
        coolBeads.addStoneList(new SemiPreciousStone(8.0F, "Red", "Amber", 120.0F, 0.9F, 7.8F, 0.4F, "yes", "yes"));
        coolBeads.addStoneList(new SemiPreciousStone(15.3F, "Purple", "Amethyst", 90.0F, 0.6F, 7.0F, 0.3F, "no", "yes"));
        coolBeads.addStoneList(new SemiPreciousStone(7.7F, "Yellow", "Citrine", 110.0F, 0.75F, 7.2F, 0.7F, "yes", "yes"));
    }
}
