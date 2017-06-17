package REST.REST.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import REST.REST.configuration.JpaConfiguration;

/**
 * Start class!
 *
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"REST.REST"})
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
