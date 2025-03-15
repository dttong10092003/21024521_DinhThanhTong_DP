package dp_observer_01;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject {
    private List<Investor> investors = new ArrayList<>();
    private String stockName;
    private double price;

    public Stock(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.price = initialPrice;
    }

    @Override
    public void addInvestor(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeInvestor(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyInvestors() {
        for (Investor investor : investors) {
            investor.update(stockName, price);
        }
    }

    public void setPrice(double newPrice) {
        if (this.price != newPrice) {
            System.out.println("📈 Cổ phiếu " + stockName + " thay đổi giá: " + price + " → " + newPrice);
            this.price = newPrice;
            notifyInvestors();
        }
    }
}

