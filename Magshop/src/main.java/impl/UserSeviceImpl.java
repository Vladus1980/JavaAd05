package impl;

import java.sql.SQLException;
import java.util.List;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import domain.User;
import service.UserService;

public class UserSeviceImpl implements UserService {

	private UserDao userDao;

	public UserSeviceImpl() {
		try {
			userDao = new UserDaoImpl();
		} catch (InstantiationException e) {

			e.printStackTrace();
		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}
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

}
