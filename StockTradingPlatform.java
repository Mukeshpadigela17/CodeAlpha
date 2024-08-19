import java.util.*;
class Stock 
{
private String symbol;
private double price;
public Stock(String symbol, double price) 
{
this.symbol=symbol;
this.price=price;
}
public String getSymbol() 
{
return symbol;
}
public double getPrice() 
{
return price;
}
}
class Portfolio 
{
private Map<String, Integer> holdings; 
public Portfolio() 
{
holdings=new HashMap<>();
}
public void buyStock(String symbol, int quantity) 
{
holdings.put(symbol, holdings.getOrDefault(symbol,0)+quantity);
}
public void sellStock(String symbol, int quantity) 
{
int currentQuantity=holdings.getOrDefault(symbol,0);
if(currentQuantity>=quantity) 
{
holdings.put(symbol,currentQuantity-quantity);
} 
else 
{
System.out.println("Insufficient shares to sell.");
}
}
public double calculatePortfolioValue(Map<String, Stock> stockData) 
{
double totalValue = 0;
for(Map.Entry<String,Integer > entry:holdings.entrySet()) 
{
String symbol=entry.getKey();
int quantity=entry.getValue();
Stock stock=stockData.get(symbol);
if(stock!=null) 
{
totalValue+=stock.getPrice()*quantity;
}
}
return totalValue;
}
}
public class StockTradingPlatform 
{
public static void main(String[] args) 
{
Map<String,Stock> stockData=new HashMap<>();
stockData.put("AAPL",new Stock("AAPL",150.0));
stockData.put("GOOGL",new Stock("GOOGL",2800.0));
Scanner sc=new Scanner(System.in);
Portfolio port=new Portfolio();
while(true) 
{
System.out.println("\nMenu:");
System.out.println("1.Buy stock");
System.out.println("2.Sell stock");
System.out.println("3.Calculate portfolio value");
System.out.println("4.Exit");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
if(choice==1) 
{
System.out.print("Enter stock symbol:");
String symbol=sc.next();
System.out.print("Enter quantity to buy:");
int quantity=sc.nextInt();
port.buyStock(symbol,quantity);
} 
else if(choice==2) 
{
System.out.print("Enter stock symbol:");
String symbol=sc.next();
System.out.print("Enter quantity to sell:");
int quantity=sc.nextInt();
port.sellStock(symbol,quantity);
} 
else if(choice==3) 
{
double portfolioValue=port.calculatePortfolioValue(stockData);
System.out.println("Portfolio value: $" + portfolioValue);
} 
else if(choice==4) 
{
System.out.println("Exiting. Have a great day!");
break;
} 
else 
{
System.out.println("Invalid choice. Try again.");
}
}
sc.close();
}
}
