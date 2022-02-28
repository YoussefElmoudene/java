package com.YoussefELmoudene.java.controller;

import com.YoussefELmoudene.java.bean.Arch_1004901;
import com.YoussefELmoudene.java.service.ArchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/archive")
@CrossOrigin("http://localhost:4200")
public class ArchController {
    @Autowired
    private ArchService archService;

    @GetMapping("/")
    public List<Arch_1004901> findAll() {
        return archService.findAll();
    }

}
