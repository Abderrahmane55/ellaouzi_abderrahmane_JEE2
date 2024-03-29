package ma.emsi.customerfrontthymleafapp;

import ma.emsi.customerfrontthymleafapp.entities.Customer;
import ma.emsi.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Youssef").email("Youssef@gmail.com").build());
            customerRepository.save(Customer.builder().name("Abderahmane").email("Abderahmane@gmail.com").build());
            customerRepository.save(Customer.builder().name("Amine").email("Amine@gmail.com").build());
        };
    }
}
