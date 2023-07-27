package com.dzone.corebuildinfo.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dzone.corebuildinfo.service.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/app-name/example")
public class ExampleController {

    @Autowired
    BuildInfoService buildInfoService;

    @GetMapping("/employee/names")
    public List<String> getEmployeeNames() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Aamol");
        list.add("John");
        return list;
    }
}
