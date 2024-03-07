public class CreatePlanet {
    public static void CreateMainlands(Planet earth) {
        earth.addMainland(new Mainland("Africa", 3.037E7));
        earth.addMainland(new Mainland("Eurasia", 5.36E7));
        earth.addMainland(new Mainland("North America", 2.04E7));
        earth.addMainland(new Mainland("South America", 1.784E7));
        earth.addMainland(new Mainland("Australia", 7660000.0));
        earth.addMainland(new Mainland("Antarctica", 1.412E7));
    }

    public static void CreateOceans(Planet earth) {
        earth.addOcean(new Ocean("Pacific", 1.65E8, 4280));
        earth.addOcean(new Ocean("Atlantic", 9.166E7, 3800));
        earth.addOcean(new Ocean("Arctic", 1.4E7, 1225));
        earth.addOcean(new Ocean("Indian", 3287000.0, 3711));
    }

    public static void CreateIslands(Planet earth) {
        earth.addIsland(new Island("Zealand", "subtropical", 4900000.0));
        earth.addIsland(new Island("Cornwallis Islan", "moderate marine", 6995.0));
        earth.addIsland(new Island("Prince Edward Island", "moderate oceanic", 200.0));
        earth.addIsland(new Island("Kerguelen", "subtropical", 7000.0));
        earth.addIsland(new Island("Graham Island", "moderately warm", 6361.0));
    }
}