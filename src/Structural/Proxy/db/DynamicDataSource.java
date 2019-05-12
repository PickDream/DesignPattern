package Structural.Proxy.db;

/**
 * Spring 分库的简单实现
 * */
public class DynamicDataSource {

    protected Object determineCurrentLookupKey(){
        return DataSourceContextHolder.getDBtype();
    }
}
