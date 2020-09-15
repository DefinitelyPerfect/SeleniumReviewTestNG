package com.techproed.tests;

import com.techproed.pages.GlbPantsPage;
import com.techproed.utilities.ConfigurationReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
/*
a ) https://www.glbtrader.com/listing/Men-Clothing-Accessories-Pants/1/9
	Bu sayfaya gidelim. Bu sayfaya gitmek için;
	1- Driver class'ını kullanın.
	2- Sayfa adresini properties dosyasına ekleyin ve oradan alın.
	   glb_pantolon = https://www.glb...
b ) Pages paketinin altında GlbPantsPage isminde bir tane class oluşturun.
	İçerisinde webElementleri bulun.
c ) Tests paketinin altında GlbPantsTest isminde bir tane class oluşturun.
	Bulduğunuz webelementlerin (yani alt kategorilerin) içerdiği yazıları
	ekrana yazdırın.
 */

public class GlbPantsTest {

    @Test
    public void test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_pantolon"));
        GlbPantsPage glbPantsPage = new GlbPantsPage();

        for(WebElement w : glbPantsPage.basliklar){
            System.out.println(w.getText());
        }
    }
}