import domain.User;
import impl.UserSeviceImpl;
import service.UserService;

public class mainTest {

	public static void main(String[] args) {
		UserService userService = new UserSeviceImpl();
//		userService.create(new User("Vasyl", "Virastiuk", "virastiuk1@gmail.com", "1111", "USER"));
//		userService.create(new User("Vasyl", "Virastiuk", "virastiuk2@gmail.com", "1111", "USER"));
//		userService.create(new User("Vasyl", "Virastiuk", "virastiuk3@gmail.com", "1111", "USER"));
		userService.delete(2);
		
		System.out.println(userService.readAll());
	}

}
