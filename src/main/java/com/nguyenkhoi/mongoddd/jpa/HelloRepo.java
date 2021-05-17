package com.nguyenkhoi.mongoddd.jpa;

import com.nguyenkhoi.mongoddd.document.Hello;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloRepo extends JpaRepository<Hello, Integer> {

}
