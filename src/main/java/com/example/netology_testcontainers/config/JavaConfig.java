package com.example.netology_testcontainers.config;

import com.example.netology_testcontainers.profile.DevProfile;
import com.example.netology_testcontainers.profile.ProductionProfile;
import com.example.netology_testcontainers.profile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "dev", havingValue = "true", matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(prefix = "profile", name = "dev", havingValue = "false", matchIfMissing = true)
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}