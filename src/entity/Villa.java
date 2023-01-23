package entity;

public class Villa extends HouseType {
    public Villa(int price, int numberOfRooms, int numberOfLivingRooms, int area, String houseName) {
        super(price, numberOfRooms, numberOfLivingRooms, area, houseName);
    }

    @Override
    public String toString() {
        return "Villa{"+
                super.toString()
                + "} ";
    }
}

