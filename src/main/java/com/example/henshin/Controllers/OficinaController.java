package com.example.henshin.Controllers;

import com.example.henshin.Entities.Oficina;
import com.example.henshin.Repositories.OficinaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/oficina")
public class OficinaController extends BaseCrudController<Oficina, Long> {

    public OficinaController(OficinaRepository repository) {
        super(repository);
    }
}
