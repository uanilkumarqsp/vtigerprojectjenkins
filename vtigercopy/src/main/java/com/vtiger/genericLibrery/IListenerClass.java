package com.vtiger.genericLibrery;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class IListenerClass implements ITestListener
{   
	ExtentSparkReporter esr;
	ExtentReports er;
	ExtentTest test;
	WebDriverUtility wu = new WebDriverUtility();
	

	@Override
	public void onTestStart(ITestResult result) {
		String mname=result.getName();
		Reporter.log(" test Strated "+mname, true);
		test = er.createTest(mname);
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String mname=result.getName();
		Reporter.log(" test finished  "+mname, true);
		test.log(Status.PASS, " test finished  "+mname);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriverUtility wu = new WebDriverUtility();
		JavaUtilityClass ju = new JavaUtilityClass();
		String mname=result.getName();
		Reporter.log(" test St "+mname, true);
		String dataTime = ju.generateDateTime()+mname;
		String path = IConstant.sspath+dataTime;
		String path1 = IConstant.sspath1+dataTime+".png";
		
		String dirpath = System.getProperty("user.dir")+path1;
		
		System.out.println("++++++++++++++"+dirpath);
		
	       try {
	    	   
			wu.screenShot(Driver.getDriver(), IConstant.sspath+dataTime+".png");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		test.log(Status.FAIL, " test failed  "+mname);
		test.addScreenCaptureFromPath(IConstant.sspath+dataTime+".png");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
		String mname=result.getName();
		Reporter.log(" test Skipped "+mname, true);
		
		test.log(Status.SKIP, " test skiped  "+mname);
	}

	@Override
	public void onStart(ITestContext context) {
		String ctxtName=context.getName();
		esr = new ExtentSparkReporter(IConstant.extentPath1+ctxtName+".html");
		esr.config().setDocumentTitle("Vtiger Regression test ");
		esr.config().setTheme(Theme.STANDARD);
		esr.config().setProtocol(Protocol.HTTPS);
		esr.config().setReportName("Anil");
		
		er = new ExtentReports();
		 er.attachReporter(esr);
		 
		 er.setSystemInfo(" os ", " windows ");
		 er.setSystemInfo(" bits ", " 64 ");
		 er.setSystemInfo(" os version ", " 11 ");
		 er.setSystemInfo(" generation  ", " i7 ");
		String mname=context.getName();
		Reporter.log(" project Strated "+mname, true);
	}

	@Override
	public void onFinish(ITestContext context) {
		String mname=context.getName();
		Reporter.log(" project finished  "+mname, true);
		er.flush();
	}

}
