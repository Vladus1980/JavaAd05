package dao;

import domain.User;
import shared.AbstractCrud;

public interface UserDao extends AbstractCrud<User>{
	User getUserByEmail(String user_email);
}
