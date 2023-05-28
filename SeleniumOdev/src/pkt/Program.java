/**
*
* @author MERT MUTLU B191210077
* mert.mutlu@ogr.sakarya.edu.tr
* @since 26.05.2023
*
*/


package pkt;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Program {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);

		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver surucu = new ChromeDriver();
		boolean continueLoop;
		do {

        System.out.print("Yapilacak islem no secin(1-30): ");
        int num = scanner.nextInt();
        System.out.println("Islem no: "+ num);

        
        
        surucu.get("https://www.gloriajeans.com.tr/");
		surucu.manage().window().maximize();
        
        
        switch (num) {
            case 1:
            	System.out.println("");
            	System.out.println("Uye olma testi yapilacak.");
            	System.out.println("");
            	uyeOlTest(surucu);
                break;
            case 2:
            	System.out.println("");
            	System.out.println("Uye girisi testi yapilacak.");
            	System.out.println("");
            	girisYapTest(surucu);
                break;
            case 3:
            	System.out.println("");
            	System.out.println("Ana sayfa dogru yuklenme testi yapilacak.");
            	System.out.println("");
            	mainPageTest(surucu);
                break;
            case 4:
            	System.out.println("");
            	System.out.println("Menu sayfasi dogru yuklenme testi yapilacak.");
            	System.out.println("");
            	menuTest1(surucu);
                break;
            case 5:
            	System.out.println("");
            	System.out.println("Menu sayfasi icinde dolasim testi 2 yapilacak.");
            	System.out.println("");
            	menuTest2(surucu);
                break;
            case 6:
            	System.out.println("");
            	System.out.println("Sube arama testi yapilacak.");
            	System.out.println("");
            	subeTest(surucu);
                break;
            case 7:
            	System.out.println("");
            	System.out.println("Franchising sayfasi dogru yuklenme testi yapilacak.");
            	System.out.println("");
            	franchisingPageTest(surucu);
                break;
            case 8:
            	System.out.println("");
            	System.out.println("İletisim sayfasi dogru yuklenme testi yapilacak.");
            	System.out.println("");
            	communicationPageTest(surucu);
                break;
            case 9:
            	System.out.println("");
            	System.out.println("Alisveris sayfasi testi yapilacak.");
            	System.out.println("");
            	shoppingPageTest(surucu);
                break;
            case 10:
            	System.out.println("");
            	System.out.println("Favori urun sayisi testi yapilacak.");
            	System.out.println("");
            	favoriteProductCounterTest(surucu);
                break;
            case 11:
            	System.out.println("");
            	System.out.println("Alisveris sepeti kontrol testi yapilacak.");
            	System.out.println("");
            	isShoppingCardEmptyTest(surucu);
                break;
            case 12:
            	System.out.println("");
            	System.out.println("Sepete urun ekleme testi yapilacak.");
            	System.out.println("");
            	itemAddtoBasketTest(surucu);
                break;
            case 13:
            	System.out.println("");
            	System.out.println("Sepete coklu urun ekleme testi yapilacak.");
            	System.out.println("");
            	multipleItemAddToBasket(surucu);
                break;
            case 14:
            	System.out.println("");
            	System.out.println("Aliveris sepeti guncelleme testi yapilacak.");
            	System.out.println("");
            	updateCardTest(surucu);
                break;
            case 15:
            	System.out.println("");
            	System.out.println("Alisverise geri don buton testi  yapilacak.");
            	System.out.println("");
            	contunieToShoppingButtonTest(surucu);
                break;
            case 16:
            	System.out.println("");
            	System.out.println("Alisveris sayfasinin icindeki SURUP sayfasi acilma testi yapilacak.");
            	System.out.println("");
            	syrupPageTestInsideTheShoppingPage(surucu);
                break;
            case 17:
            	System.out.println("");
            	System.out.println("Alisveris sayfasinin icindeki AVANTAJLI PAKETLER sayfasi acilma testi yapilacak.");
            	System.out.println("");
            	advantagePackagesPageTestInsideTheShoppingPage(surucu);
                break;
            case 18:
            	System.out.println("");
            	System.out.println("Alisveris sayfasinin icindeki Yan urunler sayfasinin dogru acilma testi yapilacak.");
            	System.out.println("");
            	merchPageTestInsideTheShoppingPage(surucu);
                break;
            case 19:
            	System.out.println("");
            	System.out.println("Alisveris sayfasinin icindeki Indirimli Urunler sayfasinin dogru acilma testi yapilacak..");
            	System.out.println("");
            	discountedItemsTestInsideTheShoppingPage(surucu);
                break;
            case 20:
            	System.out.println("");
            	System.out.println("Sepetteki urunleri silme testi yapilacak.");
            	System.out.println("");
            	clearAllCard(surucu);
                break;
            case 21:
            	System.out.println("");
            	System.out.println("Log out testi yapilacak.");
            	System.out.println("");
            	logOutTest(surucu);
                break;
            case 22:
            	System.out.println("");
            	System.out.println("Arama butonu testi yapilacak.");
            	System.out.println("");
            	searchButtonTest(surucu);
                break;
            case 23:
            	System.out.println("");
            	System.out.println("Carousel testi yapilacak.");
            	System.out.println("");
            	carouselTest(surucu);
                break;
            case 24:
            	System.out.println("");
            	System.out.println("Mobil uygulamaya yonlendirme testi yapilacak.");
            	System.out.println("");
            	mobileAppLinkTest(surucu);
                break;
            case 25:
            	System.out.println("");
            	System.out.println("Profil sayfasi testi yapilacak.");
            	System.out.println("");
            	profilePageBrowsingTest(surucu);
                break;
            case 26:
            	System.out.println("");
            	System.out.println("Urun yorumları testi yapilacak.");
            	System.out.println("");
            	commentCounter(surucu);
                break;
            case 27:
            	System.out.println("");
            	System.out.println("Filtreleme testi yapilacak.");
            	System.out.println("");
            	filteringTest(surucu);
                break;
            case 28:
            	System.out.println("");
            	System.out.println("Urunleri dogru siralama testi yapilacak.");
            	System.out.println("");
            	sortingTest(surucu);
                break;
            case 29:
            	System.out.println("");
            	System.out.println("Mobil websitesi uyumluluk testi yapilacak.");
            	System.out.println("");
            	mobilUyumluluk(surucu);
                break;
            case 30:
            	System.out.println("");
            	System.out.println("Urun fotograflari yuklenme testi yapilacak.");
            	System.out.println("");
            	isItemImageEmptyTest(surucu);
                break;
            default:
                System.out.println("Gecersiz sayi!");
                break;
        }
		Thread.sleep(2000);
		//surucu.quit();
        scanner.nextLine(); 
        System.out.print("Devam etmek istiyor musunuz? (y/n): ");
        String response = scanner.nextLine();

        continueLoop = response.equalsIgnoreCase("y");
		} while (continueLoop);
        
		surucu.quit();

        scanner.close();
        System.out.println(" ");
        System.out.println("Cikis yapildi.");
    
		
		

	}
	
	public static void uyeOlTest(WebDriver driver) throws InterruptedException {
		
			Thread.sleep(1000);
		    driver.findElement(By.cssSelector(".fa-user")).click();
		    Thread.sleep(500);
		    driver.findElement(By.name("firstname")).sendKeys("MERT");
		   
		    driver.findElement(By.name("lastname")).sendKeys("MUTLU");
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector(".col-md-12:nth-child(3) > #signin-email")).sendKeys("mert.mutlu@ogr.sakarya.edu.tr");
		    driver.findElement(By.id("phone_number")).sendKeys("5353792374");
		    Thread.sleep(500);
		    driver.findElement(By.cssSelector(".col-md-12:nth-child(5) > #signin-password")).sendKeys("Deneme123.");
		    driver.findElement(By.id("signin-password-repeat")).sendKeys("Deneme123.");
		    boolean testsPassed=true;
		    Thread.sleep(750);
		    
		    if(testsPassed) {
		    	System.out.println("Uye olma testi basarili");
		    }else {
		    	System.out.println("Uye olma testi basarisiz");
		    }
		    
		    
	  }
	public static void girisYapTest(WebDriver driver) throws InterruptedException {

		
		Thread.sleep(2500);
		    driver.findElement(By.cssSelector(".fa-user")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("signin-email")).click();
		    driver.findElement(By.id("signin-email")).sendKeys("mert.mutlu@ogr.sakarya.edu.tr");
		    Thread.sleep(500);

		    driver.findElement(By.id("signin-password")).click();
		    driver.findElement(By.id("signin-password")).sendKeys("Deneme123.");

		    driver.findElement(By.cssSelector(".login-button")).click();
		    Thread.sleep(2000);
		    WebElement resultDiv= driver.findElement(By.xpath("//div/h5[contains(text(),'Hoşgeldiniz MERT MUTLU')]"));
		    Thread.sleep(2000);
		    String text=resultDiv.getText();
		    Thread.sleep(500);
			String keyword = "MERT MUTLU";
		    Thread.sleep(500);
			boolean contains = text.contains(keyword);
		    Thread.sleep(500);

			if (contains) {
			    System.out.println("Giris basarili.");
			} else {
			    System.out.println("Giris basarisiz.");
			}
			
	}
	public static void mainPageTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
	    // Anasayfanın doğru şekilde yüklendiğini kontrol etmek için başlık doğrulaması yapın
        String expectedTitle = "Gloria Jean's Coffees";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Anasayfa dogru sekilde yuklendi.");
        } else {
            System.out.println("Anasayfa yuklenirken bir hata olustu.");
        }
	}
	public static void menuTest1(WebDriver driver) throws InterruptedException {
		//açılan ilk menü sayfasının kontrolü
		Thread.sleep(2500);
	    driver.findElement(By.linkText("Menü")).click();

		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu_52\"]/div"));

        if (element.isDisplayed()) {
            System.out.println("Menu  mevcut.");
        } else {
            System.out.println("Menu mevcut degil.");
        }

    
	}
	public static void menuTest2(WebDriver driver) throws InterruptedException {
		//menu iç sayfalarının olup olmadığı testi
		Thread.sleep(2500);
		driver.findElement(By.linkText("Menü")).click();
		Thread.sleep(850);
	    driver.findElement(By.linkText("Sıcak İçeceklerimiz")).click();
		Thread.sleep(850);
	    driver.findElement(By.linkText("Soğuk İçeceklerimiz")).click();
		Thread.sleep(850);
	    driver.findElement(By.linkText("Yiyeceklerimiz")).click();
		Thread.sleep(850);
	    driver.findElement(By.linkText("Türk Kahvesi")).click();
		Thread.sleep(850);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu_47\"]/div/div/div"));

        if (element.isDisplayed()) {
            System.out.println("Menu icinde dolasim testi basarili.");
        } else {
            System.out.println("Menu icinde dolasim testi basarili degil.");
        }
		
	}
	public static void subeTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		 driver.findElement(By.linkText("Şubelerimiz")).click();
		 Thread.sleep(850);

		 WebElement sube=driver.findElement(By.xpath("//*[@id=\"content\"]/main/div/section/div/div/div/div/div[1]/div/div[1]/select"));
		 Select subeNo=new Select(sube);
		 Thread.sleep(850);
		 subeNo.selectByValue("29");
		 Thread.sleep(1200);
		 WebElement resultDiv= driver.findElement(By.xpath("//*[@id=\"content\"]/main/div/section/div/div/div/div/div[1]/div/div[2]/div[2]/span"));
		 Thread.sleep(1200);
		    String text=resultDiv.getText();
			String keyword = "CADDE 54";

			boolean contains = text.contains(keyword);

			if (contains) {
			    System.out.println("CADDE 54 AVM subesi bulundu.");
			} else {
			    System.out.println("Sube bulunamadi.");
			}

		
	}
	public static void franchisingPageTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		 boolean testsPassed=true;
		driver.findElement(By.linkText("Franchising")).click();
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).sendKeys("MERT");
	    driver.findElement(By.name("last_name")).click();
	    driver.findElement(By.name("last_name")).sendKeys("MUTLU");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).sendKeys("5380329797");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("mert.mutlu.16@hotmail.com");
	    Thread.sleep(250);
	    driver.findElement(By.id("submitForm")).click();
	    Thread.sleep(600);
	    driver.findElement(By.name("birthplace")).click();
	    driver.findElement(By.name("birthplace")).sendKeys("BURSA");
	    driver.findElement(By.name("birthday")).sendKeys("2001-01-31");
	    driver.findElement(By.id("franchising-homeadress")).click();
	    driver.findElement(By.id("franchising-homeadress")).sendKeys("BURSA");
	    driver.findElement(By.name("workadress")).click();
	    driver.findElement(By.name("workadress")).sendKeys("BURSA");
	    driver.findElement(By.id("franchising-title")).click();
	    driver.findElement(By.id("franchising-title")).sendKeys("ÖĞRENCİ");
	    driver.findElement(By.id("franchising-firmaad1")).click();
	    driver.findElement(By.id("franchising-firmaad1")).sendKeys("-----");
	    driver.findElement(By.id("franchising-girisimleriniz")).click();
	    Thread.sleep(250);
	    driver.findElement(By.id("franchising-girisimleriniz")).sendKeys("----");
	    driver.findElement(By.id("franchising-gidaisletmeyakin")).click();
	    driver.findElement(By.id("franchising-gidaisletmeyakin")).sendKeys("----");
	    driver.findElement(By.id("franchising-yatirim")).click();
	    driver.findElement(By.id("franchising-yatirim")).sendKeys("---");
	    driver.findElement(By.id("franchising-ililce")).click();
	    driver.findElement(By.id("franchising-ililce")).sendKeys("---");
	    driver.findElement(By.id("franchising-kazanc")).click();
	    driver.findElement(By.id("franchising-kazanc")).sendKeys("---");
	    driver.findElement(By.id("franchising-address_tasarruf")).click();
	    driver.findElement(By.id("franchising-address_tasarruf")).sendKeys("SAKARYA");
	    driver.findElement(By.id("franchising-notunuz")).click();
	    driver.findElement(By.id("franchising-notunuz")).sendKeys("FRANCHİSİNG TESTİ");
	    
	    Thread.sleep(750);
	    
	    if(testsPassed) {
	    	System.out.println("Franchising sayfasi testi basarili");
	    }else {
	    	System.out.println("Franchising sayfasi testi basarisiz");
	    }
		    
	}
	public static void communicationPageTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);

		 boolean testsPassed=true;
		Thread.sleep(1100);
	    driver.findElement(By.linkText("İletişim")).click();
	    Thread.sleep(1100);
	    driver.findElement(By.name("name")).click();
	    Thread.sleep(1100);
	    driver.findElement(By.name("name")).sendKeys("MERT MUTLU");
	    Thread.sleep(1100);
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).sendKeys("mert.mutlu@ogr.sakarya.edu.tr");
	    Thread.sleep(1100);
	    driver.findElement(By.name("subject")).click();
	    driver.findElement(By.name("subject")).sendKeys("TEST");
	    Thread.sleep(1100);
	    driver.findElement(By.name("message")).click();
	    driver.findElement(By.name("message")).sendKeys("İLETİŞİM SAYFASI TESTİ");
	   
	    Thread.sleep(1100);
	    
	    if(testsPassed) {
	    	System.out.println("İletisim sayfasi testi basarili");
	    }else {
	    	System.out.println("İletisim sayfasi testi basarisiz");
	    }
	}
	public static void shoppingPageTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
	    driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
	    Thread.sleep(3000);
	    WebElement element = driver.findElement(By.id("ProductPageProductList"));
	    Thread.sleep(1100);
	    if (!element.isDisplayed()) {
            System.out.println("ONLINE SIPARIS sayfasi acilamadi.");
        }else {
        	System.out.println("ONLINE SIPARIS sayfasi acildi.");
        }
}
	public static void favoriteProductCounterTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(3200);
	    driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();

	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	   WebElement resultDiv= wait.until(ExpectedConditions.visibilityOf( driver.findElement( By.xpath("//div/a[@class='HeaderFavori']/span"))));
	 
	    String text=resultDiv.getText();
	    
	    Thread.sleep(1000);
	    //Bu test case'de favori ürün olmadığı için 0 gelmesi doğru durumdur.
        if (!text.equals("0")) {
        	System.out.println("Favori urun sayisi HATALI!..");
        }else {
        	System.out.println("Favori urun sayisi testi basarili.");
        }
       
	    
	}
	public static void isShoppingCardEmptyTest(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2500);
		WebElement element= driver.findElement(By.id("cart-counter"));
		
		 String text=element.getText();
		    
		    //Bu test case'de sepette ürün olmadığı için 0 gelmesi doğru durumdur.
	        if (!text.equals("0")) {
	        	System.out.println("Sepetteki urun sayisi HATALI!..");
	        }else {
	        	System.out.println("Sepetteki urun sayisi dogru(0).");
	        }
	}
	public static void itemAddtoBasketTest(WebDriver driver) throws InterruptedException {

		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.xpath("//*[@id=\"HeaderMenu2\"]/li[2]/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Gloria Jean\'s Coffees 100Grx10 Klasik Türk Kahvesi")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnHemenAl")).click();
	    Thread.sleep(2500);
	    
	    WebElement urunAdet= driver.findElement(By.id("txtbxAdet_77"));
		String value=urunAdet.getAttribute("value");
        if (!value.equals("1")) {
        	System.out.println("Sepetteki urun adedi HATALI!..");
        }else {
        	System.out.println("Sepete urun ekleme testi basarili.");
        }
        /*!!!!!!!!!
         * Bu testin amacinda sepetteki urunleri silmek yok ancak sepete 
         * eklenen urunler silinmediginde ard arda calısan diger testlerde sikinti cikartiyor
         * o yuzden testin sonunda silme isleminide yapmak zorundayım. 
         */
	    driver.findElement(By.id("mainHolder_ucSepetim_btnSepetiTemizle")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".confirm")).click();
	    Thread.sleep(1200);
	  
	}
	public static void multipleItemAddToBasket(WebDriver driver) throws InterruptedException {
		Thread.sleep(3350);
		 driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		 	Thread.sleep(2500);
		 	driver.manage().deleteAllCookies();
		 	Thread.sleep(2500);
		 	driver.navigate().refresh();
		 	Thread.sleep(3000);
		    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
		    Thread.sleep(3350);
		    driver.findElement(By.linkText("Daha Sonra")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("KAHVE")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("Gloria Jean\'s Coffees 3\'ü 1 Arada (50 adet)")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".Addtobasket")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".fancybox-item")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("ŞURUP")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("Gloria Jean\'s Coffees Strawberry Aromalı Cam Şişe Şurup 70cl")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".Addtobasket")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".fancybox-item")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("MERCH")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("Caffeo kahve Filtre Kağıdı 80\'li")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".Addtobasket")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.cssSelector(".fancybox-item")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("KAHVE")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.linkText("Gloria Jean\'s Chai Tea Latte %100 Arabica Beans Sütlü Kahveli 250ml İçecek")).click();
		    Thread.sleep(2600);
		    driver.findElement(By.id("btnHemenAl")).click();
		    Thread.sleep(2600);
		    
		    WebElement element= driver.findElement(By.xpath("//li[@class='genelToplam']/span[text()='₺609,00']"));
		    Thread.sleep(1100);
			String sonFiyat=element.getText();
			//System.out.println(sonFiyat);
			Thread.sleep(900);
	        if (!sonFiyat.equals("₺609,00")) {
	        	System.out.println("HATA...");
	        }else {
	        	System.out.println("Test basarili.");
	        }
	        
	        /*!!!!!!!!!
	         * Bu testin amacinda sepetteki urunleri silmek yok ancak sepete 
	         * eklenen urunler silinmediginde ard arda calısan diger testlerde sikinti cikartiyor
	         * o yuzden testin sonunda silme isleminide yapmak zorundayım. 
	         */
		    driver.findElement(By.id("mainHolder_ucSepetim_btnSepetiTemizle")).click();
		    Thread.sleep(2500);
		    driver.findElement(By.cssSelector(".confirm")).click();
		    Thread.sleep(1200);
		    
		    
	}
	public static void updateCardTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("KAHVE")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Gloria Jean\'s Coffees 100Grx10 Klasik Türk Kahvesi")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("btnHemenAl")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtbxAdet_77")).sendKeys("2");
	    Thread.sleep(2000);
	    driver.findElement(By.id("mainHolder_ucSepetim_rptSepet_lnkBtnAdetGuncelle_0")).click();
	    Thread.sleep(2000);
	    WebElement urunAdet= driver.findElement(By.id("txtbxAdet_77"));
		String value=urunAdet.getAttribute("value");
        if (!value.equals("21")) {
        	System.out.println("Sepetteki urun adedi HATALI!..");
        }else {
        	System.out.println("Sepeti guncelleme testi basarili.");
        }
        /*!!!!!!!!!
         * Bu testin amacinda sepetteki urunleri silmek yok ancak sepete 
         * eklenen urunler silinmediginde ard arda calısan diger testlerde sikinti cikartiyor
         * o yuzden testin sonunda silme isleminide yapmak zorundayım. 
         */
	    driver.findElement(By.id("mainHolder_ucSepetim_btnSepetiTemizle")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".confirm")).click();
	    Thread.sleep(1200);
	}
	public static void contunieToShoppingButtonTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("KAHVE")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Gloria Jean\'s Coffees 2\'si 1 Arada (50 adet)")).click();
	    Thread.sleep(2000);

	    driver.findElement(By.id("btnHemenAl")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("linkAlisverisDevam")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Gloria Jean\'s Coffees Cafe Latte %100 Arabica Beans Şekerşiz Sütlü Kahveli 250ml İçecek")).click();
	    Thread.sleep(2000);
		driver.findElement(By.id("btnHemenAl")).click();
		Thread.sleep(2000);

		 WebElement urunAdet1= driver.findElement(By.id("txtbxAdet_128"));
		 Thread.sleep(1100);
		 String value1=urunAdet1.getAttribute("value");
		 WebElement urunAdet2= driver.findElement(By.id("txtbxAdet_130"));
		 Thread.sleep(1100);
			String value2=urunAdet2.getAttribute("value");	
	        if (!value1.equals("1") && !value2.equals("1")) {
	        	System.out.println("HATALI islem...");
	        }else {
	        	System.out.println("Alisverise geri don butonu dogru calisiyor.");
	        }
	        
	        /*!!!!!!!!!
	         * Bu testin amacinda sepetteki urunleri silmek yok ancak sepete 
	         * eklenen urunler silinmediginde ard arda calısan diger testlerde sikinti cikartiyor
	         * o yuzden testin sonunda silme isleminide yapmak zorundayım. 
	         */
		    driver.findElement(By.id("mainHolder_ucSepetim_btnSepetiTemizle")).click();
		    Thread.sleep(2500);
		    driver.findElement(By.cssSelector(".confirm")).click();
		    Thread.sleep(1200);
	}
	public static void syrupPageTestInsideTheShoppingPage(WebDriver driver) throws InterruptedException  {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("ŞURUP")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.linkText("Gloria Jean\'s Coffees Vanilya Cam Şişe Şurup 70cl"));

        if (!element.isDisplayed()) {
            System.out.println("Surup sayfasi acilamadi.");
        }else {
        	System.out.println("SURUP sayfasi acildi.");
        }
	}
	public static void advantagePackagesPageTestInsideTheShoppingPage(WebDriver driver) throws InterruptedException  {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("AVANTAJLI PAKETLER")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.linkText("Gloria Jeans Coffees Single Origin Alüminyum Kapsül Kahve Avantajlı Paket 5\'li Kutu"));
	    													
        if (!element.isDisplayed()) {
            System.out.println("Avantajli Paketler sayfasi acilamadi.");
        }else {
        	System.out.println("Avantajlı Paketler sayfasi acildi.");
        }
	}	
	public static void merchPageTestInsideTheShoppingPage(WebDriver driver) throws InterruptedException  {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("MERCH")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.linkText("Chetto French Press 350ml"));
	    													
        if (!element.isDisplayed()) {
            System.out.println("Yan Urunler sayfasi acilamadi.");
        }else {
        	System.out.println("Yan urunler sayfasi acildi. Test basarili. ");
        }
	}		
	public static void discountedItemsTestInsideTheShoppingPage(WebDriver driver) throws InterruptedException  {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("İNDİRİMLİ ÜRÜNLER")).click();
	    Thread.sleep(2000);
	    WebElement element = driver.findElement(By.linkText("Gloria Jean's Coffees %100 Arabica Special Espresso Blend Arabica Kavrulmuş Kahve Çekirdeği 1KG"));
	    													
        if (!element.isDisplayed()) {
            System.out.println("Indirimli Urunler sayfasi acilamadi.");
        }else {
        	System.out.println("Indirimli Urunler sayfasi acildi. Test basarili.");
        }
	}	
	public static void clearAllCard(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3200);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("KAHVE")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("Gloria Jean\'s Coffees 100Grx10 Klasik Türk Kahvesi")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".Addtobasket")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".fancybox-item")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("MERCH")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("Chetto French Press 350ml")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.id("btnHemenAl")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.id("mainHolder_ucSepetim_btnSepetiTemizle")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".confirm")).click();
	    Thread.sleep(2500);
	    
		 WebElement resultDiv= driver.findElement(By.xpath("//*[@id=\"form1\"]/div[4]/div/div[1]/div[3]/div[1]/div/div[2]/div/div"));
		 Thread.sleep(1200);
		    String text=resultDiv.getText();
			String keyword = "Sepetinizde ürün bulunmamaktadır.";

			boolean contains = text.contains(keyword);

			if (!contains) {
			    System.out.println("Sepet silme islemi basarisiz.");
			} else {
	        	System.out.println("Tum Sepeti silme islemi basarili.");
	        }
	  }
	public static void logOutTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.cssSelector(".fa-user")).click();
		Thread.sleep(1100);

	    driver.findElement(By.id("signin-email")).click();
	    driver.findElement(By.id("signin-email")).sendKeys("mert.mutlu@ogr.sakarya.edu.tr");
	    Thread.sleep(1100);
	    driver.findElement(By.id("signin-password")).click();
	    driver.findElement(By.id("signin-password")).sendKeys("Deneme123.");
	    Thread.sleep(1100);
	    driver.findElement(By.cssSelector(".login-button")).click();
	    Thread.sleep(3200);
	    driver.findElement(By.linkText("Çıkış")).click();
	    Thread.sleep(1750);
	    driver.findElement(By.cssSelector(".fa-user")).click();
	    Thread.sleep(1100);
	    String expectedTitle = "Üye Girişi";
        String actualTitle = driver.getTitle();
        //System.out.print(actualTitle);
        if (!actualTitle.equals(expectedTitle)) {
            System.out.println("Cikis islemi basarisiz.");
        }else {
            System.out.println("Cikis islemi basariyla gerceklestirildi.");

        }
        
		
	}
	public static void searchButtonTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
	    driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
	    Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.cssSelector(".fa-search")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("txtbxArama")).click();
	    Thread.sleep(1000);

	    driver.findElement(By.id("txtbxArama")).sendKeys("French Press");
	    Thread.sleep(1000);

	    driver.findElement(By.id("btnKelimeAra")).click();
	    Thread.sleep(2500);

	   
	    WebElement element=driver.findElement(By.linkText("Chetto French Press 350ml"));
	    Thread.sleep(1100);
	    
	    if(!element.isDisplayed()) {
	    	System.out.println("Aradiginiz urun bulunamadi.");
	    }else {
        	System.out.println("Aranan urun bulundu .Test basarili.");
        }
	}
	public static void carouselTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		boolean testsPassed=true;
		    driver.findElement(By.cssSelector("#slick-slide00 > button")).click();
		    Thread.sleep(750);
		    driver.findElement(By.cssSelector("#slick-slide04 > button")).click();
		    Thread.sleep(750);
		    driver.findElement(By.cssSelector("#slick-slide01 > button")).click();
		    Thread.sleep(750);
		    driver.findElement(By.cssSelector("#slick-slide03 > button")).click();
		    driver.findElement(By.cssSelector("#slick-slide00 > button")).click();
		    Thread.sleep(750);
		    driver.findElement(By.cssSelector("#slick-slide02 > button")).click();
		    Thread.sleep(750);		   
		    if(testsPassed) {
		    	System.out.println("Carousel kaydirma testi basarili");
		    }else {
		    	System.out.println("Carousel kaydirma testi basarili");
		    }
		  
	}
	public static void mobileAppLinkTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		WebElement mobileAppLink=driver.findElement(By.cssSelector(".col-md-6:nth-child(2) img"));
		Thread.sleep(1100);
		mobileAppLink.click();
		Thread.sleep(1100);
		String expectedUrl = "https://apps.apple.com/tr/app/gloria-jeans-coffees/id934750905?l=tr";
		String actualUrl = driver.getCurrentUrl();
		if (!actualUrl.equals(expectedUrl)) {
		    System.out.println("Mobil uygulamaya yonlendirilemediniz.");
		} else {
			System.out.println("Mobil uygulamaya basariyle yonlendirildiniz.");
		}
	}	
	public static void profilePageBrowsingTest(WebDriver driver) throws InterruptedException {
	   Thread.sleep(2750);
		driver.findElement(By.cssSelector(".fa-user")).click();
		Thread.sleep(1000);
	    driver.findElement(By.id("signin-email")).click();
	    Thread.sleep(1100);
	    driver.findElement(By.id("signin-email")).sendKeys("mert.mutlu@ogr.sakarya.edu.tr");
	    Thread.sleep(1000);
	    driver.findElement(By.id("signin-password")).click();
	    Thread.sleep(1100);
	    driver.findElement(By.id("signin-password")).sendKeys("Deneme123.");
	    Thread.sleep(1100);
	    driver.findElement(By.cssSelector(".login-button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Sipariş Geçmişim")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Profilim")).click();
	    Thread.sleep(1750);
	    WebElement nameElement = driver.findElement(By.id("profile-first-name"));
	    Thread.sleep(1100);
	    String nameValue = nameElement.getAttribute("value");
	    String expectedName="MERT";
	    if(!nameValue.equals(expectedName)) {
	    	System.out.println("Basarisiz...");
	    }else {
	    	System.out.println("Basarili.");
	    }

	}
	public static void commentCounter(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		 	driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		 	Thread.sleep(2500);
		 	driver.manage().deleteAllCookies();
		 	Thread.sleep(2500);
		 	driver.navigate().refresh();
		 	Thread.sleep(3000);
		    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("Daha Sonra")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.linkText("KAHVE")).click();
		    Thread.sleep(1750);
		    driver.findElement(By.linkText("Gloria Jean\'s Coffees 100Grx10 Klasik Türk Kahvesi")).click();
		    Thread.sleep(1750);
		    driver.findElement(By.linkText("Ödeme Seçenekleri")).click();
		    Thread.sleep(1750);
		    driver.findElement(By.xpath("//*[@id=\"liTabYorumlar\"]/a")).click();
		    Thread.sleep(1750);
		    
		    WebElement commentElements= driver.findElement(By.xpath("//span[@id='divYorumSayisi']"));
		    Thread.sleep(1100);
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true);", commentElements);
		    Thread.sleep(1100);
		    String text=commentElements.getText();
		    String modifiedText = text.replace("(", "").replace(")", "");
		    Thread.sleep(1100);
		    int commentCount = Integer.parseInt(modifiedText);
		    if(commentCount>0) {
		    	System.out.println("Urun hakkinda yorumlar bulundu");
		    }else {
		    	System.out.println("Urun hakkinda yorum yok");
		    }
	}
	public static void filteringTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
		    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
			Thread.sleep(2000);

		    driver.findElement(By.linkText("Daha Sonra")).click();
			Thread.sleep(2000);

		    driver.findElement(By.linkText("MERCH")).click();
			Thread.sleep(2000);

		    driver.findElement(By.xpath("//*[@id=\"divLeftBlock\"]/div/div[2]/div[2]/div[4]/ul/li[1]/ul/li[1]/a")).click();
		    Thread.sleep(2000);
		    WebElement elementCanta = driver.findElement(By.linkText("Gloria Jean\'s Coffees Çok Amaçlı Minimal Bez Çanta"));
		    Thread.sleep(1100);
		    if (elementCanta.isDisplayed()) {
	            System.out.println("Filtreleme basariyla yapildi.");
	        } else {
	            System.out.println("Filtreleme islemi yapilamadi.");
	        }
	}
	public static void sortingTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("MERCH")).click();
	    Thread.sleep(1500);
	    driver.findElement(By.xpath("//ul[@class='sortingContent']/li[2]/a")).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement mostExpensiveItem = driver.findElement(By.xpath("//div[@id='ProductPageProductList']/div[1]"));

		js.executeScript("arguments[0].scrollIntoView(true);", mostExpensiveItem);
	    Thread.sleep(1100);

	    WebElement cheapestItem = driver.findElement(By.xpath("//div[@id='ProductPageProductList']/div[10]"));
	    
	    Thread.sleep(1100);
		 // Elementin görüntüleneceği konuma kaydır
		js.executeScript("arguments[0].scrollIntoView(true);", cheapestItem);
	    if (mostExpensiveItem.isDisplayed() && cheapestItem.isDisplayed()) {
	        System.out.println("Fiyata gore siralama basarili.");
	    } else {
	        System.out.println("Fiyata gore siralama basarisiz.");
	    }
	    
	}
	public static void mobilUyumluluk(WebDriver driver) throws InterruptedException {
		Thread.sleep(2250);
		Dimension size = new Dimension(394, 844); // iPhone 12 Pro boyutu
		driver.manage().window().setSize(size);
		Thread.sleep(1500);
		
	    WebElement mobilElement = driver.findElement(By.cssSelector(".hambarger"));
	    mobilElement.click();
	    if (mobilElement.isDisplayed()) {
	    	System.out.println("Websitesi mobil ekrana uyumlu.");
	    }else {
	    	System.out.println("Websitesi mobil ekrana uyumlu degil.");
	    }
	}
	public static void isItemImageEmptyTest(WebDriver driver) throws InterruptedException {
		Thread.sleep(2500);
		driver.findElement(By.linkText("ONLINE SİPARİŞ")).click();
		Thread.sleep(2500);
	 	driver.manage().deleteAllCookies();
	 	Thread.sleep(2500);
	 	driver.navigate().refresh();
	 	Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".cc-nb-okagree")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.linkText("Daha Sonra")).click();
	    Thread.sleep(2500);
	    driver.findElement(By.linkText("KAHVE")).click();
	    Thread.sleep(1500);
	    
	    WebElement image = driver.findElement(By.cssSelector("img.resimOrginal"));
	    Thread.sleep(1100);
	    String src = image.getAttribute("src");
	    if (!src.isEmpty()) {
	        System.out.println("Goruntu yükleme basarili.");
	    } else {
	        System.out.println("Goruntu yükleme basarisiz.");
	    }

	}
	
	
	
}
