package pl.damian.bookshop.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.damian.bookshop")
public class BookShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(BookShopApplication.class);
    }
}
