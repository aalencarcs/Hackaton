package meninblack.converter;

import meninblack.command.AgentDto;
import meninblack.model.Agent;
import meninblack.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AgentToAgentDto implements Converter<Agent, AgentDto> {


    private AgentService agentService;

    @Autowired
    public void setCustomerService(AgentService agentService) {
        this.agentService = agentService;
    }


    @Override
    public AgentDto convert(Agent agent) {

        AgentDto agentDto = new AgentDto();
        agentDto.setId(agent.getId());
        agentDto.setOriginName(agent.getOriginName());
        agentDto.setAlias(agent.getAlias());
        agentDto.setAge(agent.getAge());
        agentDto.setHeight(agent.getHeight());
        agentDto.setWeaponOfChoice(agentDto.getWeaponOfChoice());

        return agentDto;
    }


}
