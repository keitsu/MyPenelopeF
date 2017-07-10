/**
 * Created by Adrien on 07/07/2017.
 */
public class Task {

    private int idTask;
    private int idUser;
    private String name;
    private String desc;
    public Task(int idTask, int idUser, String name, String desc)
    {
        this.name = name;
        this.idTask = idTask;
        this.idUser = idUser;
    }
}
