package com.example.henshin.Controllers;

import com.example.henshin.Entities.EstEnt;
import com.example.henshin.Repositories.EstEntRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/est-ent")
public class EstEntController extends BaseCrudController<EstEnt, Long> {

    public EstEntController(EstEntRepository repository) {
        super(repository);
    }
}
