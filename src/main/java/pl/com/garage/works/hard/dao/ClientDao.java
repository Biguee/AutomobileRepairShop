package pl.com.garage.works.hard.dao;

import pl.com.garage.works.hard.model.Client;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */

public interface ClientDao {


    //create
    //void addClient(String name, String surname, String NIP);

    void saveClient(Client client);
    //read
    Client findClientById(int id);
    //update
    void updateClient( String clientName, Client client);
    //delete
    void deleteClient(Client client);
    //list
    List<Client> findAllClients();

}
