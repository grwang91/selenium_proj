import org.openqa.selenium.WebElement;
import upbit.*;

public class Main {

    public static void main (String[] args) throws InterruptedException {

        AutoTrader trader = AutoTrader.getAutoTrader();

        double boughtPrice = -1;

        int win=0, lose=0;



        //trader.driver.get("https://www.naver.com");



//        WebElement element;
//        double currentPrice;
//
//        while(true) {
//            try {
//                element = Common.selectComponent(trader.driver,
//                        "span.askpriceB div.scrollB td.positionR strong");
//            } catch (Exception e) {
//                continue;
//            }
//
//
//            currentPrice = Double.parseDouble(element.getText().replaceAll(",",""));
//
//
//            //Thread.sleep(50);
//
//            if(boughtPrice == -1) {
//                Buy.buyMarketPrice(trader.driver, trader.js);
//                while(true) {
//                    if(Common.isTradeCompleted(trader.driver, trader.js)) {
//                        break;
//                    }
//                }
//
//                boughtPrice = Common.getBuyPrice(trader.driver, trader.js);
//                System.out.println(boughtPrice + "원에 매수 완료!");
//
//                double sellPrice = Math.round(boughtPrice * (1d+TradeProperties.profitSell))/1;
//                System.out.println(sellPrice);
//
//                Sell.sellFixedPrice(sellPrice, trader.driver, trader.js);
//                System.out.println(sellPrice + "원에 매도 신청!");
//            }
//
//            if (currentPrice <= boughtPrice * (1d+TradeProperties.minusSell)) {
//                Sell.cancelAll(trader.driver, trader.js);
//                lose++;
//                System.out.println("win : " + win + " lose : " + lose);
//                Sell.sellMarketPrice(trader.driver, trader.js);
//                while(true) {
//                    if(Common.isTradeCompleted(trader.driver, trader.js)) {
//                        break;
//                    }
//                }
//                boughtPrice = -1;
//            }
//
//
//
//
////            if(currentPrice >= boughtPrice* (1d+TradeProperties.profitSell)) {
////                win++;
////                System.out.println("win : " + win + " lose : " + lose);
////                Sell.sellMarketPrice(trader.driver, trader.js);
////                while(true) {
////                    if(Common.isTradeCompleted(trader.driver, trader.js)) {
////                        break;
////                    }
////                }
////                boughtPrice = -1;
////            } else if (currentPrice <= boughtPrice * (1d+TradeProperties.minusSell)) {
////                lose++;
////                System.out.println("win : " + win + " lose : " + lose);
////                Sell.sellMarketPrice(trader.driver, trader.js);
////                while(true) {
////                    if(Common.isTradeCompleted(trader.driver, trader.js)) {
////                        break;
////                    }
////                }
////                boughtPrice = -1;
////            }
//
//        }
//
//
    }
}
