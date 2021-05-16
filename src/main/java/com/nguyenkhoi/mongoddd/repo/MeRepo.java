package com.nguyenkhoi.mongoddd.repo;

import com.nguyenkhoi.mongoddd.document.Me;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MeRepo extends MongoRepository<Me, String> {
    List<Me> findByNameRegex(String name);

    List<Me> findByNameLike(String name);

    @Query(value = "{'name': {$regex : '?0', $options: 'i'}}")
    List<Me> findByNameInCases(String name);
}
