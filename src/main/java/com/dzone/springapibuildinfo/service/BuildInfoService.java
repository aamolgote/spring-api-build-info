package com.dzone.springapibuildinfo.service;

import com.dzone.springapibuildinfo.model.BuildInfoResponse;
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
