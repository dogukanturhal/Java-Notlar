public class mySqlCutomer implements ICustomer , IRepository{//Birden çok interface kabul edebilir
    @Override
    public void addCustomer() {
        System.out.println("Added to mySql");
    }
    @Override
    public void sum() {
        System.out.println("Test");
    }
}
