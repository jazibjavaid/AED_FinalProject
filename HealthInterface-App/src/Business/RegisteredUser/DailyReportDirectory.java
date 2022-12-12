/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.RegisteredUser;

import java.util.ArrayList;

/**
 *
 * @author jazibjavaid
 */
public class DailyReportDirectory {
    ArrayList<DailyReportSheet> dailyReportList = new ArrayList<>();

    public ArrayList<DailyReportSheet> getDailyReportList() {
        if(dailyReportList == null){
            dailyReportList = new ArrayList<>();
        }
        return dailyReportList;
    }
     public void addDailyReport(DailyReportSheet sheet)
    {
        dailyReportList.add(sheet);
    }
    
     public void removeDailyReport(DailyReportSheet sheet)
    {
        dailyReportList.remove(sheet);
    }
}
