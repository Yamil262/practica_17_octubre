package com.example.henshin.Controllers;

import com.example.henshin.Entities.ObjGasto;
import com.example.henshin.Repositories.ObjGastoRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/objgasto")
public class ObjGastoController extends BaseCrudController<ObjGasto, Long> {

    public ObjGastoController(ObjGastoRepository repository) {
        super(repository);
    }
}
