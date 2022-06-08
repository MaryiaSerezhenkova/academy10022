package by.academyy.Strings;
//Секретное агентство «Super-Secret-no» решило для шифрования переписки своих

//сотрудников использовать «метод бутерброда». Сначала буквы слова нумеруются в таком
//порядке: первая буква получает номер 1, последняя буква - номер 2, вторая – номер 3,
//предпоследняя – номер 4, потом третья … и так для всех букв (см. рисунок). Затем все 
//
//буквы записываются в шифр в порядке своих номеров. В конец зашифрованного слова
//добавляется знак «диез» (#), который нельзя использовать в сообщениях.

public class Secret {

	public static void main(String[] args) {
		String str = "Abracadabra";
		char[] symb = str.toCharArray();
		char[] symb2 = new char[symb.length + 1];
		int y = 0;
		for (int i = 0; i < symb.length / 2 + 1; i++) {
			symb2[y++] = symb[i];
			if (i != symb.length / 2) {
				symb2[y++] = symb[symb.length - i - 1];
			}
		}
	symb2[symb2.length-1]='#';
		System.out.println(new String(symb2));
	}

}
//Aabrrbaacda#