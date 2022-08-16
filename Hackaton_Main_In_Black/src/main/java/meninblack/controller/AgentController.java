package meninblack.controller;

import jakarta.validation.Valid;
import meninblack.model.Agent;
import meninblack.model.Alien;
import meninblack.service.AgentService;
import meninblack.service.AlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Agents")
public class AgentController {


    private AgentService agentService;

    @Autowired
    public void setAlienService(AgentService agentService) {
        this.agentService = agentService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/", "", " "})
    public ResponseEntity<List<Agent>> listAgents() {
        return new ResponseEntity<>(agentService.getAgentsList(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/add"})
    public ResponseEntity<Agent> addAgent (@Valid @RequestBody Agent agent) {
        agentService.addNewAgent(agent);
        return new ResponseEntity<>(agent, HttpStatus.CREATED);
    }
    @RequestMapping(method = RequestMethod.PUT, path = {"/edit"})
    public ResponseEntity<Agent> updateAgent (@Valid @RequestBody Agent agent) {
        agentService.updateAgent(agent);
        return new ResponseEntity<>(agent, HttpStatus.ACCEPTED);
    }
    @RequestMapping(method = RequestMethod.PUT, path = {"/delete"})
    public ResponseEntity<Agent> deleteAgent (@Valid @RequestBody Agent agent) {
        agentService.delete(agent.getId());
        return new ResponseEntity<>(agent, HttpStatus.OK);
    }


}
