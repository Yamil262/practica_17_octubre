package com.example.henshin.Controllers;

import com.example.henshin.Entities.OrganismoFin;
import com.example.henshin.Repositories.OrganismoFinRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/organismo-fin")
public class OrganismoFinController extends BaseCrudController<OrganismoFin, Long> {

    public OrganismoFinController(OrganismoFinRepository repository) {
        super(repository);
    }
}
