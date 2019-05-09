package Structural.Proxy.StaticProxy;

import Structural.Proxy.IOrderService;
import Structural.Proxy.Order;
import Structural.Proxy.OrderServiceImpl;
import Structural.Proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy implements IOrderService {
    //代理的真正对象
    private IOrderService iOrderService;


    @Override
    public int saveOrder(Order order) {
        //增强点A
        beforeMethod();
        iOrderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId%2;
        System.out.println("静态代理分配到【db"+dbRouter+"】");
        DataSourceContextHolder.setDBType(String.valueOf(dbRouter));
        //增强点B
        afterMethod();
        return iOrderService.saveOrder(order);
    }

    private void beforeMethod(){
        System.out.println("静态代理 before增强");
    }

    private void afterMethod(){
        System.out.println("静态代理 after增强");
    }
}
