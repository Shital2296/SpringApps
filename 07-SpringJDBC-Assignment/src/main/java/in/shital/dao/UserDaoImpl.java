package in.shital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import in.shital.model.User;

public class UserDaoImpl implements UserDao{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void save(User user) {
		
		String query = "insert into User (id, name, role) values (?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getRole());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User saved with id="+user.getId());
			}else System.out.println("User save failed with id="+user.getId());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public User getById(int id) {
		String query = "select name, role from User where id = ?";
		User us = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()){
				us = new User();
				us.setId(id);
				us.setName(rs.getString("name"));
				us.setRole(rs.getString("role"));
				System.out.println("User Found::"+us);
			}else{
				System.out.println("No User found with id="+id);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return us;
	
	}

	public void update(User user) {
		String query = "update User set name=?, role=? where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, user.getName());
			ps.setString(2, user.getRole());
			ps.setInt(3, user.getId());
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User updated with id="+user.getId());
			}else System.out.println("No User found with id="+user.getId());
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void deleteById(int id) {
		String query = "delete from User where id=?";
		Connection con = null;
		PreparedStatement ps = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int out = ps.executeUpdate();
			if(out !=0){
				System.out.println("User deleted with id="+id);
			}else System.out.println("No User found with id="+id);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public List<User> getAll() {
		String query = "select id, name, role from User";
		List<User> usList = new ArrayList<User>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			con = dataSource.getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()){
				User us = new User();
				us.setId(rs.getInt("id"));
				us.setName(rs.getString("name"));
				us.setRole(rs.getString("role"));
				usList.add(us);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return usList;
	}

}

