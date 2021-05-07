package userSim.dataAccess.concretes;

import userSim.dataAccess.abstracts.UserDao;
import userSim.entities.concretes.User;

public class AbcUserDao implements UserDao {

	@Override
	public void add(User user) {
	
		System.out.println("Abc ile eklendi : " + user.getFirstName());
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


	

}
