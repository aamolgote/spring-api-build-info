package com.dzone.corebuildinfo.service;

import com.dzone.corebuildinfo.model.BuildInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Service;

@Service
public class BuildInfoService {

    @Autowired
    BuildProperties buildProperties;

    public BuildInfoResponse getBuildInfo(){
        BuildInfoResponse buildInfoResponse = new BuildInfoResponse();
        buildInfoResponse.setName(this.buildProperties.getName());
        buildInfoResponse.setVersion(this.buildProperties.getVersion());
        return buildInfoResponse;
    }
}