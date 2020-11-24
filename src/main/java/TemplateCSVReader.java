import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemplateCSVReader {

    private final String JACOCO = "src/main/resources/jacoco.csv";
    private final String EMAIL = "src/main/resources/email.csv";

    public String[] getCSVHeader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(JACOCO))) {
            return reader.readLine().split(",");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String[] getCSVHeader(BufferedReader reader) {
        try {
            return reader.readLine().split(",");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        TemplateCSVReader reader = new TemplateCSVReader();
        for (String header : reader.getCSVHeader()) {
            System.out.println(header);
        }
    }

}
