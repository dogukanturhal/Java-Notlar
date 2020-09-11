public class CustomerManagerPolymorph {
    private BaseLogger _logger;
    public CustomerManagerPolymorph(BaseLogger _logger) {
        this._logger = _logger;
    }
    public void addLog() {
        System.out.println("Customer Added");
        this._logger.Log("logged");
    }
}
