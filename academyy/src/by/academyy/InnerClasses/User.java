package by.academyy.InnerClasses;

//Создать класс User, содержащий private переменные login, password.
//Создать внутренний класс Query в классе User. Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение 
//о том что пользователь с таким то логином и паролем отправил запрос.
//Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().

public class User {
	private String login;
	private String password;

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	private class Query {
		void printToLog() {
			System.out.println("user "+User.this.login + " "+User.this.password + " sent request");
		}
	}

	public void createQuery() {
		Query query = new Query();
		query.printToLog();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String pssword) {
		this.password = password;
	}

}
