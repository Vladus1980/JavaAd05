package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import dao.UserDao;
import domain.User;
import utils.ConnectionUtils;

public class UserDaoImpl implements UserDao {

	private static String CREATE = "insert into user(user_firstname, user_lastname, user_email, user_pass, user_level) value(?,?,?,?,?)";
	private static String READ_BY_ID = "select * from user where id = ?";
	private static String UPDATE_BY_ID = "update user set user_firstname =?, user_lastname=?, user_email=?, user_pass=? where id= ?";
	private static String DELETE_BY_ID = "delete from user where id = ?";
	private static String READ_ALL = "select * from user";
	private static String READ_BY_EMAIL = "select * from user where user_email =?";
	
	private static Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	private Connection connection;
	private PreparedStatement preparedStatement;

	public UserDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.connection();

	}

	@Override
	public User create(User user) {

		try {
			preparedStatement = connection.prepareStatement(CREATE, preparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getUser_firstname());
			preparedStatement.setString(2, user.getUser_lastname());
			preparedStatement.setString(3, user.getUser_email());
			preparedStatement.setString(4, user.getUser_pass());
			preparedStatement.setString(5, user.getUser_level());
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			rs.next();
			user.setId(rs.getInt(1));
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return user;
	}

	@Override
	public User read(Integer id) {
		User user = null;
		try {
			preparedStatement = connection.prepareStatement(READ_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			String user_firstname = resultSet.getString("user_firstname");
			String user_lastname = resultSet.getString("user_lastname");
			String user_email = resultSet.getString("user_email");
			String user_pass = resultSet.getString("user_pass");
			String user_level = resultSet.getString("user_level");

			user = new User(user_firstname, user_lastname, user_email, user_pass, user_level);

		} catch (SQLException e) {
			LOGGER.error(e);
		}

		return user;
	}

	@Override
	public User update(User user) {

		try {
			preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
			preparedStatement.setString(1, user.getUser_firstname());
			preparedStatement.setString(2, user.getUser_lastname());
			preparedStatement.setString(3, user.getUser_email());
			preparedStatement.setString(4, user.getUser_pass());
			preparedStatement.setString(5, user.getUser_level());
			preparedStatement.setInt(5, user.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return user;
	}

	@Override
	public void delete(Integer id) {
		try {
			preparedStatement = connection.prepareStatement(DELETE_BY_ID);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {

			LOGGER.error(e);
		}

	}

	@Override
	public List<User> readAll() {
		List<User> listOfUser = new ArrayList<User>();
		try {
			preparedStatement = connection.prepareStatement(READ_ALL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String user_firstname = resultSet.getString("user_firstname");
				String user_lastname = resultSet.getString("user_lastname");
				String user_email = resultSet.getString("user_email");
				String user_pass = resultSet.getString("user_pass");
				String user_level = resultSet.getString("user_level");
				listOfUser.add(new User(user_firstname, user_lastname, user_email, user_pass, user_level));
			}
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return listOfUser;
	}

	@Override
	public User getUserByEmail(String user_email) {
		User user = null;
		
		
		try {
			preparedStatement = connection.prepareStatement(READ_BY_EMAIL);
			preparedStatement.setString(1, user_email);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			Integer user_Id = resultSet.getInt("id");
			String user_firstname = resultSet.getString("user_firstname");
			String user_lastname = resultSet.getString("user_lastname");
			String user_pass = resultSet.getString("user_pass");
			String user_level = resultSet.getString("user_level");
			user = new User(user_Id, user_firstname, user_lastname, user_email, user_pass, user_level);
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return user;
	}

}
