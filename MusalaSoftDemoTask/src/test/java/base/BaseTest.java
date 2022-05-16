package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;


public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected CareersPage careersPage;
    protected ContactUsPage contactUsPage;
    protected CompanyPage companyPage;
    protected JoinUsPage joinUsPage;
    protected JobsPage jobsPage;


    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.musala.com/");
        System.out.println(driver.getTitle());

        homePage = new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        careersPage = new CareersPage(driver);
        joinUsPage = new JoinUsPage(driver);
        companyPage = new CompanyPage(driver);
        jobsPage = new JobsPage(driver);
    }




    @AfterClass
    public void tearDown() {
        driver.quit();
    }


}
