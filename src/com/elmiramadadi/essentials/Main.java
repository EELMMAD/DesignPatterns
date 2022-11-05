package com.elmiramadadi.essentials;

import com.elmiramadadi.essentials.TaxCalculator;
import com.elmiramadadi.essentials.TaxCalculator2019;
import com.elmiramadadi.essentials.TextBox;

public class Main {

    public static void main(String[] args) {
        //User user = new User("Eli", 30);
        //user.sayHello();

        //TaxCalculator calculator = getCalculator();
        //calculator.calculateTax();

        // var account = new Account();
        // account.deposit(10);
        //account.withdraw(5);
        //System.out.println(account.getBalance());

        //var mailService = new MailService();
        //mailService.sendEmail();

        // var textBox = new TextBox();
        //textBox.enable();

        drawUIControl(new TextBox());
        drawUIControl(new CheckBox());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2019();
    }

    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}
