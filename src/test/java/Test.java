import DAO.TourDAO;
import Entity.Tour;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class Test {
    @org.junit.jupiter.api.Test
    public void testListAllTour(){
        TourDAO tourDAO = new TourDAO();
        ArrayList<Tour> tours = tourDAO.getListTour();
//        System.out.println(tours.size());
        Assertions.assertNotEquals( 0, tours.size());
    }
}
