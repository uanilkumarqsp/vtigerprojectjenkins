package com.vtiger.genericLibrery;

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

public class IListenerReference implements ITestListener {

	
	ExtentSparkReporter esr;
	ExtentReports er;
	ExtentTest test1;
	@Override
	public void onTestStart(ITestResult result) 
	{
	  String mName= result.getName();
	  Reporter.log(" Test has Started "+mName,true);
	  test1 = er.createTest(mName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		  String mName= result.getName();
		  Reporter.log(" Test has Successed "+mName,true);
		  test1.log(Status.PASS, "Test has Successed "+mName);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		  String mName= result.getName();
		  Reporter.log(" Test has Failed "+mName,true);
		  test1.log(Status.FAIL, " Test has Failed "+mName);
	}

	@Override
	public void onTestSkipped(ITestResult result) {

		  String mName= result.getName();
		  Reporter.log(" Test has Skipped "+mName,true);
		  test1.log(Status.SKIP, " Test has Skipped "+mName);
	}

	@Override
	public void onStart(ITestContext context) {
		  esr = new ExtentSparkReporter("./Reports2/t2.html");
		  esr.config().setDocumentTitle(" fun ");
		  esr.config().setReportName(" anil ");
		  esr.config().setTheme(Theme.DARK);
		  esr.config().setProtocol(Protocol.HTTPS);
		  
		  er = new ExtentReports();
		  er.attachReporter(esr);
		  
		  er.setSystemInfo(" os ", " windows ");
			 er.setSystemInfo(" bits ", " 64 ");
			 er.setSystemInfo(" os version ", " 11 ");
			 er.setSystemInfo(" generation  ", " i7 ");
			 String mName= context.getName();
			 Reporter.log(" project has Started "+mName,true);
	}

	@Override
	public void onFinish(ITestContext context) {
		 String mName= context.getName();
		  Reporter.log(" project has finished "+mName,true);
		  er.flush();
	}

}
