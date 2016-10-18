package models;

import play.db.jpa.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Checkin extends Model {
	
	@ManyToOne
	public Player player;
    public Date date;
}
