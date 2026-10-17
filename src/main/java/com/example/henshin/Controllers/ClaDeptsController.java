package com.example.henshin.Controllers;

import com.example.henshin.Entities.ClaDepts;
import com.example.henshin.Repositories.ClaDeptsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cla-depts")
public class ClaDeptsController extends BaseCrudController<ClaDepts, Long> {

    public ClaDeptsController(ClaDeptsRepository repository) {
        super(repository);
    }
}
