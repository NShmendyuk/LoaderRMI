package ru.ok.journal.artificial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import ru.ok.journal.artificial.IArtificialLoader;

@Configuration
public class RemoteConfig {
    @Bean
    public RmiProxyFactoryBean rmiProxy() {
        RmiProxyFactoryBean bean = new RmiProxyFactoryBean();
        bean.setServiceInterface(IArtificialLoader.class);
        bean.setServiceUrl("rmi://localhost:1099/artificial");

        return bean;
    }
}
