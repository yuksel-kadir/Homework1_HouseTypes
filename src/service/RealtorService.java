package service;

import entity.HouseType;

import java.util.List;
import java.util.stream.Collectors;


public class RealtorService {

    public RealtorService() {
    }

    public List<String> getFilteredByRooms(int numberOfRooms, int numberOfLivingRooms, List<HouseType> buildings) {
        return buildings
                .stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms)
                .filter(house -> house.getNumberOfLivingRooms() == numberOfLivingRooms)
                .map(HouseType::getHouseName)
                .collect(Collectors.toList());
    }

    private float getTotalPrice(List<HouseType> buildings) {
        return buildings
                .stream()
                .map(HouseType::getPrice)
                .reduce(0, Integer::sum);
    }

    private float getTotalArea(List<HouseType> buildings) {
        return buildings
                .stream()
                .map(HouseType::getArea)
                .reduce(0, Integer::sum);
    }

    public float getTotalPriceOfHouses(List<HouseType> houses) {
        return getTotalPrice(houses);
    }

    public float getTotalPriceOfVillas(List<HouseType> villas) {
        return getTotalPrice(villas);
    }

    public float getTotalPriceOfSummerhouses(List<HouseType> summerhouses) {
        return getTotalPrice(summerhouses);
    }

    public float getTotalPriceOfAllHouseTypes(List<HouseType> buildings) {
        return getTotalPrice(buildings);
    }

    public float getAverageAreaOfHouses(List<HouseType> houses) {
        return getTotalArea(houses) / houses.size();
    }

    public float getAverageAreaOfVillas(List<HouseType> villas) {
        return getTotalArea(villas) / villas.size();
    }

    public float getAverageAreaOfSummerhouses(List<HouseType> summerhouses) {
        return getTotalArea(summerhouses) / summerhouses.size();
    }

    public float getAverageAreaOfAllHouseTypes(List<HouseType> buildings) {
        return getTotalArea(buildings) / buildings.size();
    }
}
