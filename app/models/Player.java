package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Player extends Model {

	public String email;
    public String motDePasse;
    public String nom;
    public String prenom;

}
