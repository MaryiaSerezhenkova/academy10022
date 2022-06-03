package by.academyy.RegEx;
//Напишите два цикла выполняющих многократное сложение строк, один

//с помощью оператора сложения и String, а другой с помощью StringBuilder
//и метода append. Сравните скорость их выполнения.

public class Task4 {
	public static void main(String[] args) {
		String text = "Hey There! How Are you doing.";
		String[] textArray = new String[10000];
		String text2 = text;
		StringBuilder newText = new StringBuilder();
		long startBuilder = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			newText.append(text);
			newText.append(" ");
		}
		long endBuilder = System.currentTimeMillis();
		System.out.println("Processing time StringBuilder " + (endBuilder - startBuilder) + " ms");

		long startConcat = System.currentTimeMillis();
		textArray[0] = "Hey There! How Are you doing.";
		for (int i = 1; i < textArray.length; i++) {
			textArray[i] = text.concat(text2);
			text2 = textArray[i];
		}
		long endConcat = System.currentTimeMillis();

		// System.out.println(text2);
		System.out.println("Processing time methodConcat " + (endConcat - startConcat) + " ms");

	}
}
