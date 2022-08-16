package meninblack.converter;

import meninblack.command.AgentDto;
import meninblack.model.Agent;
import meninblack.service.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AgentDtoToAgent implements Converter<AgentDto, Agent> {

    private AgentService agentService;

    @Autowired
    public void setAgentService(AgentService agentService) {
            this.agentService = agentService;
        }


    @Override
    public Agent convert(AgentDto agentDto) {
        Agent agent = (agentDto.getId() != null ? agentService.getAgentByID(agentDto.getId()) : new Agent());

        agent.setOriginName(agentDto.getOriginName());
        agent.setAlias(agentDto.getAlias());
        agent.setAge(agentDto.getAge());
        agent.setHeight(agentDto.getHeight());
        agent.setWeaponOfChoice((agent.getWeaponOfChoice()));

        return agent;
    }

}
