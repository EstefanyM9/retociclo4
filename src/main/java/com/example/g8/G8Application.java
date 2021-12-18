package com.example.g8;

import com.example.g8.repositories.ClotheRepository;
import com.example.g8.repositories.OrderRepository;
import com.example.g8.repositories.UserRepository;
import com.example.g8.repositoriesCrud.ClotheCrudRepository;
import com.example.g8.repositoriesCrud.OrderCrudRepository;
import com.example.g8.repositoriesCrud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class G8Application implements CommandLineRunner {

    @Autowired	
    private ClotheCrudRepository clotheRepository;
    @Autowired	
    private UserCrudRepository userRepository;
    @Autowired	
    private OrderCrudRepository orderRepository;
                
    public static void main(String[] args) {
		SpringApplication.run(G8Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
      clotheRepository.deleteAll();
      userRepository.deleteAll();
      orderRepository.deleteAll();
    }

}
