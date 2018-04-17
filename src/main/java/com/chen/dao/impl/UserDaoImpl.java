package com.chen.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.chen.dao.main.User;
import com.chen.utils.Conn;

public class UserDaoImpl {
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	public boolean Registered(User user) {
		int i = 0;
		boolean success = false;
		String sql = "insert into user (u_id,u_username,u_name,u_password,u_phone,u_email,u_city,u_gender,u_image,u_registeredtime,u_birthday) values(?,?,?,?,?,?,?,?,?,?,?)";
		Date time_temp = new Date();
		SimpleDateFormat rtime_sdf = new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
		String time = rtime_sdf.format(time_temp);
		Date u_id_temp = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYMMDDHHmmssSSS");
		String u_id = sdf.format(u_id_temp);
		try {
			conn = Conn.getConnection();
			pstmt = conn.prepareStatement(sql);
			System.out.println("-----------------------------");
			//这边是有顺序的
			pstmt.setString(1, u_id);
			pstmt.setString(2, user.getU_username());
			pstmt.setString(3, user.getU_name());
			pstmt.setString(4, user.getU_password());
			pstmt.setString(5, user.getU_phone());
			pstmt.setString(6, user.getU_email());
			pstmt.setString(7, user.getU_city());
			pstmt.setString(8, user.getU_gender());
			pstmt.setString(9, user.getU_image());
			pstmt.setString(10, time);
			pstmt.setString(11,user.getU_birthday() );
			i = pstmt.executeUpdate();
			if(i>0) {
				success = true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage().toString());
		} finally {
			Conn.release(conn);
			Conn.release(pstmt);
		}
		return success;
		
	}
}
