import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TwoParts {

    public static void main(String[] args) {
        TrendingTopic trendingTopic = new TrendingTopic();
        NewFeature newFeature = new NewFeature();
        List<UpcomingEvent> events = new ArrayList<>();

        events.add(new UpcomingEvent("Framework Training", "15-June-2025",
                "TestUDoFramework 3 Days Training for Automation testers"));
        events.add(new UpcomingEvent("AppliTools Training", "15-June-2025",
                "AppliTools 3 Days Training for Automation testers on visual testing"));

        List<String> highlights = new ArrayList<>();
        highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");
        highlights.add("Cross-Browser and Cross-Device Testing – Validates application appearance across various browsers, devices, and screen resolutions.");
        highlights.add("Ultrafast Grid – Executes tests in parallel on multiple browser and device combinations, significantly speeding up visual test runs.");
        highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");
        highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");

        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html><html><head>")
            .append("<meta charset='UTF-8'>")
            .append("<meta name='viewport' content='width=device-width, initial-scale=1.0'>")
            .append("<title>Newsletter</title>")
            .append("<style>")
            .append("body { font-family: Arial, sans-serif; margin:0; padding:0; background-color:#f4f4f4; }")
           // .append(".container { display: flex; flex-wrap: wrap; max-width: 1000px; margin: auto; background-color: #ffffff; padding: 20px; }")
            
            .append(".container {\r\n"
            		+ "    display: flex;\r\n"
            		+ "    flex-wrap: wrap;\r\n"
            		+ "    max-width: 1000px;\r\n"
            		+ "    margin: auto;\r\n"
            		+ "    background-color: #ffffff;\r\n"
            		+ "    padding: 20px;\r\n"
            		+ "    gap: 20px;\r\n"
            		+ "}")
            
           // .append(".column { width: 100%; box-sizing: border-box; padding: 10px; }")
            
            .append(".column {\r\n"
            		+ "    width: 100%;\r\n"
            		+ "    box-sizing: border-box;\r\n"
            		+ "    padding: 10px;\r\n"
            		+ "    display: flex;\r\n"
            		+ "    flex-direction: column;\r\n"
            		+ "    gap: 20px;\r\n"
            		+ "}")
        //    .append("@media (min-width: 800px) { .column { width: 50%; } }")
            
            .append("@media (min-width: 800px) {\r\n"
            		+ "    .column {\r\n"
            		+ "        width: 48%;\r\n"
            		+ "    }\r\n"
            		+ "}")
            .append(".section { border: 1px solid #ccc; margin-bottom: 20px; padding: 15px; border-radius: 5px; background-color: #ffffff; }")
            .append(".trending { background-color: #e6f7ff; }")
            .append(".feature { background-color: #fff3cd; }")
            .append(".events { background-color: #d4edda; }")
            .append(".trends { background-color: #f8d7da; }")
            .append(".highlights { background-color: #cce5ff; }")
            .append("h2 { margin-top: 0; }")
            .append("</style></head><body>")

            .append("<div style='text-align: center; padding: 20px 0;'><h1 style='color:#2c3e50;'>Monthly Automation Newsletter</h1></div>")

            .append("<div class='container'>")

            // Left Column
            .append("<div class='column'>")

            // Trending Topic
            .append("<div class='section trending'>")
            .append("<h2>Trending Topic</h2>")
            .append("<h3>").append(trendingTopic.title).append("</h3>")
            .append("<p>").append(trendingTopic.content).append("</p>")
            .append("</div>")

            // New Feature
            .append("<div class='section feature'>")
            .append("<h2>New Feature</h2>")
            .append("<h3>").append(newFeature.title).append("</h3>")
            .append("<p>").append(newFeature.description).append("</p>")
            .append("</div>")

            // Upcoming Events
            .append("<div class='section events'>")
            .append("<h2>Upcoming Events</h2>")
            .append("<ul>");
        for (UpcomingEvent e : events) {
            html.append("<li><strong>").append(e.eventName).append("</strong> (")
                .append(e.date).append(") - ").append(e.description).append("</li>");
        }
        html.append("</ul></div>") // end Upcoming Events
            .append("</div>") // end Left Column

            // Right Column
            .append("<div class='column'>")

            // Automation Trends
            .append("<div class='section trends'>")
            .append("<h2>Automation Trends</h2>")
            .append("<img src='C:/Users/anupa/OneDrive/Pictures/LineGraph.jpg' alt='Automation Trends Chart' style='width:100%; height:auto;'/>")
            .append("<img src='C:/Users/anupa/OneDrive/Pictures/BarGraph.jpg' alt='Automation Trends Chart' style='width:100%; height:auto;'/>")
            .append("</div>")

            // Highlights of the Month
            .append("<div class='section highlights'>")
            .append("<h2>Highlights of the Month</h2>")
            .append("<ul>");
        for (String point : highlights) {
            html.append("<li>").append(point).append("</li>");
        }
        html.append("</ul></div>") // end Highlights
            .append("</div>") // end Right Column

            .append("</div>") // end container
            .append("</body></html>");

        // Write HTML to file
        String filePath = "C:/Users/anupa/Downloads/newsletter.html";
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(html.toString());
            System.out.println("Newsletter HTML written successfully to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing the file: " + e.getMessage());
        }
    }
}
