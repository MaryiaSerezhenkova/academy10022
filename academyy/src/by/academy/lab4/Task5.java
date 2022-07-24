package by.academy.lab4;
//Программа обработки текста, который может быть получен как с консоли, так и с файла.
//Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
 
public class Task5 {
 
    public static void main(String[] args) {
        String text = "PAram pam amp pam abnbnb";
        System.out.println(removeWord(text, 3));
    }
 
    public static String removeWord (String text, int n) {
        StringBuilder sb = new StringBuilder();
        String words[] = text.split(" ");
        for (int i=0; i<words.length; i++) {
            if (!isSkip(words[i], n)) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString();
        
    }
    
    public static boolean isSkip(String word, int n) {
    	return word.length()==n && !isVowel((char)Character.toLowerCase(word.charAt(0)));
    }
    public static boolean isVowel(Character c) {
        switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'y':
        case 'а':
        case 'е':
        case 'ё':
        case 'и':
        case 'о':
        case 'у':
        case 'ы':
        case 'э':
        case 'ю':
        case 'я':
            return true;
        default:
            return false;
 
        }
    }
}
 
 