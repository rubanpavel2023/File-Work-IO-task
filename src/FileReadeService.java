import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadeService {
    public static void fileRead(String NameFile) {
        try {
            FileInputStream FileIS = new FileInputStream(BaseURL.URL + NameFile + ".txt");
            BufferedInputStream bis = new BufferedInputStream(FileIS);
            //В этом коде BufferedInputStream оборачивает FileInputStream, добавляя буферизацию.
            int a;
            while ((a = bis.read()) != -1) {
                System.out.print((char) a);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



}
