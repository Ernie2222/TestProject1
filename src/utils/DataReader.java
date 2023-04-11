package utils;

import java.io.File;
import java.io.FileInputStream;

public class DataReader {
	private static Properties property;
	
	static {
		try {
			File file = new File("./src/resources/testdata.properties");
			FileInputStream input = new FileInputStream(file);
			property = new Properties();
			property.(load)
		}
		
		
		
	}
	

}
