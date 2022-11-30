/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Tester;

/**
 *
 * @author jazibjavaid
 */
public class Tests {
    
    private String testName;
    private String reportingTime;
    private String status;
    private String testReportingDate;
    private String testResult;
    private String TestRemark;

    public Tests(String testName, String reportingTime) {
        this.testName = testName;
        this.reportingTime = reportingTime;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(String reportingTime) {
        this.reportingTime = reportingTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTestReportingDate() {
        return testReportingDate;
    }

    public void setTestReportingDate(String testReportingDate) {
        this.testReportingDate = testReportingDate;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getTestRemark() {
        return TestRemark;
    }

    public void setTestRemark(String TestRemark) {
        this.TestRemark = TestRemark;
    }
    
    @Override
    public String toString() {
        return testName;
    }
}
