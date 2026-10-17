package com.example.henshin.Controllers;

import com.example.henshin.Entities.Auxiliar;
import com.example.henshin.Repositories.AuxiliarRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auxiliar")
public class AuxiliarController extends BaseCrudController<Auxiliar, Long> {

    public AuxiliarController(AuxiliarRepository repository) {
        super(repository);
    }
}
