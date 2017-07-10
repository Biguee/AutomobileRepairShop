package pl.com.garage.works.hard.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.com.garage.works.hard.model.Part;
import pl.com.garage.works.hard.model.Repair;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Date;
import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
@Transactional
public class RepairDaoImpl implements RepairDao {

    @Autowired
    private SessionFactory sessionFactory;

    //be or not to be?
    public RepairDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void saveRepair(Repair repair) {
        sessionFactory.getCurrentSession().save(repair);
    }

    @Override
    public Repair findRepairById(Integer id) {
        return sessionFactory.getCurrentSession().load(Repair.class, id);
    }

    @Override
    public void updateRepair(double repairCost, Repair repair) {
        repair.setRepairCost(repairCost);
        sessionFactory.getCurrentSession().update(String.valueOf(repairCost), repair);
    }

    @Override
    public void deleteRepair(Repair repair) {
        //todo
    }

    @Override
    public List<Repair> findAllRepair() {
        CriteriaBuilder criteriaBuilder = getCurrentSession().getCriteriaBuilder();

        CriteriaQuery<Repair> criteriaQuery = criteriaBuilder.createQuery(Repair.class);
        criteriaQuery.from(Repair.class);

        return getCurrentSession().createQuery(criteriaQuery).list();
    }

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
