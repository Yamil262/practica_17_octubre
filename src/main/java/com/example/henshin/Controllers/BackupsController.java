package com.example.henshin.Controllers;

import com.example.henshin.Entities.Backups;
import com.example.henshin.Repositories.BackupsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/backups")
public class BackupsController extends BaseCrudController<Backups, Long> {

    public BackupsController(BackupsRepository repository) {
        super(repository);
    }
}
