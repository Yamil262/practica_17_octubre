package com.example.henshin.Controllers;

import com.example.henshin.Entities.Estado;
import com.example.henshin.Repositories.EstadoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/estado")
public class EstadoController extends BaseCrudController<Estado, Long> {

    public EstadoController(EstadoRepository repository) {
        super(repository);
    }
}
