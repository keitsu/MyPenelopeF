/**
 * Created by Adrien on 07/07/2017.
 */
public class Document {

    private int idDoc;
    private int idGroup;
    private String name;
    public Document(String name, int idGroup, int idDoc)
    {
        this.name = name;
        this.idDoc = idDoc;
        this.idGroup = idGroup;
    }
}
