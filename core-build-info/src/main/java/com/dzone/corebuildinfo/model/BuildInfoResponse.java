package com.dzone.corebuildinfo.model;

import java.time.Instant;

public class BuildInfoResponse {
    private String name;
    private String version;
    private Instant time;
    private String artifact;
    private String group;
    private String[] activeProfile;
    private String springVersion;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getArtifact() {
        return artifact;
    }

    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String[] getActiveProfile() {
        return activeProfile;
    }

    public void setActiveProfile(String[] activeProfile) {
        this.activeProfile = activeProfile;
    }

    public String getSpringVersion() {
        return springVersion;
    }

    public void setSpringVersion(String springVersion) {
        this.springVersion = springVersion;
    }
}
