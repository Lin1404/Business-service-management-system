package com.bsms.Businessservicemanagementsystem.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(ItemRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Item(1, "Calvin", "Chips", 3)));
      log.info("Preloading " + repository.save(new Item(2, "Ada", "Cola", 2)));
      log.info("Preloading " + repository.save(new Item(3, "Ben", "Ice Cream", 4)));
    };
  }
}