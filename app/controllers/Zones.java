package controllers;

import models.Zone;
import play.data.validation.*;
import play.mvc.Controller;

public class Zones extends Controller {

    public static void create() {
        render();
    }

    public static void save(@Required Float coordonneeLatitude, @Required Float coordonneeLongitude) {

        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Zone zone = new Zone(coordonneeLatitude, coordonneeLongitude);
        zone.save();
        render(zone);
    }
}
