package pl.com.garage.works.hard.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Part;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface PartDao {

    //create
    void savePart(Part part);
    //read
    Part findPartByPartNumber(String partNumber);
    //update
    void updatePart(Part part);
    //delete
    void deletePart(Part part);
    //list
    List<Part> findAllParts();

}
