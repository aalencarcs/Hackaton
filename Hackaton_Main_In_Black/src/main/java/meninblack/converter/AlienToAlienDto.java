package meninblack.converter;

import meninblack.command.AlienDto;
import meninblack.model.Alien;
import meninblack.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

@Component
public class AlienToAlienDto implements Converter<Alien, AlienDto>{
    private AlienService alienService;

    @Autowired
    public void setAlienService(AlienService alienService) {
        this.alienService = alienService;
    }


    @Override
    public AlienDto convert(Alien alien) {
        AlienDto alienDto = new AlienDto();

        alienDto.setId(alien.getId());
        alienDto.setOriginName(alien.getOriginName());
        alienDto.setAlias(alien.getAlias());
        alienDto.setAge(alien.getAge());
        alienDto.setHeight(alien.getHeight());
        alienDto.setCrime(alien.getCrime());
        alienDto.setLocationLong((alien.getLocationLong()));
        alienDto.setLocationLat(alien.getLocationLat());

        return alienDto;
    }
}
