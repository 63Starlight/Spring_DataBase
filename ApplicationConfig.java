import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Конфигурация Spring с включением поддержки AOP
@Configuration
@ComponentScan(basePackageClasses = LoggingAspect.class)
@EnableAspectJAutoProxy
public class ApplicationConfig {
}