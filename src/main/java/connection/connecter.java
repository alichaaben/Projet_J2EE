package connection;
import java.sql.*;
public class connecter {

    public Connection connectDB() {
        Connection conx = null;
        try {
            String Driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/J2EE";
            String nameDB = "root";
            String pass = "50211159Ali";
            Class.forName(Driver);
            conx = DriverManager.getConnection(url, nameDB, pass);
        } catch (Exception e) {
            System.out.println(e);
        }
        return conx;
    }


    public String  getMot(int x){
        String mot="";
       try{
           Connection con=connectDB();
           Statement stm=con.createStatement();
           ResultSet res=stm.executeQuery("select mot from tabMot where id=3");

           mot=res.getString(1);
       }catch (Exception e){
           System.out.print(e);
       }
       return mot;
    }

}
