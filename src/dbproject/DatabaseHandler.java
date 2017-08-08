package dbproject;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;

public class DatabaseHandler {

    Connection connect = null;
    Statement statement = null;
    PreparedStatement pStatement = null;
    ResultSet result = null;
    ArrayList<String> columnName = new ArrayList<String>();
    private String databaseName;
    String q, query, user;
    String id;
    String value = null;
    private String[] tableName = new String[20];
    private String[] catagory = new String[6];
    private String[] brand = new String[10];
    private String[] u_type = new String[4];

    private int sz_insertion;
    private int updateVal;
    Vector data = new Vector();
    Vector cname = new Vector();

    public void setConnection(String a, String b, String c) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.databaseName = a;

            String url = "jdbc:mysql://localhost/" + databaseName;

            String user = b;

            String password = c;

            c = null;

            connect = DriverManager.getConnection(url, user, password);

            //JOptionPane.showMessageDialog(null, "Connection Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull");
            e.printStackTrace();
        }

    }

    public String[] showtable() {
        try {
            String[] types = {"TABLE"};

            result = connect.getMetaData().getTables(this.databaseName, null, "%", types);

            int i = 0;

            while (result.next()) {
                tableName[i] = result.getString(3);
                i++;
                // System.out.println(tableName);
            }
        } catch (Exception e) {
            System.out.println("Error in Query..");
            e.printStackTrace();
        }
        return tableName;
    }

    //select all data from table
    public ResultSet testQuery(String table_name) {
        try {

            String query = "SELECT * FROM " + table_name;
            statement = connect.createStatement();
            result = statement.executeQuery(query);

            System.out.println("Query is successful");

        } catch (Exception e) {
            System.out.println("Error in query..");
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet searchQuery(String q) {
        try {

            //String query = "SELECT product_name, catagory_name, color, price, brand_name FROM product" + table_name + " WHERE ";
            
//            for(int i=0; i<trav; i++){
//               
//               query += val[i].getKey() + "= "+"'"+val[i].getValue()+"'";
//                
//               System.out.println("key: " +val[i].getKey() + " value: " + val[i].getValue());
//               
//               if(i+1 < trav){
//                    query += " OR ";
//               }
//            
//            }

            query = q;
            System.out.println(query);
            
            System.out.println(query);
            
            statement = connect.createStatement();
            result = statement.executeQuery(query);

            JOptionPane.showMessageDialog(null, "Successfully Searched");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        return result;
    }
//
//   public ArrayList<ArrayList<String>> getResult(ResultSet result) {
//
//        ArrayList<ArrayList<String>> records = new ArrayList<ArrayList<String>>();
//        if (columnName != null) {
//            columnName.clear();
//        }
//
//        try {
//
//            ArrayList<String> colName = new ArrayList<String>();
//
//            for (int i = 1; i <= result.getMetaData().getColumnCount(); i++) {
//                colName.add(result.getMetaData().getColumnName(i));
//
//            }
//
//            //shows column names
//            for (String cc : colName) {
//                System.out.print(cc + " ");
//                columnName.add(cc);
//            }
//
//            System.out.println("");
//
//            while (result.next()) {
//                ArrayList<String> r = new ArrayList<String>();
//
//                for (String cc : colName) {
//                    r.add(result.getString(cc));
//                }
//
//                records.add(r);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return records;
//    }

    public void insertData(String table_name, String[] val) {
        try {
            String query = "INSERT INTO " + table_name + " VALUES(";

            sz_insertion = val.length - 1;

            for (int i = 1; i <= sz_insertion; i++) {
                query += "?";
                if (i < sz_insertion) {
                    query += ",";
                }
            }
            query += ")";

            System.out.println(query);

            
            
            
            for(int i=0; i<3; i++)
            {
                value.concat(val[i]);
            }
            
            query.concat(value);
          
            pStatement = connect.prepareStatement(query);

            for (int i = 0; i < sz_insertion; i++) {
                pStatement.setString(i + 1, val[i]);
            }
            System.out.println(query);

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Insertion Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
    }

    public void update(String[] val, String query) {

        try {
            q = query;
            System.out.println(q);
            updateVal = val.length - 1;
            pStatement = connect.prepareStatement(q);

            for (int i = 0; i < updateVal; i++) {
                pStatement.setString(i + 1, val[i]);
            }
            System.out.println(query);

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }

    }
    
    public String[] getCatagoryName(){
        try{
        String query;
            query = "select catagory_name from catagory";
        statement = connect.createStatement();
        result = statement.executeQuery(query);
        int i = 0;

            while (result.next()) {
                catagory[i] = result.getString(1);
               // System.out.println(Arrays.toString(catagory));
                i++;
                System.out.println(i);
                
            }
            System.out.println(Arrays.toString(catagory));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull");
            e.printStackTrace();
        }
        
        return catagory;

    }
    
    public String[] getBrandName(){
        try{
        String query;
            query = "select brand_name from brand";
        statement = connect.createStatement();
        result = statement.executeQuery(query);
        int i = 0;

            while (result.next()) {
                brand[i] = result.getString(1);
               // System.out.println(Arrays.toString(catagory));
                i++;
                System.out.println(i);
                
            }
            System.out.println(Arrays.toString(brand));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull");
            e.printStackTrace();
        }
        
        return brand;

    }
     public void insertUser(String query){
    try {
            this.q = query;
            System.out.println(q);
            statement = connect.createStatement();
            //result = statement
            statement.executeUpdate(q);
            //result = statement.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "invalid input");
            e.printStackTrace();
        }
    }

     public ResultSet signIn(String email, String pass, String type){
         try{
           // String charid = getTypeID(type);    
           
            query = "select * from usertable where usertype = '"+type+"' and email_id = '"+email+"' and password = '"+pass+"'";
            System.out.println(query);
        statement = connect.createStatement();
        result = statement.executeQuery(query);
       

            int i = 0;

            if(result.next()) {
                
                System.out.println(i);
                
            }
           // System.out.println(Arrays.toString(u_type));
        }catch (Exception e) {
            
            e.printStackTrace();
        }
         return result;
     }
    public String[] getuserType(){
        try{
        String query;
            query = "select usertype from usertype";
        statement = connect.createStatement();
        result = statement.executeQuery(query);
        int i = 0;

            while (result.next()) {
                u_type[i] = result.getString(1);
               // System.out.println(Arrays.toString(catagory));
                i++;
                System.out.println(i);
                
            }
            System.out.println(Arrays.toString(catagory));
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Unsuccessfull");
            e.printStackTrace();
        }
        
        return u_type;

    }

    public void deleteData(String table_name, String col_name, String val) {
        try {
            System.out.println(table_name + " " + col_name + " " + val);

            String query = "DELETE FROM " + table_name + " WHERE " + col_name + "= ?";
            System.out.println(query);

            pStatement = connect.prepareStatement(query);

            pStatement.setString(1, val);

            pStatement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Deleted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not deleted");
            e.printStackTrace();
        }
    }

    
}
