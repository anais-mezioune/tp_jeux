package controllers;

import models.Zone;
import play.data.validation.*;
import play.mvc.Controller;

public class Zones extends Controller {

    public static void create() {
        render();
    }

    public static void save(@Required Float topLatitude, Float bottomLatitude, @Required Float topLongitude, Float bottomLongitude) {

        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Zone zone = new Zone(topLatitude, topLongitude);
        zone.topLatitude = topLatitude;
        zone.bottomLatitude = bottomLatitude;
        zone.topLongitude = topLongitude;
        zone.bottomLongitude = bottomLongitude;
        zone.save();
        render(zone);
    }
}
