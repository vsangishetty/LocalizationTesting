package configreader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;
	
	public Properties initLangProp(String Language) {
		prop = new Properties();
		
		try {
		switch (Language.toLowerCase()) {
		case "english":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.eng.properties");
			break;
		case "french":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.french.properties");
			break;
		case "russian":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.russian.properties");
			break;
		case "spanish":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.spanish.properties");
			break;
		case "arabic":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.arabic.properties");
			break;
		case "chinese":
			ip = new FileInputStream("D:\\JavaProjects\\LocalizationTesting\\resources\\lang.chinese.properties");
			break;
		default:
			System.out.println("No Language found");
			break;
		}
		prop.load(ip);
		}
		catch(Exception e) {
			System.out.println("");
		}
		
		return prop;
	}
	
}
