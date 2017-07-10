import java.sql.*;
class MySQLAccess{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/peneloppeDB?autoReconnect=true&useSSL=false","admin","admin");
//here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();
            Statement stmt1=con.createStatement();
            stmt.executeUpdate("INSERT INTO squad(Name , idProject) VALUES ('Compta', 1)");
            ResultSet rs=stmt1.executeQuery("select * from squad");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }
}  