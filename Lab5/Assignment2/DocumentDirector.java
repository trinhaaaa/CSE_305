package Assignment2;

public class DocumentDirector {
    private DocumentBuilder builder;

    public void setBuilder(DocumentBuilder builder) {
        this.builder = builder;
    }

    public Document construct(String name, String content) throws Exception {
        builder.createNewDocument();
        builder.buildFileName(name);
        builder.buildContent(content);
        builder.saveFile();
        return builder.getDocument();
    }
}
