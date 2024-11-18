package Assignment2;

public abstract class DocumentBuilder {
    protected Document document;

    public Document getDocument() {
        return document;
    }

    public void createNewDocument() {
        document = new Document();
    }

    public abstract void buildFileName(String name);
    public abstract void buildContent(String content);
    public abstract void saveFile() throws Exception;
}
