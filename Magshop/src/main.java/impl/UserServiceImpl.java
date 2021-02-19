package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import domain.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	private static Logger LOGGER = Logger.getLogger(UserServiceImpl.class);
	
	private static UserServiceImpl userServiceImpl;

	private UserServiceImpl() {
		try {
			userDao = new UserDaoImpl();
		} catch (InstantiationException e) {

			LOGGER.error(e);
		} catch (IllegalAccessException e) {

			LOGGER.error(e);
		} catch (ClassNotFoundException e) {

			LOGGER.error(e);
		} catch (SQLException e) {

			LOGGER.error(e);
		}
	}
	public static UserService getUserService() {
		if (userServiceImpl == null) {
			userServiceImpl = new UserServiceImpl();
		}
		return userServiceImpl;
		
	}
	

	@Override
	public User create(User t) {

		return userDao.create(t);
	}

	@Override
	public User read(Integer id) {

		return userDao.read(id);
	}

	@Override
	public User update(User t) {

		return userDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);

	}

	@Override
	public List<User> readAll() {

		return userDao.readAll();
	}
	@Override
	public User getUserByEmail(String user_email) {
		
		return userDao.getUserByEmail(user_email);
	}

}
