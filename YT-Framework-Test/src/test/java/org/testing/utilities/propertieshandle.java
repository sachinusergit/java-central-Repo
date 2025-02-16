package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertieshandle {

				public static Properties loadPropertiesFile(String Filepath) throws IOException {
					
					File f = new File(Filepath);
					FileReader fr = new FileReader(f);
					Properties p = new Properties();
					p.load(fr);
					return p;
					
					
				}
				
			
				public static String fetchLocatorValue(String key) throws IOException {
					FileInputStream file = new FileInputStream("../YT-Framework-Test/Object.properties");
					Properties prop = new Properties();
					prop.load(file);
					return prop.get(key).toString();
					
					
					
				}
				
				
				
				
				
			}

