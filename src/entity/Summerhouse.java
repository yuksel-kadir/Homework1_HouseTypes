package entity;

public class Summerhouse extends HouseType {
    public Summerhouse(int price, int numberOfRooms, int numberOfLivingRooms, int area, String houseName) {
        super(price, numberOfRooms, numberOfLivingRooms, area, houseName);
    }

    @Override
    public String toString() {
        return "Summerhouse{" +
                super.toString()
                + "} ";
    }
}
