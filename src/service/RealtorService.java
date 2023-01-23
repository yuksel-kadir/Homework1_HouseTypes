package service;

import entity.HouseType;
import entity.House;
import entity.Summerhouse;
import entity.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RealtorService {
    private final House house1 = new House(200000, 3, 1, 123, "house1");
    private final House house2 = new House(150000, 2, 1, 92, "house2");
    private final House house3 = new House(250000, 4, 2, 150, "house3");

    private final Villa villa1 = new Villa(300000, 4, 2, 250, "villa1");
    private final Villa villa2 = new Villa(350000, 6, 2, 270, "villa2");
    private final Villa villa3 = new Villa(400000, 6, 3, 300, "villa3");

    private final Summerhouse summerhouse1 = new Summerhouse(450000, 2, 1, 85, "summerhouse1");
    private final Summerhouse summerhouse2 = new Summerhouse(470000, 2, 1, 95, "summerhouse2");
    private final Summerhouse summerhouse3 = new Summerhouse(500000, 3, 1, 115, "summerhouse3");

    ArrayList<HouseType> buildings;

    public RealtorService() {
        buildings = new ArrayList<>(List.of(
                house1,
                house2,
                house3,
                villa1,
                villa2,
                villa3,
                summerhouse1,
                summerhouse2,
                summerhouse3)
        );
    }

    public List<String> getFilteredByRooms(int numberOfRooms, int numberOfLivingRooms) {
        return buildings
                .stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms)
                .filter(house -> house.getNumberOfLivingRooms() == numberOfLivingRooms)
                .map(HouseType::getHouseName)
                .collect(Collectors.toList());
    }

    public float getTotalPriceOfAHouseType(Class<?> houseType) {
        float sum = buildings
                .stream()
                .filter(houseType::isInstance)
                .map(HouseType::getPrice)
                .reduce(0, (element1, element2) -> element1 + element2);
        return sum;
    }

    public float getAverageAreaOfAHouseType(Class<?> houseType) {
        float filteredListSize = buildings
                .stream()
                .filter(houseType::isInstance)
                .count();
        float totalArea = buildings
                .stream()
                .filter(houseType::isInstance)
                .map(HouseType::getArea)
                .reduce(0, (element1, element2) -> element1 + element2);
        return totalArea / filteredListSize;
    }

    public float getTotalPriceOfAllHouseTypes() {
        float sum = buildings.stream()
                .map(HouseType::getPrice)
                .reduce(0, (element1, element2) -> element1 + element2);
        return sum;
    }

    public float getAverageOfAllHouseTypes() {
        float sum = buildings.stream()
                .map(HouseType::getArea)
                .reduce(0, (element1, element2) -> element1 + element2);
        return sum / buildings.size();
    }

}
