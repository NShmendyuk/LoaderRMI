package ru.ok.journal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.ok.journal.artificial.IArtificialLoader;
import ru.ok.journal.artificial.service.LoaderService;


@SpringBootApplication
public class LoaderclientApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext app = SpringApplication.run(LoaderclientApplication.class, args);
        IArtificialLoader loader = app.getBean(IArtificialLoader.class);

        new LoaderService("LoaderService", loader, "start").start();
        new LoaderService("LoaderService", loader, "stop").start();
    }

}
