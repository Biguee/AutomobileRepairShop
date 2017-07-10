package pl.com.garage.works.hard.dao;

import pl.com.garage.works.hard.model.Client;
import pl.com.garage.works.hard.model.Repair;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface ClientDao {


    //create
    void addClient(String name, String surname, String NIP);
    void saveClient(Client client);
    //read
    Client findClientbyId(int id);
    //update
    void updateClient(String surname, String nip);
    //delete
    void deleteClientById(int id);
    //list
    List<Client> findAllClients();

}
