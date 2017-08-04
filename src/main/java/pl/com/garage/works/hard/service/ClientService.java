package pl.com.garage.works.hard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.works.hard.dao.ClientDao;
import pl.com.garage.works.hard.model.Client;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Service
public class ClientService {

    @Autowired
    private ClientDao clientDao;

    //create
    public void saveClient(Client client){ clientDao.saveClient(client);
    }
    //read
    public Client findClientById(Integer id){
        return clientDao.findClientById(id);
    }
    //update
    public void updateClient(String clientName, Client client){
        clientDao.updateClient(clientName, client);
    }
    //delete
    public void deleteClient(Client client){
        clientDao.deleteClient(client);
    }
    //list
    public List<Client> findAllClients(){
        return clientDao.findAllClients();
    }
}
