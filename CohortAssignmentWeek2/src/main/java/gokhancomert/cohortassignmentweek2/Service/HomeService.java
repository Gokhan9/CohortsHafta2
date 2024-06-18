package gokhancomert.cohortassignmentweek2.Service;

import gokhancomert.cohortassignmentweek2.modul.Home;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {

    private HomeManagement homeManagement;

    public HomeService(HomeManagement homeManagement) {
        this.homeManagement = homeManagement;
    }
    public double getHomesTotalPrice(){
        return homeManagement.getHomeList().stream().mapToDouble(Home::getPrice).sum();
    }
    public double getVillasTotalPrice(){
        return homeManagement.getVillaList().stream().mapToDouble(Home::getPrice).sum();
    }
    public double getResortsTotalPrice(){
        return homeManagement.getResortList().stream().mapToDouble(Home::getPrice).sum();
    }

    public double getAllHomeTotalPrice(){
        return getHomesTotalPrice() + getVillasTotalPrice() + getResortsTotalPrice();
    }

    public double getHomesSquareMeter(){
        return homeManagement.getHomeList().stream().mapToDouble(Home::getSquareMeter).average().orElse(0);
    }
    public double getVillasSquareMeter(){
        return homeManagement.getVillaList().stream().mapToDouble(Home::getSquareMeter).average().orElse(0);
    }
    public double getResortsSquareMeter(){
        return homeManagement.getResortList().stream().mapToDouble(Home::getSquareMeter).average().orElse(0);
    }

    public double getAllHomesSquareMeter(){
        List<Home> allHomes = new ArrayList<>();
        allHomes.addAll(homeManagement.getHomeList());
        allHomes.addAll(homeManagement.getVillaList());
        allHomes.addAll(homeManagement.getResortList());
        return allHomes.stream().mapToDouble(Home::getSquareMeter).average().orElse(0);
    }

    public List<Home> getAllRoomAndSalon(int numberOfRooms, int numberOfSalon){
        List<Home> allHomes = new ArrayList<>();
        allHomes.addAll(homeManagement.getHomeList());
        allHomes.addAll(homeManagement.getVillaList());
        allHomes.addAll(homeManagement.getResortList());
        return allHomes.stream()
                .filter(ev -> ev.getNumberOfRooms() == numberOfRooms && ev.getNumberOfSalon() == numberOfRooms)
                .collect(Collectors.toList());
    }
}
