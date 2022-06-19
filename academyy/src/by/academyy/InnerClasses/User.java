package by.academyy.InnerClasses;

//Создать класс User, содержащий private переменные login, password.
//Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение 
//о том что пользователь с таким то логином и паролем отправил запрос.
//Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
//Переписать предыдущее задание, используя локальный класс.

public class User implements Printable {
	private String login;
	private String password;
	

	public User() {
		super();
	}

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	// внутренний класс
	public class Query {
		public void printToLog() {
			System.out.println("user " + User.this.login + " password:" + User.this.password + " sent query");
		}
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	// локальный класс
//  public void createQuery() {
//      class Query {
//          public void printToLog() {
//              System.out.println("user " + User.this.login + " password:" + User.this.password + " sent query");
//          }
//      }
//      Query query = new Query();
//      query.printToLog();
//  }

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

}
