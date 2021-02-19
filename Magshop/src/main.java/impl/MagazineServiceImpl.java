package impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import dao.MagazineDao;
import daoImpl.MagazineDaoImpl;

import domain.Magazine;
import service.MagazineService;

public class MagazineServiceImpl implements MagazineService{
	
	private MagazineDao magazineDao;
	
	private static Logger LOGGER = Logger.getLogger(MagazineServiceImpl.class);
	
	private static MagazineServiceImpl magazineServiceImpl;
	
	private MagazineServiceImpl() {
	
		try {
			magazineDao = new MagazineDaoImpl();
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
	
	public static MagazineService getMagazineService() {
		if (magazineServiceImpl == null) {
			magazineServiceImpl = new MagazineServiceImpl();
		}
		
		return magazineServiceImpl;
	}

	@Override
	public Magazine create(Magazine t) {
		
		return magazineDao.create(t);
	}

	@Override
	public Magazine read(Integer id) {
		
		return magazineDao.read(id);
	}

	@Override
	public Magazine update(Magazine t) {
		
		return magazineDao.update(t);
	}

	@Override
	public void delete(Integer id) {
		magazineDao.delete(id);
		
	}

	@Override
	public List<Magazine> readAll() {

		return magazineDao.readAll();
	}

}
