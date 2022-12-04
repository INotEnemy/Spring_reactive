package com.woland.testex.controller.rest;


import com.woland.testex.data.pojo.SkExampleTable;
import com.woland.testex.dto.OutputDto;
import com.woland.testex.dto.InputDto;
import com.woland.testex.repository.DbRepository;
import com.woland.testex.service.IncrementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class HomeController {

    @Autowired
    private IncrementService incService;

    @Autowired
    private DbRepository repository;

    @RequestMapping(value = "/modify", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OutputDto> modify (@RequestBody InputDto dto) {
        OutputDto out = new OutputDto(incService.add(dto.getId(), dto.getAdd()));
        return new ResponseEntity<>(out, HttpStatus.OK);
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity<SkExampleTable> get(@PathVariable Integer id) {
        return new ResponseEntity<>(repository.findById(id).get(), HttpStatus.FOUND);
    }

}
