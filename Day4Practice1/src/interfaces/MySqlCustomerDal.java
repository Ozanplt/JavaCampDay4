package interfaces;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Müsteri eklendi: MYSQL");
    }
}
