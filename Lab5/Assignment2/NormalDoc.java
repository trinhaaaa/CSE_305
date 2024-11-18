package Assignment2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class NormalDoc extends DocumentBuilder {

    @Override
    public void buildFileName(String name) {
        document.setFileName(name + ".txt");
    }

    @Override
    public void buildContent(String content) {
        document.setContent(content);
    }

    @Override
    public void saveFile() throws Exception {
        Files.write(Paths.get(document.getFileName()), document.getContent().getBytes());
        System.out.println("Normal document saved as: " + document.getFileName());
    }
}
