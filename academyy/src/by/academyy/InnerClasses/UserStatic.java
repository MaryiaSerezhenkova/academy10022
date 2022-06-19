package by.academyy.InnerClasses;
//Переписать класс Query используя статический класс.

public class UserStatic {

	private static String login;
	private static String password;

	public UserStatic(String login, String password) {
		super();
		UserStatic.login = login;
		UserStatic.password = password;
	}

	public static class Query {
		public void printToLog() {
			System.out.println("user " + UserStatic.login + " password:" + UserStatic.password + " sent query");
		}
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

}
