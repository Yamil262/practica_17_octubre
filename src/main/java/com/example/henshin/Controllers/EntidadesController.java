package com.example.henshin.Controllers;

import com.example.henshin.Entities.Entidades;
import com.example.henshin.Repositories.EntidadesRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entidades")
public class EntidadesController extends BaseCrudController<Entidades, Long> {

    public EntidadesController(EntidadesRepository repository) {
        super(repository);
    }
}
