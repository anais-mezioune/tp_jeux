package models;

import play.db.jpa.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Checkin extends Model {
	
	@ManyToOne
	public Player player;
	@OneToOne
	public Zone zone;
    public Date date;
    
   
}
