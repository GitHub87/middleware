package middleware.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String...args) {
		System.out.print("Running application");
		SpringApplication.run(Application.class, args);
	}
	
	/*
	 * @Bean CommandLineRunner initFounder(FoundersRepo repo) { return args -> {
	 * Stream.of("sujoy", "shriya", "aisha").forEach(name -> { FounderModel model =
	 * new FounderModel(name, "https://bootdey.com/img/Content/avatar/avatar1.png",
	 * name); repo.save(model); }); }; }
	 * 
	 * @Bean CommandLineRunner initInvestors(InvestorsRepo repo) { int i = 1; return
	 * args -> { Stream.of("Tiger VC", "Chodon Capital and Holdings",
	 * "Khanki Investor").forEach(name -> { InvestorsEntity model = new
	 * InvestorsEntity(i, 1, name, name.trim()); repo.save(model); }); }; }
	 */

}
