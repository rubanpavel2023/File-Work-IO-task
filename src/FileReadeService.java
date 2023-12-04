import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadeService {
    public static void fileRead (String NameFile){
        try {
            FileInputStream FileIS = new FileInputStream(BaseURL.URL+NameFile);
            int a ;
            while ((a=FileIS.read())!= -1) {
                System.out.print((char) a);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
