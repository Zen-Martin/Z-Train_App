package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class FavorisPage extends Page{

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]")
    private MobileElement favorisView;

    public void clickOnFavoris(){
        click(favorisView);
    }

    public boolean verifyFavorisContain(){
        try{
            shortWaitUntil(visibilityOf(favorisView));
            return (favorisView.isDisplayed());
        }catch (Exception e){
            return false;
        }
    }

}