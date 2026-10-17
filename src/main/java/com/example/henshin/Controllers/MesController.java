package com.example.henshin.Controllers;

import com.example.henshin.Entities.Mes;
import com.example.henshin.Repositories.MesRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mes")
public class MesController extends BaseCrudController<Mes, Long> {

    public MesController(MesRepository repository) {
        super(repository);
    }
}
