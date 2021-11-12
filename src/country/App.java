package country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
@SuppressWarnings("all")
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/beans/country-context.xml");
		while (true) {
			System.out.print("Choisir une langue : ");
			Scanner inputFromConsole = new Scanner(System.in);
			String language = inputFromConsole.next();
			
			String beanId;
			if ("fr".equals(language)) {
				beanId = "frenchWelcomeService";
			} else if ("en".equals(language)) {
				beanId = "englishWelcomeService";
			} else {
				break; // exit the program
			}
			
			CountryService bean = applicationContext.getBean(beanId, CountryService.class);
			String welcome = bean.welcome();
			System.out.println(welcome);
			
		}
	}
}
