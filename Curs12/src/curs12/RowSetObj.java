/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curs12;

import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author rmaftei
 */
public class RowSetObj {
   com.sun.rowset.JdbcRowSetImpl
    

     try {
            JdbcRowSet j = RowSetProvider.newFactory().createJdbcRowSet(); 
            j.setUrl(URL + DB_NAME);
            j.setPassword(PASSWORD);
            j.setUsername(USER_NAME);
            j.setCommand("SELECT * FROM customers WHERE sex = ?");
            j.setString(1, "male");
            j.execute();
            while (j.next()) {
                System.out.println(j.getRow() + " " + j.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    

