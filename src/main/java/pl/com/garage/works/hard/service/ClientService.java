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

    public void addClient(String name, String surname, String NIP){
        clientDao.addClient(name, surname, NIP);
    }

    public void saveClient(Client client) { clientDao.saveClient(client);}

    public Client findClientbyId(int id){
        return clientDao.findClientbyId(id);
    }

    public void updateClient(String surname, String nip){
         clientDao.updateClient(surname, nip);
    }

    public void deleteClientById(int id){
        clientDao.deleteClientById(id);
    }

    public List<Client> findAllClients(){
        return clientDao.findAllClients();
    }

}
