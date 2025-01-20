package entities;

import java.util.Date;

public class HourContract {
    Date date;
    Double valuePerHour;
    Integer hour;

    public HourContract() {

    }


    @Override
    public String toString() {
        return "contracts{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hour=" + hour +
                '}';
    }

    public HourContract(Date date, Double valuePerHour, Integer hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public double calculateContract (){
        return valuePerHour * hour;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }
}
