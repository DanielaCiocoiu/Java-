
package curs12;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author rmaftei
 */
public class Curs12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Properties connectionProps = new Properties();
        connectionProps.put("serverTimezone", "Europe/Bucharest");
        connectionProps.put("user", "u1");
        connectionProps.put("password", "u1");
        connectionProps.put("useSSL", "false");

        Connection c = null;
        Statement s = null;
        ResultSet r = null;

        // 1. Get a connection to database
        c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sampledatabaseeu", connectionProps);

        // 2. Create a statement
        s = c.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);

        // 3. Execute SQL query
        r = s.executeQuery("select * from eu");

        // 4. Process the result set
        while (r.next()) {
            System.out.println(r.getString("name") + " are " + r.getInt("greutate")
                    + " kg, " + " varsta: " + r.getInt("varsta") + ", nivel de studii: " + r.getString("educatie"));
        }
        //ca sa obtin nr de randuri
        r.last();
        int nrRanduri = r.getRow();
        System.out.println(r.getRow());
        //ca sa obtin primul nume
        r.first();
        System.out.println(r.getString("name"));

        //modificarea inregistrarii curente
        r.updateString("name", "victor");
        r.updateInt("greutate", 60);
        r.updateInt("varsta", 40);
        r.updateString("educatie", "liceu");
        r.updateRow();

        r.moveToInsertRow();
        r.updateString("name", "Maia");
        r.updateInt("greutate", 65);
        r.updateInt("varsta", 30);
        r.updateString("educatie", "master");
        //r.insertRow();
//        System.out.println(r.first().r.relative(3));
//        System.out.println( r.first().r.next(). r.next().r.next());
        System.out.println( r.absolute(2));
//        System.out.println(r.beforeFirst().r.next().r.next().r.next());
//        System.out.println(r.absolute(1); r.next(); r.next(); r.next(););
//        System.out.println(r.relative(4).r.absolute(-1));
       r.first(); r.relative(3);
 r.first(); r.next(); r.next(); r.next();
 r.absolute(2);
 r.beforeFirst(); r.next();r.next();r.next();
 r.absolute(1); r.next(); r.next(); r.next();
 r.relative(4); r.absolute(-1);
       
  RowSet a = RowSetProvider.newFactory().createWebRowSet();
	  RowSet b = new com.sun.rowset.WebRowSetImpl();
	  RowSet h = new javax.sql.rowset.WebRowSetImpl();
	  RowSet d = RowSetFactory.createWebRowSetImpl();
	  RowSet e = new RowSetFactory().newWebRowSet();

        
    }

}

//down vote
//printStackTrace() helps the programmer to understand where the actual problem occurred. printStacktrace()
//is a method of the class Throwable of java.lang package. It prints several lines in the output console.
//The first line consists of several strings. It contains the name of the Throwable sub-class & the package information.
//From second line onwards, it describes the error position/line number beginning with at.
//
//The last line always describes the destination affected by the error/exception. 
//The second last line informs us about the next line in the stack where the control goes after getting 
//transfer from the line number described in the last line.
