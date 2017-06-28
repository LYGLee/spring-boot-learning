package com.boot.config;

/**
 * Created by wl on 2017/6/21.
 */
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "D://uploadDir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
