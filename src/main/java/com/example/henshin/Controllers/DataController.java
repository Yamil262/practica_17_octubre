package com.example.henshin.Controllers;

import com.example.henshin.Entities.Data;
import com.example.henshin.Repositories.DataRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController extends BaseCrudController<Data, Long> {

    public DataController(DataRepository repository) {
        super(repository);
    }
}
