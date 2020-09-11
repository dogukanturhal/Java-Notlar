public class CustomerAbstractManager {
    
    BaseDatabaseAbstractManager baseDatabaseAbstractManager;

    public void getCustomers() {
        baseDatabaseAbstractManager.getData();
    }
}
