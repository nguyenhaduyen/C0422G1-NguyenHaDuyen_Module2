package ss4_huong_doi_tuong.bai_tap;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    public StopWatch () {
        this.startTime = new Date();
        this.endTime = new Date ();
    }
    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start(){ //phuong thuc der set thoi gian
        this.startTime = new Date();
    }
    public void stop(){
        this.endTime=new Date();
    }
    public long getElapsedTime (){
        return endTime.getTime() - startTime.getTime();
    }
}
