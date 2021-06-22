package com.attyuttam.dynamicdatasourcerouting.infra.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix="datasourcetwo.datasource")
@Getter
@Setter
public class DataSourceTwoConfig {
    private String url;
	private String password;
	private String username;
}
