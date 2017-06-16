package homework.five;

public class AdminUserImpl extends AbstractUser implements AdminUser {

	@Override
	public void login(String name) {
		System.out.println("Admin user logs in...");
	}

	@Override
	public void password(String password) {
		System.out.println("Admin user writes password...");
	}

	@Override
	public void removeUser(String name) {
		System.out.println("Admin user delete user!");
	}

	@Override
	public void addUser(String name) {
		System.out.println("Admin user adds user!");
	}

}
