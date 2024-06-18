package gokhancomert.cohortassignmentweek2.Service;

import gokhancomert.cohortassignmentweek2.modul.Home;
import gokhancomert.cohortassignmentweek2.modul.Resort;
import gokhancomert.cohortassignmentweek2.modul.Villa;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Service
public class HomeManagement {

    private List<Home> homeList = new ArrayList<>();
    private List<Villa> villaList = new ArrayList<>();
    private List<Resort> resortList = new ArrayList<>();


    public HomeManagement() {

        //homeOjects
        homeList.add(new Home(350000, 95, 2, 1));
        homeList.add(new Home(450000, 105, 3, 1));
        homeList.add(new Home(500000, 115, 3, 1));
        //resortObjects
        resortList.add(new Resort(625000, 120, 3, 1));
        resortList.add(new Resort(700000, 130, 4, 1));
        resortList.add(new Resort(7500000, 135, 5, 1));
        //villaObjects
        villaList.add(new Villa(850000, 160, 4, 1));
        villaList.add(new Villa(950000, 180, 5, 2));
        villaList.add(new Villa(100000, 200, 6, 3));
    }
}
