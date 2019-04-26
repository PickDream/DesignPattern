package Structural.Proxy;

/**
 * @author Maoxin
 * @ClassName OrderServiceImpl
 * @date 4/22/2019
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        iOrderDao.insert(order);
        System.out.println("Service层调用Dao层添加");
        return 0;
    }
}
