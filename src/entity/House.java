package entity;

import entity.HouseType;

public class House extends HouseType {
    public House(int price, int numberOfRooms, int numberOfLivingRooms, int area, String houseName) {
        super(price, numberOfRooms, numberOfLivingRooms, area, houseName);
    }
}
