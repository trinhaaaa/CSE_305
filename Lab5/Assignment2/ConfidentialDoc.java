package Assignment2;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ConfidentialDoc extends DocumentBuilder {

    private static SecretKey generateKey() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        return keyGen.generateKey();
    }

    private static byte[] encrypt(String plainText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(plainText.getBytes());
    }

    @Override
    public void buildFileName(String name) {
        document.setFileName(name + ".zip");
    }

    @Override
    public void buildContent(String content) {
        document.setContent(content);
    }

    @Override
    public void saveFile() throws Exception {
        SecretKey key = generateKey();
        byte[] encryptedContent = encrypt(document.getContent(), key);

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(document.getFileName()))) {
            zos.putNextEntry(new ZipEntry("content.enc"));
            zos.write(encryptedContent);
            zos.closeEntry();
        }
        System.out.println("Confidential document saved as: " + document.getFileName());
    }
}
