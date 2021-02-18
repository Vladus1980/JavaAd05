package impl;

import java.sql.SQLException;
import java.util.List;

import dao.MagazineDao;
import daoImpl.MagazineDaoImpl;
import domain.Magazine;
import service.MagazineService;

public class MagazineServiceImpl implements MagazineService{
	
	private MagazineDao magazineDao;
	
	public MagazineServiceImpl() {
	
		try {
			magazineDao = new MagazineDaoImpl();
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
