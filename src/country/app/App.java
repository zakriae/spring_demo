package country.app;

import country.service.IServiceWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Scanner;

@SuppressWarnings("all")
public class App {
	public static void main(String[] args) throws SQLException {
        
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("beans/*.xml");
		IServiceWorker serviceWorker = applicationContext.getBean(IServiceWorker.class);
		
		org.h2.tools.Server.createWebServer().start();
		
		
		
		
		
		
		while (true) {
			
			System.out.print("*******************************");
			System.out.print(" \n 0 : exit \n 1 : add country \n 2 :  get country data \n 3 : delete coutry \n 4 : update country \n 5 : get countries. \n" );
			System.out.print("******************************* \n");
			
			System.out.print("Enter a code from 0 to 5 : ");
			Scanner inputFromConsole1 = new Scanner(System.in);
			int code = Integer.parseInt(inputFromConsole1.next());
			
			switch (code) {
			
			case 0: {
				System.exit(0);
			}
			case 1: {
				
				System.out.print("Enter the language : ");
				Scanner inputFromConsole = new Scanner(System.in);
				String language = inputFromConsole.next();
				serviceWorker.addNewCountry(language);
				break;
			}
			
			default:{
				
				break;
			}
				
			}
			
			
			
		}
	}
	
}
