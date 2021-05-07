package userSim.dataAccess.abstracts;

import java.util.ArrayList;

import userSim.entities.concretes.User;


public interface UserDao {	
	
	public ArrayList<User> users = new ArrayList<User>();
	
	void add(User user);
	void update(User user);
	void delete(User user);
	
	
	
	
	

	}

