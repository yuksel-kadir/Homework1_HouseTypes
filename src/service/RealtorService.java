package service;

import entity.HouseType;

import java.util.List;
import java.util.stream.Collectors;


public class RealtorService {

    public RealtorService() {
    }

    //Filter houses by the number of rooms and the number of living rooms.
    public List<HouseType> getFilteredByRooms(int numberOfRooms, int numberOfLivingRooms, List<HouseType> buildings) {
        return buildings
                .stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms)
                .filter(house -> house.getNumberOfLivingRooms() == numberOfLivingRooms)
                //.map(HouseType::getHouseName)
                .collect(Collectors.toList());
    }

    //Get the total price of the houses in the buildings list.
    private float getTotalPrice(List<HouseType> buildings) {
        return buildings
                .stream()
                .map(HouseType::getPrice)
                .reduce(0, Integer::sum);
    }

    //Get the total area of the houses in the buildings list.
    private float getTotalArea(List<HouseType> buildings) {
        return buildings
                .stream()
                .map(HouseType::getArea)
                .reduce(0, Integer::sum);
    }

    //Get the total price of the houses in the "houses" list.
    public float getTotalPriceOfHouses(List<HouseType> houses) {
        return getTotalPrice(houses);
    }

    //Get the total price of the villas in the "villas" list.
    public float getTotalPriceOfVillas(List<HouseType> villas) {
        return getTotalPrice(villas);
    }

    //Get the total price of the summer houses in the "summerhouses" list.
    public float getTotalPriceOfSummerhouses(List<HouseType> summerhouses) {
        return getTotalPrice(summerhouses);
    }

    //Get the total price of the all house types.
    public float getTotalPriceOfAllHouseTypes(List<HouseType> buildings) {
        return getTotalPrice(buildings);
    }

    //Get the average area of the houses in the "houses" list.
    public float getAverageAreaOfHouses(List<HouseType> houses) {
        return getTotalArea(houses) / houses.size();
    }

    //Get the average area of the villas in the "villas" list.
    public float getAverageAreaOfVillas(List<HouseType> villas) {
        return getTotalArea(villas) / villas.size();
    }

    //Get the average area of the summer houses in the "summerhouses" list.
    public float getAverageAreaOfSummerhouses(List<HouseType> summerhouses) {
        return getTotalArea(summerhouses) / summerhouses.size();
    }

    //Get the average area of the all house types.
    public float getAverageAreaOfAllHouseTypes(List<HouseType> buildings) {
        return getTotalArea(buildings) / buildings.size();
    }
}
