package country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("all")
public class App {
	public static void main(String[] args) {
		//ApplicationContext applicationContext =
		//		new AnnotationConfigApplicationContext(App.class.getPackage().getName());
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans/country-context.xml");
		
		while (true) {
			//System.out.print("Choisir une langue : ");
			//Scanner inputFromConsole = new Scanner(System.in);
			String language = "fr";//inputFromConsole.next();
			ICountryService country;
			if ("fr".equals(language)) {
				country = applicationContext.getBean("frenchCountryService", ICountryService.class);
			} else {
				break;
			}
			country = applicationContext.getBean(ICountryService.class);
			String welcome = country.welcome();
			System.out.println(welcome);
			
		}
	}
}
