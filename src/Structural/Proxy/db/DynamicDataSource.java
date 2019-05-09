package Structural.Proxy.db;

/**
 * Spring 分库的简单实现
 * */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey(){
        return DataSourceContextHolder.getDBtype();
    }
}
