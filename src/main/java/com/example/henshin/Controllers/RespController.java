package com.example.henshin.Controllers;

import com.example.henshin.Entities.Resp;
import com.example.henshin.Repositories.RespRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resp")
public class RespController extends BaseCrudController<Resp, Long> {

    public RespController(RespRepository repository) {
        super(repository);
    }
}
