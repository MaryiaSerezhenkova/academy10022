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
    for (int i = 0; i < symb.length / 2 + (symb.length % 2 == 1 ? 1 : 0); i++) {
        symb2[y++] = symb[i];
        symb2[y++] = symb[symb.length - i - 1];
    }
    symb2[symb2.length - 1] = '#';
    System.out.println(new String(symb2));

    char[] word = new char[symb2.length - 1];
    int x=0;
    for (int i = 0; i < symb2.length-1 ; i=i+2) {    
        word[x++]=symb2[i];
//        for (int j = 1; j < symb2.length-(symb2.length % 2 == 1 ? 0 : 1) ; j=j+2) {    
//         word[x++] = symb2[word.length-j];
//        }доделать вторую половину слова!!!
    }
    
    System.out.println(new String(word));
    
}
}
//Aabrrbaacda#
