package day_34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy Search Smoke Test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsDisplayed();
        System.out.println("Etsy Search Test completed - Pass ");
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome Browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigate to Etsy.com");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Pass: Verify Etsy home page is displayed ");
        System.out.println("Type: 'Wooden Spoon' is search field and click search ");
    }
    public static void verifyResultsDisplayed(){
        System.out.println("Pass: Search results are successfully displayed ");
    }



}
