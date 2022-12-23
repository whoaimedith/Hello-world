package SqlSever;



import java.sql.*;

public class TestDB1 {
    public static void main(String[] args){
        String strDriver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strUrl="jdbc:sqlserver://localhost:1433;databaseName=教学管理系统;";
        String user="lisa";
        String password="123456";
        Connection con=null;

    try{
        Class.forName(strDriver);
        con= DriverManager.getConnection(strUrl,user,password);
        Statement stmt=con.createStatement();
        String sql="select * from Student";
        ResultSet resultSet=stmt.executeQuery(sql);
        System.out.println(resultSet);
        stmt.close();
        con.close();
    }catch(ClassNotFoundException e){
        e.getStackTrace();

    }
    catch (SQLException e){
        e.getStackTrace();
    }

    finally {
        try {
            con.close();
        }catch (SQLException e){
            e.getStackTrace();
        }
    }
    }}
