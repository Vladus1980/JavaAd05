package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import dao.MagazineDao;
import domain.Magazine;
import domain.User;
import impl.UserServiceImpl;
import service.UserService;
import utils.ConnectionUtils;

public class MagazineDaoImpl implements MagazineDao{
	
	private static String CREATE = "insert into magazine(magazine_name, magazine_pages, magazine_price) value(?,?,?)";
	private static String READ_BY_ID = "select * from magazine where id = ?";
	private static String UPDATE_BY_ID = "update magazine set magazine_name =?, magazine_pages=?, magazine_price=? where id= ?";
	private static String DELETE_BY_ID = "delete from magazine where id = ?";
	private static String READ_ALL = "select * from magazine";
	
	private static Logger LOGGER = Logger.getLogger(MagazineDaoImpl.class);

	private Connection connection;
	private PreparedStatement preparedStatement;

	public MagazineDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.connection();

	}

	@Override
	public Magazine create(Magazine magazine) {
		try {
			preparedStatement = connection.prepareStatement(CREATE, preparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, magazine.getMagazine_name());
			preparedStatement.setInt(2, magazine.getMagazine_pages());
			preparedStatement.setDouble(3, magazine.getMagazine_price());
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			magazine.setId(rs.getInt(1));
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return magazine;
	}


	@Override
	public Magazine read(Integer id) {
		Magazine magazine = null;
		try {
			preparedStatement = connection.prepareStatement(READ_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			String magazine_name = resultSet.getString("magazine_name");
			Integer magazine_pages = resultSet.getInt("magazine_pages");
			Double magazine_price  = resultSet.getDouble("magazine_price");


			magazine = new Magazine(magazine_name, magazine_pages, magazine_price);
		} catch (SQLException e) {
			LOGGER.error(e);
		}

		return magazine;
	}

	@Override
	public Magazine update(Magazine magazine) {
		try {
			preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
			preparedStatement.setString(1, magazine.getMagazine_name());
			preparedStatement.setInt(2, magazine.getMagazine_pages());
			preparedStatement.setDouble(3, magazine.getMagazine_price());
			preparedStatement.setInt(4, magazine.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return magazine;
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
	public List<Magazine> readAll() {
		List<Magazine> listOfMagazine = new ArrayList<Magazine>();
		try {
			preparedStatement = connection.prepareStatement(READ_ALL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				String magazine_name = resultSet.getString("magazine_name");
				Integer magazine_pages = resultSet.getInt("magazine_pages");
				Double magazine_price = resultSet.getDouble("magazine_price");

				listOfMagazine.add(new Magazine(magazine_name, magazine_pages, magazine_price));
			}
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return listOfMagazine;
	}

}
