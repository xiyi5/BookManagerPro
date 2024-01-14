import java.sql.*;

public class DBconnect {
    String jdbc="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/bookmanagerpro";
    String userName="root";
    String password="324254";
    Connection c;
    public DBconnect(){
        try {
            Class.forName(jdbc);
            c=DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int regist(String username,String name,String sex,String password,String phone,String question,String anwser){
        int code=0;
        String exec=String.format("insert into userinfo (username,password,name,sex,role,phone,question,anwser) values('%s','%s','%s','%s',0,'%s','%s','%s')", username,password,name,sex,phone,question,anwser);
        try {
            Statement s=c.createStatement();
            s.executeUpdate(exec);
        } catch (Exception e) {
            e.printStackTrace();
            code=1;
        }
        return code;
    }
}
