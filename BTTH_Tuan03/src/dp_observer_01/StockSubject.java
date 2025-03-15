package dp_observer_01;

public interface StockSubject {
    void addInvestor(Investor investor);
    void removeInvestor(Investor investor);
    void notifyInvestors();
}
