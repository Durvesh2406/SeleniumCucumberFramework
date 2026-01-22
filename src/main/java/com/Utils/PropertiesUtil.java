package com.Utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

	public static Properties properties = new Properties();

	public static Properties loadApplicationProperties() {
		try {
			FileInputStream fis = new FileInputStream("application.properties");
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties;
	}

	public static Properties loadframewokProperties() {
		try {
			FileInputStream fis = new FileInputStream("framework.properties");
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties;
	}

	public static Properties loadUserProperties() {
		try {
			FileInputStream fis = new FileInputStream("user.properties");
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties;
	}
}
