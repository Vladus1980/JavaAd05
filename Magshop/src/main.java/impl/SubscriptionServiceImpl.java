package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.SubscriptionDao;
import daoImpl.SubscriptionDaoImpl;
import domain.Subscription;
import service.SubsriptionService;
import service.UserService;

public class SubscriptionServiceImpl implements SubsriptionService{
	
	private SubscriptionDao subscriptionDao;
	
	private static Logger LOGGER = Logger.getLogger(SubscriptionServiceImpl.class);
	
	private static SubscriptionServiceImpl subscriptionServiceImpl;
	
	private SubscriptionServiceImpl() {
		try {
			subscriptionDao = new SubscriptionDaoImpl();
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
	
	public static SubsriptionService getSubscriptionService() {
		if (subscriptionServiceImpl == null) {
			subscriptionServiceImpl = new SubscriptionServiceImpl();
		}
		return subscriptionServiceImpl;
	}

	@Override
	public Subscription create(Subscription t) {
		
		return subscriptionDao.create(t);
	}

	@Override
	public Subscription read(Integer id) {

		return subscriptionDao.read(id);
	}

	@Override
	public Subscription update(Subscription t) {

		return subscriptionDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		subscriptionDao.delete(id);

		
	}

	@Override
	public List<Subscription> readAll() {

		return subscriptionDao.readAll();
	}
	
	

}
