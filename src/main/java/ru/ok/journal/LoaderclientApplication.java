package ru.ok.journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.ok.journal.artificial.IArtificialLoader;

@SpringBootApplication
public class LoaderclientApplication {

    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(LoaderclientApplication.class, args);
        IArtificialLoader loader = app.getBean(IArtificialLoader.class);

        System.out.println("=== Client Side ===");
        loader.startLoader();
        loader.stopLoader();
//        loader.createPost();

    }

}
