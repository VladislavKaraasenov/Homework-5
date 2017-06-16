package homework.five;

public class UserImpl extends AbstractUser {

	@Override
	public void login(String name) {
		System.out.println("User logs in...");
	}

	@Override
	public void password(String password) {
		System.out.println("User writes password...");
	}

}
