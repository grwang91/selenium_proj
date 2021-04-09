package upbit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sell {

    public static void cancelAll(WebDriver driver, JavascriptExecutor js) {
        WebElement element = Common.selectComponent(driver,"div.mainB span.askpriceB " +
                "table.total tr td:nth-child(1) a");
        Common.clickComponent(element,js);

        boolean flag = true;
        while (flag) {
            try {
                element = Common.selectComponent(driver,"section.popup01 span a.widthAuto");
                Common.clickComponent(element,js);
            } catch (Exception e) {
                continue;
            }
            flag = false;
        }

    }

    public static void sellMarketPrice(WebDriver driver, JavascriptExecutor js) {
        
        //매도 버튼
        WebElement element = Common.selectComponent(driver,"li.tabB__sell a");
        Common.clickComponent(element,js);

        //시장가 버튼
        element = Common.selectComponent(driver,"div.mainB section.ty01 div.rightB dd.checkOption" +
                " span.chkB a:nth-child(2) em");
        Common.clickComponent(element,js);

        //100% 버튼

        while (true) {
            element = Common.selectComponent(driver,"span.orderB dd.Quantity a:nth-child(4)");
            Common.clickComponent(element,js);

            element = Common.selectComponent(driver,"div.rightB span.orderB dl dd.marginB6 input");

            if(element.getAttribute("value").equals("") || element.getAttribute("value").equals("0")) {
                continue;
            }

            break;
        }


        //매도 실행 버튼
        element = Common.selectComponent(driver,"div.FixedBottom li.ty02 a");
        Common.clickComponent(element,js);

        //매도확인 버튼
        while(true) {
            try {
                element = Common.selectComponent(driver,"a[title=매도확인]");
                Common.clickComponent(element,js);
            } catch (Exception e) {
                continue;
            }

            break;

        }

    }

    public static void sellFixedPrice(double price, WebDriver driver, JavascriptExecutor js) throws InterruptedException {
        //매도 버튼
        WebElement element = Common.selectComponent(driver,"li.tabB__sell a");
        Common.clickComponent(element,js);

        //지정가 버튼
        element = Common.selectComponent(driver,"div.mainB section.ty01 div.rightB dd.checkOption" +
                " span.chkB a:nth-child(1) em");
        Common.clickComponent(element,js);

        //가격 지정 버튼
        element = Common.selectComponent(driver,"span.orderB dd.marginB10 input");
        Thread.sleep(1000);
        element.clear();
        //element.sendKeys(Double.toString(price));
        element.sendKeys(Integer.toString((int)price));

        //100% 버튼
        while (true) {
            element = Common.selectComponent(driver,"span.orderB dd.Quantity a:nth-child(4)");
            Common.clickComponent(element,js);

            element = Common.selectComponent(driver,"div.rightB span.orderB dl dd.marginB6 input");

            if(element.getAttribute("value").equals("") || element.getAttribute("value").equals("0")) {
                continue;
            }

            break;
        }

        //매도 실행 버튼
        element = Common.selectComponent(driver,"div.FixedBottom li.ty02 a");
        Common.clickComponent(element,js);

        //매도확인 버튼
        while(true) {
            try {
                element = Common.selectComponent(driver,"a[title=매도확인]");
                Common.clickComponent(element,js);
            } catch (Exception e) {
                continue;
            }

            break;

        }
    }
}
