package com.example.henshin.Controllers;

import com.example.henshin.Entities.Reports;
import com.example.henshin.Repositories.ReportsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reports")
public class ReportsController extends BaseCrudController<Reports, Long> {

    public ReportsController(ReportsRepository repository) {
        super(repository);
    }
}
