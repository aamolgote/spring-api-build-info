package com.dzone.corebuildinfo.service;

import com.dzone.corebuildinfo.model.BuildInfoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BuildInfoService {

    @Autowired
    BuildProperties buildProperties;

    @Autowired
    Environment environment;

    public BuildInfoResponse getBuildInfo(){
        BuildInfoResponse buildInfoResponse = new BuildInfoResponse();
        buildInfoResponse.setName(this.buildProperties.getName());
        buildInfoResponse.setVersion(this.buildProperties.getVersion());
        buildInfoResponse.setTime(this.buildProperties.getTime());
        buildInfoResponse.setActiveProfile(this.environment.getActiveProfiles());
        buildInfoResponse.setSpringVersion(this.buildProperties.getVersion());
        buildInfoResponse.setGroup(this.buildProperties.getGroup());
        buildInfoResponse.setArtifact(this.buildProperties.getArtifact());
        return buildInfoResponse;
    }
}