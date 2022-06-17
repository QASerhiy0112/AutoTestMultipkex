import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstSelenideTest {

    @Test
    public void chengeCity() {
        open("https://multiplex.ua");
        // выбрать список городов
        $ ("#tocinemas > div").click();
        // Выбрать город Днипро
        $ ("body > div.menu.right_menu.animatedlong.slideInUp > div.citylist > p:nth-child(3) > span").click();
        $ ("body > div.menu.right_menu.animatedlong.slideInUp > div.citylist > p.cityname.active").shouldHave(Condition.text("Дніпро"));
    }

    @Test
    public void checkButtonSertificate() {
        open("https://multiplex.ua");
        $ ("body > div.header.header-index > div > img").click();
        $ ("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu_list > a:nth-child(4)").click();
    }

    @Test
    public void checkOpenSideMenu() {
        open("https://multiplex.ua");
        $ ("body > div.header.header-index > div > img").click();
        $ ("body > div.left_menu.js-left-menu.on > div > ul > li.active").click();
        $ ("body > div.left_menu.js-left-menu.on > div > div.mob_container > div.menu-block > a").shouldHave(Condition.text("Увійти"));
        
        
        
    }
}

