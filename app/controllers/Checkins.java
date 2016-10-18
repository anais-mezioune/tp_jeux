package controllers;

import java.time.LocalDate;
import java.util.Date;

import models.Checkin;
import play.data.validation.*;
import play.mvc.Controller;

public class Checkins extends Controller {

    public static void create() {
        render();
    }

    public static void save(@Required Float topLatitude, @Required Float topLongitude) {

        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Checkin checkin = new Checkin();
        checkin.date = new Date();
        checkin.save();
        render(checkin);
    }
}
