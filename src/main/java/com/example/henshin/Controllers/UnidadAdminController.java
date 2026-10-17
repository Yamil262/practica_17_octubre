package com.example.henshin.Controllers;

import com.example.henshin.Entities.UnidadAdmin;
import com.example.henshin.Repositories.UnidadAdminRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unidadadmin")
public class UnidadAdminController extends BaseCrudController<UnidadAdmin, Long> {

    public UnidadAdminController(UnidadAdminRepository repository) {
        super(repository);
    }
}
