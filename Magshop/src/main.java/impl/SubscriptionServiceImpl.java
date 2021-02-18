package impl;

import java.sql.SQLException;
import java.util.List;

import dao.SubscriptionDao;
import daoImpl.SubscriptionDaoImpl;
import domain.Subscription;
import service.SubsriptionService;

public class SubscriptionServiceImpl implements SubsriptionService{
	
	private SubscriptionDao subscriptionDao;
	
	public SubscriptionServiceImpl() {
		try {
			subscriptionDao = new SubscriptionDaoImpl();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
