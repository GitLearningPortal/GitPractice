package Selenium.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class AppProps {
private String appDir;
	
	public Properties appProps;
	
	public AppProps() {
		InputStream is = null;
        try {
        	this.appProps = new Properties();
        	appDir = new File(AppProps.class
					.getProtectionDomain().getCodeSource().getLocation()
					.toURI()).getParent();
        	System.out.println("Path of property file is : "+appDir);
			is = new FileInputStream(new File(appDir + "/Props.properties"));
            appProps.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	public Properties getAppProps() {
		return appProps;
	}

	public void setAppProps(Properties appProps) {
		this.appProps = appProps;
	}

	public String getAppDir() {
		return appDir;
	}

	public void setAppDir(String appDir) {
		this.appDir = appDir;
	}
}
