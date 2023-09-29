package in.shital.dao;

import java.util.List;

import in.shital.model.User;

public interface UserDao {

	    //Create
		public void save(User user);
		//Read
		public User getById(int id);
		//Update
		public void update(User user);
		//Delete
		public void deleteById(int id);
		//Get All
		public List<User> getAll();
	}
	

