/**
 * Created by Adrien on 07/07/2017.
 */
public class User {

    private int idUser;
    private int idSquad;
    private String name;
    private String firstname;
    public User(String name, String firstname, int idSquad, int idUser)
    {
        this.name = name;
        this.idUser = idUser;
        this.idSquad = idSquad;
        this.firstname = firstname;
    }
}
