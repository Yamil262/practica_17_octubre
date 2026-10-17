package com.example.henshin.Controllers;

import com.example.henshin.Entities.Actual;
import com.example.henshin.Repositories.ActualRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/actual")
public class ActualController extends BaseCrudController<Actual, Long> {

    public ActualController(ActualRepository repository) {
        super(repository);
    }
}
