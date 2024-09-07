import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld oneHW = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(oneHW.getMessage());

        HelloWorld twoHW = (HelloWorld) applicationContext.getBean("helloworld");
        Cat oneCat = (Cat) applicationContext.getBean("cat");
        Cat twoCat = (Cat) applicationContext.getBean("cat");

        System.out.println(oneHW == twoHW);
        System.out.println(oneCat == twoCat);
    }
}