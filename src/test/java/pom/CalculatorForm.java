package pom;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorForm {
    WebDriver driver;
    By zeroNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00");
    By oneNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01");
    By twoNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
    By threeNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03");
    By fourNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04");
    By fiveNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05");
    By sixNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06");
    By sevenNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07");
    By eightNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08");
    By nineNumber = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09");
    By addOperator = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
    By subOperator = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub");
    By mulOperator = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul");
    By divOperator = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div");
    By equalOperator = By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
    By result = By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");

    public CalculatorForm(WebDriver driver){
        this.driver = driver;
    }
    public void EnterNumber(String number){
        char[] arr = number.toCharArray();
        for(int i = 0; i < number.length(); i++) {
            if (String.valueOf(arr[i]).equalsIgnoreCase("0")){
                driver.findElement(zeroNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("1")){
                driver.findElement(oneNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("2")){
                driver.findElement(twoNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("3")){
                driver.findElement(threeNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("4")){
                driver.findElement(fourNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("5")){
                driver.findElement(fiveNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("6")){
                driver.findElement(sixNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("7")){
                driver.findElement(sevenNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("8")){
                driver.findElement(eightNumber).click();
            }
            if (String.valueOf(arr[i]).equalsIgnoreCase("9")){
                driver.findElement(nineNumber).click();
            }
        }
    }
    public void EnterOperator(String operator){
        if (operator.equalsIgnoreCase("+")){
            driver.findElement(addOperator).click();
        }
        if (operator.equalsIgnoreCase("-")){
            driver.findElement(subOperator).click();
        }
        if (operator.equalsIgnoreCase("*")){
            driver.findElement(mulOperator).click();
        }
        if (operator.equalsIgnoreCase("/")){
            driver.findElement(divOperator).click();
        }
    }
    public void EnterEqual(){
        driver.findElement(equalOperator).click();
    }
    public void ShowResult (String correctResult){
        Assert.assertEquals(correctResult, driver.findElement(result).getText());
    }

}
