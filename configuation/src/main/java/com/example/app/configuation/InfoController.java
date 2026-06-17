package com.example.configuation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @Value("${build.id}")
    private String buildId;
    @Value("${build.version}")
    private String buildVersion;
    @Value("${build.name}")
    private String buildName;

    @GetMapping("*/build-info")
    public String getbuildInfo(){
        return "Build ID:"+buildId +",Version: "+buildVersion+",Name:"+buildName;
    }
}