package com.example.henshin.Controllers;

import com.example.henshin.Entities.Reval;
import com.example.henshin.Repositories.RevalRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reval")
public class RevalController extends BaseCrudController<Reval, Long> {

    public RevalController(RevalRepository repository) {
        super(repository);
    }
}
