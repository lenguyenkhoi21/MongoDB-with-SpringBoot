package com.nguyenkhoi.mongoddd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.nguyenkhoi.mongoddd.repo")
public class MngdbCfg {

}
