package cn.apptec.javainone.yh.ordercenter;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 生成 mini 店自动补货的sql 语句
 */
public class DeleteShopRepCartAi {


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://10.0.193.196/b2b_ordercenter_prod";

    //  Database credentials
    static final String USER = "andrewcao";
    static final String PASS = "andrewcao`123";

    public static void main(String[] args) {
        // Connection conn = null;
        // try{
        //     //STEP 2: Register JDBC driver
        //     Class.forName("com.mysql.jdbc.Driver");
        //
        //     //STEP 3: Open a connection
        //     System.out.println("Connecting to database...");
        //     conn = DriverManager.getConnection(DB_URL,USER,PASS);
        //
        //
        //     long all = 0;
        //     int rows = 1;
        //     while (rows > 0) {
        //         // System.out.println("rows: " + rows);
        //         try {
        //             all = all + 1;
        //             rows = deal(conn);
        //             System.out.println("all: " + all);
        //         } catch (SQLException e) {
        //             e.printStackTrace();
        //         }
        //     }
        //
        //
        //     conn.close();
        // }catch(SQLException se){
        //     //Handle errors for JDBC
        //     se.printStackTrace();
        // }catch(Exception e){
        //     //Handle errors for Class.forName
        //     e.printStackTrace();
        // }finally{
        // }//end try
    }//end main

    private static int deal(Connection conn) throws SQLException {
        List<Long> ids = new ArrayList<>();
        //STEP 4: Execute a query
        Statement stmt = null;
        // System.out.println("Creating statement...");
        stmt = conn.createStatement();
        // String sql;
        // sql = "SELECT id, created_date from shop_rep_cart_ai WHERE created_date in('20190703', '20190704', '20190705', '20190706', '20190707', '20190708', " +
        //         "'20190709') " +
        //         "limit 1000";
        // ResultSet rs = stmt.executeQuery(sql);
        //
        // //STEP 5: Extract data from result set
        // while(rs.next()){
        //     //Retrieve by column name
        //     long id  = rs.getLong("id");
        //     long created_date  = rs.getLong("created_date");
        //     //Display values
        //     ids.add(id);
        //     // System.out.print("ID: " + id + "\n");
        //     // System.out.print("created_date: " + created_date + "\n");
        // }
        //
        // if (CollectionUtils.isEmpty(ids)) {
        //     return 0;
        // }
        String del = "delete from shop_rep_cart_ai where  created_date != '20190710' limit 100000" ;
        // String del = "delete from shop_rep_cart_ai where id in(" + Joiner.on(",").join(ids) + ") and created_date != '20190710' limit 1000" ;

        System.out.println(del + new Date());
        stmt.execute(del);
        // conn.commit();
        //STEP 6: Clean-up environment
        // rs.close();
        stmt.close();
        return 1;
    }
}//end FirstExample

