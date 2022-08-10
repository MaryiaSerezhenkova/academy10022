package by.academy.patterns;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {

	public static void main(String[] args) {
		List<Command> commands = new ArrayList<>();
		commands.add(new AddUser());
		commands.add(new RemoveUser());
		commands.add(new AddUser());
		commands.add(new RemoveUser());

		for (Command c : commands) {
			c.execute();
		}
	}

}
