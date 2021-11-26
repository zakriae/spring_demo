package country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SuppressWarnings("all")
public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
			new AnnotationConfigApplicationContext(App.class.getPackage().getName());
		
		// ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/country-context.xml");
		
		while (true) {
			System.out.print("Choisir une langue : ");
			Scanner inputFromConsole = new Scanner(System.in);
			String language = inputFromConsole.next();
			ICountryService country;
			String beanId;
			if ("fr".equals(language)) {
				beanId = "frenchCountryService";
			}  else if ("es".equals(language)) {
				beanId = "spainCountryService";
			}  else if ("gb".equals(language)) {
				beanId = "englandCountryService";
			}else {
				break;
			}
			
			country = applicationContext.getBean(beanId, ICountryService.class);
			String welcome = country.welcome();
			System.out.println(welcome);
			
		}
	}
}
