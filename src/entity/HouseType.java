package entity;

public abstract class HouseType {
    private int price;
    private int numberOfRooms;
    private int numberOfLivingRooms;
    private int area;
    private String houseName;
    public HouseType(int price, int numberOfRooms, int numberOfLivingRooms, int area, String houseName) {
        this.price = price;
        this.numberOfRooms = numberOfRooms;
        this.numberOfLivingRooms = numberOfLivingRooms;
        this.area = area;
        this.houseName = houseName;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName){
        this.houseName = houseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

}
