package country.app;

import country.service.IServiceWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SuppressWarnings("all")
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext("country");
		IServiceWorker serviceWorker = applicationContext.getBean(IServiceWorker.class);
		while (true) {
			System.out.print("Choisir une langue : ");
			Scanner inputFromConsole = new Scanner(System.in);
			String language = inputFromConsole.next();
			serviceWorker.dealWithCountryByCode(language);
			
		}
	}
	
}
