package com.example.henshin.Controllers;

import com.example.henshin.Entities.Trasfe;
import com.example.henshin.Repositories.TrasfeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trasfe")
public class TrasfeController extends BaseCrudController<Trasfe, Long> {

    public TrasfeController(TrasfeRepository repository) {
        super(repository);
    }
}
