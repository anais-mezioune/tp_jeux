package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Zone extends Model {

    public Integer minX;
    public Integer maxX;
    public Integer minY;
    public Integer maxY;
    
    public Ressource ressource;

    public Zone(Float coordonneeLatitude, Float coordonneeLongitude){
    	Integer reste_minX = (int)coordonneeLatitude.floatValue() % 10;
    	Integer reste_minY = (int)coordonneeLongitude.floatValue() % 10;
    	this.minX = (int)coordonneeLatitude.floatValue() - reste_minX;
    	this.minY = (int)coordonneeLongitude.floatValue() - reste_minY;
    	this.maxX = this.minX + 10;
    	this.maxY = this.minY + 10;
    	this.ressource = Ressource.getRandomRessource();
    	
    }
}
