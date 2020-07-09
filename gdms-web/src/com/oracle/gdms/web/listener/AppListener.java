package com.oracle.gdms.web.listener;

import java.net.URL;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.PropertyConfigurator;

public class AppListener implements ServletContextListener {
  
    public void contextDestroyed(ServletContextEvent arg0)  { 
    }

	
    public void contextInitialized(ServletContextEvent arg0)  { 
    	
    	URL url = AppListener.class.getClassLoader().getResource("config/log4j.properties");
		// �ҵ�log4j���ģ����߿��
    	PropertyConfigurator.configure(url);
    }
	
}
