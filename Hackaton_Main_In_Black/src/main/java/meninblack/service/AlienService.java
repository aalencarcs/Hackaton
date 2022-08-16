package meninblack.service;


import meninblack.model.Alien;

import java.util.ArrayList;
import java.util.List;

public class AlienService {
    private List <Alien> aliensList = new ArrayList(){{
        Alien alien1 =new Alien();
        Alien alien2 =new Alien();
        Alien alien3 = new Alien();
        Alien alien4 = new Alien();
        Alien alien5 = new Alien();

        alien1.setId(1);
        alien1.setOriginName("Luis");
        alien1.setAlias("HomemEstupendo");
        alien1.setAge(33);
        alien1.setHeight(180);
        alien1.setLocationLat(38.714710);
        alien1.setLocationLong(-9.45830);
        alien1.setCrime("Murder");

        alien2.setId(2);
        alien2.setOriginName("Pedro");
        alien2.setAlias("Jeronimo");
        alien2.setAge(29);
        alien2.setHeight(178);
        alien2.setLocationLat(38.714710);
        alien2.setLocationLong(-9.45830);
        alien2.setCrime("Abortion");

        alien3.setId(3);
        alien3.setOriginName("Joana");
        alien3.setAlias("Ferreira");
        alien3.setAge(27);
        alien3.setHeight(150);
        alien3.setLocationLat(38.714710);
        alien3.setLocationLong(-9.45830);
        alien3.setCrime("Rape");

        alien4.setId(4);
        alien4.setOriginName("Cat");
        alien4.setAlias("Candido");
        alien4.setAge(25);
        alien4.setHeight(160);
        alien4.setLocationLat(38.714710);
        alien4.setLocationLong(-9.45830);
        alien4.setCrime("Abduction");

        alien5.setId(5);
        alien5.setOriginName("Brigida");
        alien5.setAlias("Oleiro");
        alien5.setAge(27);
        alien5.setHeight(160);
        alien5.setLocationLat(38.714710);
        alien5.setLocationLong(-9.45830);
        alien5.setCrime("Murder");

        add(alien1);
        add(alien2);
        add(alien3);
        add(alien4);
        add(alien5);
    }};

    public Alien getAlienByID(Integer id) {
        Alien aux=new Alien();

        for (Alien alien1 : aliensList) {
            if (alien1.getId() == id) {
                aux = alien1;
            }
        }
        return aux;
    }

    public List<Alien> getAliensList() {
        return aliensList;
    }

    public Alien addNewAlien(Alien alien) {
        aliensList.add(alien);
        return alien;
    }

    public Alien updateAlien(Alien alien) {
        for (int i = 0; i < aliensList.size(); i++) {
            if (aliensList.get(i).getId().equals(alien.getId())) {
                aliensList.get(i).setOriginName(alien.getOriginName());
                aliensList.get(i).setAlias(alien.getAlias());
                aliensList.get(i).setAge(alien.getAge());
                aliensList.get(i).setHeight(alien.getHeight());
                aliensList.get(i).setCrime(alien.getCrime());
                aliensList.get(i).setLocationLat(alien.getLocationLat());
                aliensList.get(i).setLocationLong(alien.getLocationLong());

            }
        }
        return alien;
    }

    public void delete(Integer id) {
        for (int i = 0; i < aliensList.size(); i++) {
            if (aliensList.get(i).getId().equals(id)) {
                aliensList.remove(aliensList.get(i));
            }
        }
    }
}
