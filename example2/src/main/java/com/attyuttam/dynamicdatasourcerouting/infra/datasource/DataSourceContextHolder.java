package com.attyuttam.dynamicdatasourcerouting.infra.datasource;

public class DataSourceContextHolder {
    private static ThreadLocal<DataSourceEnum> threadLocal = new ThreadLocal<>();

	public static void setBranchContext(DataSourceEnum dataSourceEnum) {
		threadLocal.set(dataSourceEnum);
	}

	public static DataSourceEnum getBranchContext() {
		return threadLocal.get();
	}

	public static void clearBranchContext() {
		threadLocal.remove();
	}
}
