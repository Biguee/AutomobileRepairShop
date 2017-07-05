package pl.com.garage.works.hard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.com.garage.works.hard.model.Part;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class PartDaoImpl implements PartDao {

    @Autowired
    private SessionFactory sessionFactory;

    //be or not to be?
    public PartDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void savePart(Part part) {
        sessionFactory.getCurrentSession().save(part);
    }

    @Override
    public Part findPartById(Integer id) {
        return sessionFactory.getCurrentSession().load(Part.class, id);
    }

    @Override
    public void updatePart(String partNumber, Part part) {
        part.setPartNumber(partNumber);
        sessionFactory.getCurrentSession().update(partNumber, part);
    }

    @Override
    public void deletePart(Integer id, Part part) {
        //TODO
        //sessionFactory.getCurrentSession().get(Part.class, id);
        id = part.getId();
        sessionFactory.getCurrentSession().load(Part.class, id);
        sessionFactory.getCurrentSession().delete(part);
    }

    @Override
    public List<Part> findAllParts() {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();

        CriteriaQuery<Part> criteriaQuery = criteriaBuilder.createQuery(Part.class);
        criteriaQuery.from(Part.class);

        return getCurrentSession().createQuery(criteriaQuery).list();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
