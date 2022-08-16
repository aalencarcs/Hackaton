package meninblack.converter;

import meninblack.command.AlienDto;
import meninblack.model.Alien;
import meninblack.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class AlienDtoToAlien implements Converter<AlienDto, Alien> {

    private AlienService alienService;

    @Autowired
    public void setAlienService(AlienService alienService) {
        this.alienService = alienService;
    }


    @Override
    public Alien convert(AlienDto alienDto) {
        Alien alien = (alienDto.getId() != null ? alienService.getAlienByID(alienDto.getId()) : new Alien());


        alien.setOriginName(alienDto.getOriginName());
        alien.setAlias(alienDto.getAlias());
        alien.setAge(alienDto.getAge());
        alien.setHeight(alienDto.getHeight());
        alien.setCrime(alienDto.getCrime());
        alien.setLocationLong((alienDto.getLocationLong()));
        alien.setLocationLat(alienDto.getLocationLat());

        return alien;
    }
}
