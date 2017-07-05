package pl.com.garage.works.hard.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import pl.com.garage.works.hard.model.Client;

import java.util.List;

/**
 * Created by 8760w on 2017-07-04.
 */
@Repository
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private RowMapper<Client> clientRowMapper = (resultSet, rowNum) -> {

        int id = resultSet.getInt("id");
        String name = resultSet.getString("name");
        String surname = resultSet.getString("surname");
        String nip = resultSet.getString("nip");

        return new Client(id, name, surname, nip); };

    @Override
    public void addClient(String name, String surname, String NIP) {
        jdbcTemplate.update("insert into CLIENTS (name, surname, NIP) values (?,?,?)", name, surname, NIP);
    }

    @Override
    public Client findClientbyId(int id) {
        return jdbcTemplate.queryForObject("select * from clients where id=?", clientRowMapper, id);
    }

    @Override
    public void updateClient(String surname, String nip) {
        jdbcTemplate.update("update clients set nip =? where surname=?", nip, surname);

    }

    @Override
    public void deleteClientById(int id) {
        jdbcTemplate.update("delete from clients where id=?", id);
    }

    @Override
    public List<Client> findAllClients() {
        return jdbcTemplate.query("select * from clients", clientRowMapper);
    }








}
