package com.example.lenovo.laboratoriumpum3;

/**
 * Created by LENOVO on 19.12.2017.
 */

public class Place {

    private int temperature;
    private String pleaceName;
    private String information;


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getPleaceName() {
        return pleaceName;
    }

    public void setPleaceName(String pleaceName) {
        this.pleaceName = pleaceName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

Place(int temperature,String pleaceName,String information)
{
    this.temperature = temperature;
    this.pleaceName = pleaceName;
    this.information = information;
}




}
