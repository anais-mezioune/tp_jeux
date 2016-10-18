package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Zone extends Model {

    public Float topLatitude;
    public Float bottomLatitude;
    public Float topLongitude;
    public Float bottomLongitude;

    public Zone(Float topLatitude, Float topLongitude){
    	this.topLatitude = topLatitude;
    	this.topLongitude = topLongitude;
    	
    }
}
