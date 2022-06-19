package by.academyy.InnerClasses;

//В методе main(): создать экземпляр класса User и вызвать метод createQuery(); создать экземпляр класса Query и вызвать метод printToLog()
//используя конструкцию user.new Query(); 
//создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();

public class UserDemo {
	public static void main(String[] args) {
		User user1 = new User("Kate", "sss222");
		User.Query query1 = user1.new Query();
		User.Query query2 = new User("Nick", "qwert").new Query();
		user1.createQuery();
		query1.printToLog();
		query2.printToLog();

		UserStatic user3 = new UserStatic("Bob", "321");
		user3.createQuery();
	}
}
