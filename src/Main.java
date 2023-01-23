import entity.HouseType;
import repository.AllHouses;
import service.RealtorService;

public class Main {
    public static void main(String[] args) {
        int numberOfRooms = 2;
        int numberOfLivingRooms = 1;

        AllHouses allHouses = new AllHouses();
        RealtorService realtorService = new RealtorService();

        System.out.println("==================TOTAL PRICES==============================");
        System.out.println("TOTAL price of the HOUSES: " + realtorService.getTotalPriceOfHouses(allHouses.getHouseList()));
        System.out.println("TOTAL price of the VILLAS: " + realtorService.getTotalPriceOfVillas(allHouses.getVillaList()));
        System.out.println("TOTAL price of the SUMMERHOUSES: " + realtorService.getTotalPriceOfSummerhouses(allHouses.getSummerhouseList()));
        System.out.println("TOTAL price of the all house types(HOUSE, VILLA, SUMMERHOUSE): " + realtorService.getTotalPriceOfAllHouseTypes(allHouses.getAllHouses()));
        System.out.println("FILTERED BY number of rooms and number of living rooms(" + numberOfRooms + ", " + numberOfLivingRooms + "): ");
        for (HouseType house : realtorService.getFilteredByRooms(numberOfRooms, numberOfLivingRooms, allHouses.getAllHouses())) {
            System.out.println(house);
        }

        System.out.println("==================AVERAGE AREAS==============================");
        System.out.println("AVERAGE area of the HOUSES: " + realtorService.getAverageAreaOfHouses(allHouses.getHouseList()));
        System.out.println("AVERAGE area of the VILLAS: " + realtorService.getAverageAreaOfVillas(allHouses.getVillaList()));
        System.out.println("AVERAGE area of the SUMMERHOUSES: " + realtorService.getAverageAreaOfSummerhouses(allHouses.getSummerhouseList()));
        System.out.println("AVERAGE are of the all house types(HOUSE, VILLA, SUMMERHOUSE): " + realtorService.getAverageAreaOfAllHouseTypes(allHouses.getAllHouses()));
    }
}