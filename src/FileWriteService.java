import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteService {
    public static void getWriteFile (String NameFile, String Text) {
        try (FileOutputStream FileOS = new FileOutputStream(BaseURL.URL+NameFile)){
          //  byte[] buffer = Text.getBytes();
            FileOS.write(Text.getBytes());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
    }


