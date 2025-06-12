// Custom Exception for Stock Low
class StockLowException extends Exception {
    public StockLowException(String msg) {
        super(msg);
    }
}

// Custom Exception for Stock High
class StockHighException extends Exception {
    public StockHighException(String msg) {
        super(msg);
    }
}

// Main Stocks class
class Stocks {
    public float stockRate;

    // Constructor to initialize stock rate
    public Stocks(float stockRate) {
        this.stockRate = stockRate;
    }

    // Method to check the rate and throw exceptions
    public String checkRate(float rate) throws StockLowException, StockHighException {
        if (rate == 0.8 * stockRate) {
            return "Hope to raise";
        } else if (rate < 0.8 * stockRate) {
            throw new StockLowException("Under Loss");
        } else {
            throw new StockHighException("Under Profit");
        }
    }
}

// Main class to run the program
public class Source {
    public static void main(String[] args) throws Exception{
        try {
            Stocks stock = new Stocks(10.0f);  // Initial stock rate
            System.out.println(stock.checkRate(5.0f));  // Check rate
        } catch (StockLowException e) {
            System.out.println("StockLowException : " + e.getMessage());
        } catch (StockHighException e) {
            System.out.println("StockHighException : " + e.getMessage());
        }
        }
}