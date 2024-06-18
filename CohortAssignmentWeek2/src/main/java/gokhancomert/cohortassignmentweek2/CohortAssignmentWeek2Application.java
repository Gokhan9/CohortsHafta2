package gokhancomert.cohortassignmentweek2;

import gokhancomert.cohortassignmentweek2.Service.HomeService;
import gokhancomert.cohortassignmentweek2.Service.HomeManagement;
import gokhancomert.cohortassignmentweek2.modul.Home;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CohortAssignmentWeek2Application {

    public static void main(String[] args) {

        HomeManagement homeManagement = new HomeManagement();
        HomeService HomeService = new HomeService(homeManagement);

        System.out.println("Total price of houses:" + HomeService.getHomesTotalPrice());
        System.out.println("Total price of villas:" + HomeService.getVillasTotalPrice());
        System.out.println("Total price of resorts:" + HomeService.getResortsTotalPrice());
        System.out.println("Total price of all houses:" + HomeService.getAllHomeTotalPrice());

        System.out.println("Average square meter of houses:" + HomeService.getHomesSquareMeter());
        System.out.println("Average square meter of villas:" + HomeService.getVillasSquareMeter());
        System.out.println("Average square meter of resorts:" + HomeService.getResortsSquareMeter());
        System.out.println("Average square meters of all houses:" + HomeService.getAllHomesSquareMeter());

        List<Home> filterAllHome = HomeService.getAllRoomAndSalon(3, 1);
        System.out.println("houses with 3 rooms and 1 living room:" + filterAllHome.size());
    }
}
