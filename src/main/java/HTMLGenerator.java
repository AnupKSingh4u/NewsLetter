import java.util.ArrayList;
import java.util.List;

public class HTMLGenerator {


	
	public static void main(String[] args) {
	
		try {
	TrendingTopic	trendingTopic = new TrendingTopic();
	NewFeature newFeature= new NewFeature();
	//MonthlyHighlight highlights = new MonthlyHighlight();	
	List<UpcomingEvent> events = new ArrayList<UpcomingEvent>();
	
	String Des1="TestUDoFramework 3 Days Training for Automation testers";
	UpcomingEvent event1 = new UpcomingEvent("Framework Training", "15-June-2025", Des1);
	
	String Des2="AppliTools 3 Days Training for Automation testers on visual testing";
	UpcomingEvent event2 = new UpcomingEvent("AppliTools Training", "15-June-2025", Des2);
	
	events.add(event1);
	events.add(event2);
	
	List<String> highlights=new ArrayList<String>();
	highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");
	highlights.add("Cross-Browser and Cross-Device Testing – Validates application appearance across various browsers, devices, and screen resolutions.");
	highlights.add("Ultrafast Grid – Executes tests in parallel on multiple browser and device combinations, significantly speeding up visual test runs.");
	highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");
	highlights.add("Visual AI Engine – Uses AI to detect meaningful visual differences, simulating human eyes to reduce false positives.");
	
	StringBuilder html = new StringBuilder();
	html.append("<html><body style='font-family:Arial;'>");

	html.append("<h2>Trending Topic</h2>");
	html.append("<h3>").append(trendingTopic.title).append("</h3>");
	html.append("<p>").append(trendingTopic.content).append("</p>");

	html.append("<h2>New Feature</h2>");
	html.append("<h3>").append(newFeature.title).append("</h3>");
	html.append("<p>").append(newFeature.description).append("</p>");

	html.append("<h2>Upcoming Events</h2><ul>");
	for (UpcomingEvent e : events) {
	    html.append("<li><b>").append(e.eventName).append("</b> (")
	        .append(e.date).append(") - ").append(e.description).append("</li>");
	}
	html.append("</ul>");

	html.append("<h2>Automation Trends</h2>");
	html.append("<img src='cid:chart1' alt='Trend Chart' width='600' />");

	html.append("<h2>Highlights of the Month</h2><ul>");
	for (String point : highlights) {
	    html.append("<li>").append(point).append("</li>");
	}
	html.append("</ul>");

	html.append("</body></html>");
	
	NewsletterWriter.createNewsLetter(html);
		}
	catch(Exception ex) {
		ex.printStackTrace();
	}
		
		
	}
}
