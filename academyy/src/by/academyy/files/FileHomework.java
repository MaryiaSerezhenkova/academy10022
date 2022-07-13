package by.academyy.files;
//1.Напишите программу на Java, чтобы проверить, имеет ли файл или каталог права на чтение и запись
 
//2.Напишите Java-программу для получения определенных файлов по расширениям из указанной папки.
//3.Напишите программу на Java, чтобы проверить, существует файл или каталог, указанный в pathname, или нет.
//4.Напишите программу на Java, чтобы проверить, является ли данный путь каталогом или файлом
 
import java.io.File;
 
public class FileHomework {
 
    public static void main(String[] args) throws Exception {
        File catalog = new File("src/by/academyy/Cycles");
        getFile(catalog, "java");
        readWriteFile(catalog);
        File catalog2 = new File("src/Arr");
        existsFile(catalog2);
        readWriteFile(catalog2);
        catalogOrFile(catalog);
        catalogOrFile(catalog2);
    }
 
    public static boolean readWriteFile(File f) {
        if (f.canRead() & f.canWrite() == true) {
            System.out.println("File is available for reading and writing");
            return true;
        }
        System.out.println("File is not available for reading and writing");
        return false;
 
    }
 
    public static boolean existsFile(File f) {
        if (f.exists() == true) {
            System.out.println("File exists");
            return true;
        }
        System.out.println("File doesn't exist");
        return false;
 
    }
 
    public static boolean catalogOrFile(File f) {
        if (f.isDirectory() == true) {
            System.out.println(f.getName() + " is directory");
            return true;
        } else if (f.isFile() == true) {
            System.out.println(f.getName() + " is file");
        } else
            System.out.println("File doesn't exists");
        return false;
 
    }
 
    public static void getFile(File dir, String ext) throws Exception {
        String [] fileName = dir.list();
        for (int i=0; i<fileName.length; i++) {
        if (fileName[i].endsWith(ext)) {
            System.out.println( fileName[i]);
        }
    
        else    System.out.println("File not found");
        }
        if (fileName==null) {
            throw new Exception("File doesn't exists");
        }
}
}