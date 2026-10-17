package com.example.henshin.Controllers;

import com.example.henshin.Entities.OrgUser;
import com.example.henshin.Repositories.OrgUserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orguser")
public class OrgUserController extends BaseCrudController<OrgUser, Long> {

    public OrgUserController(OrgUserRepository repository) {
        super(repository);
    }
}
