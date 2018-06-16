package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

import pl.javastart.model.Gra;
import pl.javastart.model.User;
import pl.javastart.repository.*;




@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		List<User> user = new ArrayList<>();
		user.add(new User("Cemzar", "cem24@wp.pl", 1));
		user.add(new User("Krzys", "kr0812@wp.pl", 2));
		user.add(new User("Abar", "pies@wp.pl", 3));
		
		UserRepository userRep = ctx.getBean(UserRepository.class);
		user.forEach(userRep::save);//zapisujemy
		
		User drugiUs = userRep.findOne(2L);  //pobieramy
		userRep.delete(drugiUs);   //usuwamy go
		
		//pobieramy i wyświetlamy pozostałe
		userRep.findAll().forEach(System.out::println);
		
		Gra gra = new Gra(1, "Cemzarowo", 100);
		Gra gra2 = new Gra(2, "Krzysiowo", 200);
		
		GraRepository graRep = ctx.getBean(GraRepository.class);
		
		graRep.save(gra);
		graRep.save(gra2);
		
		graRep.findAll().forEach(System.out::println);
		
		int a = 10;
		
		gra2.setMana(a);
		graRep.save(gra2);
		
		System.out.println(graRep.findOne(2L));
		
		graRep.findByZloto(200).forEach(System.out::println);
		
		
		
		ctx.close();
		
	}
}
