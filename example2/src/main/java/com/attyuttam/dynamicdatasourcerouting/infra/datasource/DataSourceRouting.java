package com.attyuttam.dynamicdatasourcerouting.infra.datasource;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceRouting extends AbstractRoutingDataSource{
    @Override
	protected Object determineCurrentLookupKey() {
		return DataSourceContextHolder.getBranchContext();
	}

	public void initDatasource(DataSource dataSourceOneDataSource,
			DataSource dataSourceTwoDataSource) {
		Map<Object, Object> dataSourceMap = new HashMap<>();
		dataSourceMap.put(DataSourceEnum.DATASOURCE_ONE, dataSourceOneDataSource);
		dataSourceMap.put(DataSourceEnum.DATASOURCE_TWO, dataSourceTwoDataSource);
		this.setTargetDataSources(dataSourceMap);
		this.setDefaultTargetDataSource(dataSourceOneDataSource);
	}
}
