package controllers;

import models.Player;
import play.data.validation.*;
import play.mvc.Controller;

public class Players extends Controller {

    public static void create() {
        render();
    }

    public static void save(@Required @Email String email, @Required String motDePasse, @Required String nom, @Required String prenom) {

        if (validation.hasErrors()) {
            params.flash();
            validation.keep();
            create();
        }

        Player player = new Player();
        player.email = email;
        player.motDePasse = motDePasse;
        player.nom = nom;
        player.prenom = prenom;
        player.save();
        render(player);
    }
}
