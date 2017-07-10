package pl.com.garage.works.hard.model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by 8760w on 2017-07-04.
 */
//@Entity
//@Table(name = "clients")
public class Client {

    //@Id
    //@GeneratedValue(strategy = IDENTITY)
    //@Column(name = "id", unique = true, nullable = false)
    private int id;
    //@Column(name = "client_name")
    private String clientName;
    //@Column(name = "client_surname")
    private String clientSurname;
    //@Column(name = "client_NIP")
    private String clientNIP;

    public Client(int id, String clientName, String clientSurname, String clientNIP) {
        this.id = id;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientNIP = clientNIP;
    }

    public Client() {
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientSurname='" + clientSurname + '\'' +
                ", clientNIP='" + clientNIP + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientName != null ? !clientName.equals(client.clientName) : client.clientName != null) return false;
        if (clientSurname != null ? !clientSurname.equals(client.clientSurname) : client.clientSurname != null)
            return false;
        return clientNIP != null ? clientNIP.equals(client.clientNIP) : client.clientNIP == null;
    }

    @Override
    public int hashCode() {
        int result = clientName != null ? clientName.hashCode() : 0;
        result = 31 * result + (clientSurname != null ? clientSurname.hashCode() : 0);
        result = 31 * result + (clientNIP != null ? clientNIP.hashCode() : 0);
        return result;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientNIP() {
        return clientNIP;
    }

    public void setClientNIP(String clientNIP) {
        this.clientNIP = clientNIP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
