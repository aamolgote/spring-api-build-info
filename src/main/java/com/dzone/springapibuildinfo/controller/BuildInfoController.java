package com.dzone.springapibuildinfo.controller;

import com.dzone.springapibuildinfo.model.BuildInfoResponse;
import com.dzone.springapibuildinfo.service.BuildInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/${build-info.path}")
public class BuildInfoController {

    @Autowired
    BuildInfoService buildInfoService;

    @GetMapping("/build-info")
    public BuildInfoResponse getBuildInfo() {
        return this.buildInfoService.getBuildInfo();
    }
}
