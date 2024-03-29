package tw.org.cic.morsenser_example_api;

/**
 * Created by Linquas on 2015/10/30.
 */
public class Location {

    private int id;
    private float lattitude;
    private float lontitude;
    private float temp;
    private float humid;
    private float elevation;
    private String cityName;
    private String townName;
    private String ID;

    public float getElevation() {
        return elevation;
    }

    public String getID() {
        return ID;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getId() {
        return id;
    }

    public float getHumid() {
        return humid;
    }

    public float getLattitude() {
        return lattitude;
    }

    public float getLontitude() {
        return lontitude;
    }

    public float getTemp() {
        return temp;
    }

    public String getCityName() {
        return cityName;
    }

    public String getTownName() {
        return townName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setHumid(float humid) {
        this.humid = humid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public void setLontitude(float lontitude) {
        this.lontitude = lontitude;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

}
