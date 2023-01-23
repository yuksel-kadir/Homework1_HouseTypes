import entity.House;
import entity.Summerhouse;
import entity.Villa;
import service.RealtorService;

public class Main {
    public static void main(String[] args) {
        int numberOfRooms = 4;
        int numberOfLivingRooms = 2;
        RealtorService realtorService = new RealtorService();
        System.out.println("==================TOTAL PRICES==============================");
        System.out.println("TOTAL price of the HOUSES: " + realtorService.getTotalPriceOfAHouseType(House.class));
        System.out.println("TOTAL price of the VILLAS: " + realtorService.getTotalPriceOfAHouseType(Villa.class));
        System.out.println("TOTAL price of the SUMMERHOUSES: " + realtorService.getTotalPriceOfAHouseType(Summerhouse.class));
        System.out.println("TOTAL price of the all house types(HOUSE, VILLA, SUMMERHOUSE): " + realtorService.getTotalPriceOfAllHouseTypes());
        System.out.println("FILTERED BY number of rooms and number of living rooms(" + numberOfRooms + ", " + numberOfLivingRooms + "): " + realtorService.getFilteredByRooms(numberOfRooms, numberOfLivingRooms));
        System.out.println("==================AVERAGE AREAS==============================");
        System.out.println("Average area of the HOUSES: " + realtorService.getAverageAreaOfAHouseType(House.class));
        System.out.println("Average area of the VILLAS: " + realtorService.getAverageAreaOfAHouseType(Villa.class));
        System.out.println("Average area of the SUMMERHOUSES: " + realtorService.getAverageAreaOfAHouseType(Summerhouse.class));
        System.out.println("Average are of the all house types: " + realtorService.getAverageOfAllHouseTypes());
    }
}