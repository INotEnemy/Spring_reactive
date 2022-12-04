package com.woland.testex.repository;

import com.woland.testex.data.pojo.SkExampleTable;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DbRepository extends CrudRepository<SkExampleTable, Integer> {
}
