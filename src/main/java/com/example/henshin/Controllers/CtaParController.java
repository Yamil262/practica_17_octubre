package com.example.henshin.Controllers;

import com.example.henshin.Entities.CtaPar;
import com.example.henshin.Repositories.CtaParRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cta-par")
public class CtaParController extends BaseCrudController<CtaPar, Long> {

    public CtaParController(CtaParRepository repository) {
        super(repository);
    }
}
