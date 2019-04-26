package Structural.Proxy;

/**
 * @author Maoxin
 * @ClassName OrderDaoImpl
 * @date 4/22/2019
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("插入数据成功");
        return 1;
    }
}
