package com.example.henshin.Controllers;

import com.example.henshin.Entities.Bajas;
import com.example.henshin.Repositories.BajasRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bajas")
public class BajasController extends BaseCrudController<Bajas, Long> {

    public BajasController(BajasRepository repository) {
        super(repository);
    }
}
