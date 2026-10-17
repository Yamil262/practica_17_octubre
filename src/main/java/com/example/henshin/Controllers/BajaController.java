package com.example.henshin.Controllers;

import com.example.henshin.Entities.Baja;
import com.example.henshin.Repositories.BajaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/baja")
public class BajaController extends BaseCrudController<Baja, Long> {

    public BajaController(BajaRepository repository) {
        super(repository);
    }
}
