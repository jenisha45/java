package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Newdatabase {

	/**
	 * @param args
	 */
	static Connection con = null;
	public static void main(String[] args) {


		        try {
		            Class.forName("com.mysql.jdbc.Driver");

		            con = DriverManager.getConnection(
		                "jdbc:mysql://localhost/database",
		                "root",
		                "admin"
		            );

		            //  INSERT using PreparedStatement
		            String insertQuery = "INSERT INTO studentinfo(name, address, mobile_no) VALUES (?, ?, ?)";
		            PreparedStatement ps = con.prepareStatement(insertQuery);

		            ps.setString(1, "Ram");
		            ps.setString(2, "Italy");
		            ps.setLong(3, 543222);

		            int n = ps.executeUpdate();
		            System.out.println("Number of rows inserted = " + n);

		            //  SELECT using PreparedStatement
		            String selectQuery = "SELECT * FROM studentinfo";
		            PreparedStatement ps2 = con.prepareStatement(selectQuery);

		            ResultSet rs = ps2.executeQuery();

		            System.out.println("ID\tName\tAddress\tMobile");

		            while (rs.next()) {
		                int id = rs.getInt(1);
		                String name = rs.getString("name");
		                String address = rs.getString("address");
		                long mobile = rs.getLong("mobile_no");

		                System.out.println(id + "\t" + name + "\t" + address + "\t" + mobile);
		            }

		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }
		}

