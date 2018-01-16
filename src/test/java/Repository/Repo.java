package Repository;

import Base.BaseUtil;
import Model.UserModel;

import java.sql.*;
import java.util.Random;
import java.util.UUID;

public class Repo extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();
    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    public static String FilePath ="//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static UserModel user1 = null;

    public Repo(BaseUtil base) {


        this.base = base;
    }

    public static UserModel GetUser()
{

    String hostName = "192.168.0.40";
    String dbName = "SALCATEST_MSCRM";
    String user = "CrmSqlUser";
    String password = "CrmSqlPass";
    String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;loginTimeout=30;", hostName, dbName, user, password);


    Connection connection = null;
    try {
        //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        System.out.println("Connecting to Database...");
        connection = DriverManager.getConnection(url);
        if (connection != null) {
            System.out.println("Connected to the Database...");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }


    try {

        String query = "select TOP 1 * from Account (NOLOCK) WHERE new_accountusername is NOT NULL and new_accountpassword is NOT NULL and new_portalstatus=1 order by CreatedOn desc";
        statement = connection.createStatement();
        rs = statement.executeQuery(query);

        while (rs.next()) {
            user1 = new UserModel();

            user1.UserName = rs.getString("new_accountusername");
            user1.Password = rs.getString("new_accountpassword");


        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    if (connection != null) {
        try {
            System.out.println("Closing Database Connection...");
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    return user1;
}

}
