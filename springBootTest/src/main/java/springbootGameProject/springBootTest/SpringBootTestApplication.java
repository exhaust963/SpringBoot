package springbootGameProject.springBootTest;

import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.enterprise.example.web.MyWebController;
import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.game.GameRunner;
import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.game.MarioGame;
import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.game.PacmanGame;
import springbootGameProject.springBootTest.com.springdemo.spring.springdemo.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTestApplication {

	 public static void main(String[] args) {
		    ConfigurableApplicationContext context = SpringApplication.run(
		    		SpringBootTestApplication.class,
		      args
		    );

		    //#region Game
		    GameRunner runner = context.getBean(GameRunner.class);
		    //MarioGame marioGame = new MarioGame();
		    //GameRunner Mariorunner = new GameRunner(marioGame);

		    runner.run();

		    //#endregion

		    MyWebController controller = context.getBean(MyWebController.class);
		    System.out.println(controller.returnValueFromBusinessService());
		  }

}
