package daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import dao.SubscriptionDao;
import domain.Subscription;
import domain.User;
import utils.ConnectionUtils;

public class SubscriptionDaoImpl implements SubscriptionDao{
	
	private static String CREATE = "insert into subscription(magazine_id, user_id, purchase_date) value(?,?,?)";
	private static String READ_BY_ID = "select * from subscription where id = ?";
	private static String UPDATE_BY_ID = "update subscription set magazine_id =?, user_id = ?, purchare_date=? where id= ?";
	private static String DELETE_BY_ID = "delete from subscription where id = ?";
	private static String READ_ALL = "select * from subscription";
	
	private static Logger LOGGER = Logger.getLogger(SubscriptionDaoImpl.class);

	private Connection connection;
	private PreparedStatement preparedStatement;

	public SubscriptionDaoImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		connection = ConnectionUtils.connection();

	}

	@Override
	public Subscription create(Subscription subscription) {
		try {
			preparedStatement = connection.prepareStatement(CREATE, preparedStatement.RETURN_GENERATED_KEYS);
			preparedStatement.setInt(1, subscription.getMagazine_id());
			preparedStatement.setInt(2, subscription.getUser_id());
			preparedStatement.setDate(3, new Date(subscription.getPurchasedate().getTime()));
			preparedStatement.executeUpdate();
			
			ResultSet rs = preparedStatement.getGeneratedKeys();
			subscription.setId(rs.getInt(1));
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return subscription;
	}

	@Override
	public Subscription read(Integer id) {
		Subscription subscription = null;
		try {
			preparedStatement = connection.prepareStatement(READ_BY_ID);
			preparedStatement.setInt(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			Integer magazine_id = resultSet.getInt("magazine_id");
			Integer user_id = resultSet.getInt("user_id");
			Date purchasedate = resultSet.getDate("purchase_date");


			subscription = new Subscription(magazine_id, user_id, purchasedate);

		} catch (SQLException e) {
			LOGGER.error(e);
		}

		return subscription;
	}

	@Override
	public Subscription update(Subscription subscription) {
		try {
			preparedStatement = connection.prepareStatement(UPDATE_BY_ID);
			preparedStatement.setInt(1, subscription.getMagazine_id());
			preparedStatement.setInt(2, subscription.getUser_id());
			preparedStatement.setDate(3, new Date(subscription.getPurchasedate().getTime()));
			preparedStatement.setInt(4, subscription.getId());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			LOGGER.error(e);
		}
		return subscription;
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
	public List<Subscription> readAll() {
		List<Subscription> listOfSubscription = new ArrayList<Subscription>();
		try {
			preparedStatement = connection.prepareStatement(READ_ALL);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Integer magazine_id = resultSet.getInt("magazine_id");
				Integer user_id = resultSet.getInt("user_id");
				Date purchasedate = resultSet.getDate("purchase_date");

				listOfSubscription.add(new Subscription(magazine_id, user_id, purchasedate));
			}
		} catch (SQLException e) {

			LOGGER.error(e);
		}

		return listOfSubscription;
	}

}
