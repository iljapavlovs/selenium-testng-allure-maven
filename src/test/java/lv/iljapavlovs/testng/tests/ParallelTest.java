//package lv.iljapavlovs.testng.tests;
//
//import lv.iljapavlovs.testng.core.DriverFactory;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
//
//import static lv.iljapavlovs.testng.base.DriverBase.getDriver;
//
///**
// * Created by ilya.pavlov on 3/9/2017.
// */
//public class ParallelTest {
//
//    @Test(groups = "regression")
//    public void test1() throws InterruptedException {
//        System.out.println("test1 started");
//        DriverFactory.setLocalDriverSystemProperties();
//        WebDriverFactory.setDefaultCapabilities(DesiredCapabilities.firefox());
//        getDriver().get("http://google.lv");
//        Thread.sleep(5000);
//        System.out.println("test1 finished");
//    }
//
//    @Test(groups = "regression")
//    public void test2() throws InterruptedException {
//        System.out.println("test2 started");
//        DriverFactory.setLocalDriverSystemProperties();
//        WebDriverFactory.setDefaultCapabilities(DesiredCapabilities.firefox());
//        getDriver().get("http://google.lv");
//        Thread.sleep(5000);
//        System.out.println("test2 finished");
//    }
//
//    @Test(groups = "regression")
//    public void test3() throws InterruptedException {
//        System.out.println("test3 started");
//        DriverFactory.setLocalDriverSystemProperties();
//        WebDriverFactory.setDefaultCapabilities(DesiredCapabilities.firefox());
//        getDriver().get("http://google.lv");
//        Thread.sleep(5000);
//        System.out.println("test3 finished");
//    }
//
//    @Test(groups = "regression")
//    public void test4() throws InterruptedException {
//        System.out.println("test4 started");
//        DriverFactory.setLocalDriverSystemProperties();
//        WebDriverFactory.setDefaultCapabilities(DesiredCapabilities.firefox());
//        getDriver().get("http://google.lv");
//        Thread.sleep(5000);
//        System.out.println("test4 finished");
//    }
//}
