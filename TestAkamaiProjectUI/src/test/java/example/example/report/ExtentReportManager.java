package example.example.report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import example.example.context.Constants;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class handles the report activities.
 *
 * @author Vchukhna
 */
public class ExtentReportManager {

	private static ExtentReports extentReports;

	private static Map<Long, ExtentTest> map = new HashMap<>();

	public static ExtentReports getExtentReports() {
		if (extentReports == null) {
			extentReports = new ExtentReports(Constants.REPORT_DIRECTORY);
			extentReports.assignProject(Constants.PROJECT_NAME);
			extentReports.loadConfig(new File(Constants.EXTENT_CONFIG_PATH));
		}
		return extentReports;
	}

	public synchronized static void startTest(String testName, String desc) {
		ExtentTest test = getExtentReports().startTest(testName, desc);
		map.put(Thread.currentThread().getId(), test);
	}

	public synchronized static ExtentTest getCurrentTest() {
		return map.get(Thread.currentThread().getId());
	}

	public synchronized static void endCurrentTest() {
		getExtentReports().endTest(getCurrentTest());
	}
}
