/**
 * Created by Adrien on 07/07/2017.
 */
public class Project {

    private int budget;
    private int idProject;
    private String name;
    private String dateFin;
    public Project(int idProject, String name, String dateFin, int budget)
    {
        this.name = name;
        this.budget = budget;
        this.idProject = idProject;
        this.dateFin = dateFin;
    }
}
