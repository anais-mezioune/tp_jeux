package controllers;

import java.time.LocalDate;
import java.util.Date;

import models.Checkin;
import models.Zone;
import play.data.validation.*;
import play.mvc.Controller;

public class Checkins extends Controller {

    public static void create() {
        render();
    }

    public static void save(@Required Float coordonneeLatitude, @Required Float coordonneeLongitude) {

        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Checkin checkin = new Checkin();
        Zone zone = new Zone(coordonneeLatitude, coordonneeLongitude);
        checkin.date = new Date();
        checkin.save();
        render(checkin);
    }
    
    public static void ajout(){
    	create();
    }
}
