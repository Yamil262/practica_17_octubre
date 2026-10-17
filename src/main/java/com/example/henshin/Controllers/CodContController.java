package com.example.henshin.Controllers;

import com.example.henshin.Entities.CodCont;
import com.example.henshin.Repositories.CodContRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/codcont")
public class CodContController extends BaseCrudController<CodCont, Long> {

    public CodContController(CodContRepository repository) {
        super(repository);
    }
}
