package upbit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common {

    public static WebElement selectComponent(WebDriver driver, String component) {
        return driver.findElement(By.cssSelector(component));
    }

    public static void clickComponent(WebElement element, JavascriptExecutor js) {
        js.executeScript("arguments[0].click();",element);
    }

    public static boolean isTradeCompleted(WebDriver driver, JavascriptExecutor js) {
        WebElement element = selectComponent(driver,"li.tabB__history a");
        clickComponent(element,js);

        try {
            element = selectComponent(driver,"div.rightB span.orderB div.ExHistoryTable--ScrollHeight " +
                    "table tbody td.ExHistoryTable__Cancel");
        } catch (Exception e) {
            return true;
        }

        return false;

    }

    public static double getBuyPrice(WebDriver driver, JavascriptExecutor js) {
        WebElement element = selectComponent(driver,"a[title=투자내역]");
        clickComponent(element,js);

        while(true) {
            try {
                element = selectComponent(driver,"table.AmountTable__BodyTable tr td:nth-child(3) div");
            } catch (Exception e) {
                continue;
            }
            break;
        }




        String txt = element.getText().replaceAll(",","");
        txt = txt.replaceAll("KRW","");

        element = selectComponent(driver,"a[title=거래소]");
        clickComponent(element,js);

        return Double.parseDouble(txt);
    }
}
