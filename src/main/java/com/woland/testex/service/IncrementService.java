package com.woland.testex.service;

import com.woland.testex.data.pojo.SkExampleTable;
import com.woland.testex.repository.DbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IncrementService {

    @Autowired
    private DbRepository repository;

    public Integer add(Integer id ,Integer num) {
        Optional<SkExampleTable> table = repository.findById(id);
        if (table.isPresent()) {
            table.get().getObj().addToCurr(num);
            repository.save(table.get());
        }
        return table.get().getObj().getCurrent();
    }
}
