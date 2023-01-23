package entity;

import java.util.ArrayList;
import java.util.List;

public class AllHouses {
    private final House house1 = new House(200000, 3, 1, 123, "house1");
    private final House house2 = new House(150000, 2, 1, 92, "house2");
    private final House house3 = new House(250000, 4, 2, 150, "house3");

    private final Villa villa1 = new Villa(300000, 4, 2, 250, "villa1");
    private final Villa villa2 = new Villa(350000, 6, 2, 270, "villa2");
    private final Villa villa3 = new Villa(400000, 6, 3, 300, "villa3");

    private final Summerhouse summerhouse1 = new Summerhouse(450000, 2, 1, 85, "summerhouse1");
    private final Summerhouse summerhouse2 = new Summerhouse(470000, 2, 1, 95, "summerhouse2");
    private final Summerhouse summerhouse3 = new Summerhouse(500000, 3, 1, 115, "summerhouse3");

    List<HouseType> houses;
    List<HouseType> villas;
    List<HouseType> summerhouses;

    public AllHouses() {
        houses = new ArrayList<>(List.of(house1, house2, house3));
        villas = new ArrayList<>(List.of(villa1, villa2, villa3));
        summerhouses = new ArrayList<>(List.of(summerhouse1, summerhouse2, summerhouse3));
    }

    public List<HouseType> getHouseList() {
        return houses;
    }

    public List<HouseType> getVillaList() {
        return villas;
    }

    public List<HouseType> getSummerhouseList() {
        return summerhouses;
    }

    public List<HouseType> getAllHouses() {
        List<HouseType> allHouses = new ArrayList<>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(summerhouses);
        return allHouses;
    }
}
