
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NewsletterWriter {
    public static void createNewsLetter(StringBuilder html) {
        // Your HTML content
        StringBuilder htmlContent = new StringBuilder();
        htmlContent.append("<html>");
        htmlContent.append("<head><title>Newsletter</title></head>");
        htmlContent.append("<body>");
        htmlContent.append("<h1>Monthly Automation Newsletter</h1>");
        htmlContent.append("<p>This is a test newsletter generated using Java.</p>");
        htmlContent.append("</body>");
        htmlContent.append("</html>");

        // File path
        String filePath = "C:/Users/anupa/Downloads/newsletter.html";

        // Create directories if they do not exist
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        // Write to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(html.toString());
            System.out.println("Newsletter HTML written successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing the file: " + e.getMessage());
        }
    }
}

