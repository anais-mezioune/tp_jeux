package controllers;

import play.*;
import play.mvc.*;

import java.time.LocalDateTime;
import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	// 
    	List<Checkin> checkins = Checkin.find("player.id = 1 order by date desc").fetch(10);
    	render(checkins);
    }
    
    public static void checkin(Float coordonneeLatitude, Float coordonneeLongitude) {
        Player player = Player.findById(1L);
        
        if(player == null){
    		player = new Player();
    		player.email = "un-mail@gmail.com";
    		player.nom = "un-nom";
    		player.prenom = "un-prenom";
    		player.motDePasse = "un-mot-de-passe";

        	player.save();
    	}
    	
        Zone zone = new Zone(coordonneeLatitude, coordonneeLongitude);
    	Checkin checkin = new Checkin();
        
    	checkin.date = new Date();
        checkin.player = player;
        checkin.zone = zone;
    	zone.save();
        checkin.save();
    	index(); 
    }
    

}