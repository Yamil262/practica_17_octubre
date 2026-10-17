package com.example.henshin.Controllers;

import com.example.henshin.Entities.Config;
import com.example.henshin.Repositories.ConfigRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/config")
public class ConfigController extends BaseCrudController<Config, Long> {

    public ConfigController(ConfigRepository repository) {
        super(repository);
    }
}
