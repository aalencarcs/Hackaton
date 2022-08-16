package meninblack.service;

import meninblack.model.Agent;
import java.util.ArrayList;
import java.util.List;

public class AgentService {
    private List<Agent> agentsList = new ArrayList(){{
        Agent alien1 = new Agent();
        Agent alien2 = new Agent();
        Agent alien3 = new Agent();
        Agent alien4 = new Agent();
        Agent alien5 = new Agent();

        alien1.setId(1);
        alien1.setOriginName("Andre");
        alien1.setAlias("Figueiredo");
        alien1.setAge(29);
        alien1.setHeight(169);
        alien1.setWeaponOfChoice("bazooka");

        alien2.setId(2);
        alien2.setOriginName("David");
        alien2.setAlias("Almeida");
        alien2.setAge(37);
        alien2.setHeight(170);
        alien2.setWeaponOfChoice("CapaGrilos");


        alien3.setId(3);
        alien3.setOriginName("Francisco");
        alien3.setAlias("Almeida");
        alien3.setAge(27);
        alien3.setHeight(180);
        alien3.setWeaponOfChoice("Fisga");


        alien4.setId(4);
        alien4.setOriginName("Arthur");
        alien4.setAlias("Alencar");
        alien4.setAge(24);
        alien4.setHeight(184);
        alien4.setWeaponOfChoice("Dildo");


        alien5.setId(5);
        alien5.setOriginName("Michael");
        alien5.setAlias("Ferreira");
        alien5.setAge(33);
        alien5.setHeight(170);
        alien5.setWeaponOfChoice("MocaDeRioMaior");

        add(alien1);
        add(alien2);
        add(alien3);
        add(alien4);
        add(alien5);
    }};

    public Agent getAgentByID(Integer id) {
        Agent aux = new Agent();

        for (Agent alien1 : agentsList) {
            if (alien1.getId() == id) {
                aux = alien1;
            }
        }
        return aux;
    }

    public List<Agent> getAgentsList() {
        return agentsList;
    }

    public Agent addNewAgent(Agent agent) {
        agentsList.add(agent);
        return agent;
    }

    public Agent updateAgent(Agent agent) {
        for (int i = 0; i < agentsList.size(); i++) {
            if (agentsList.get(i).getId().equals(agent.getId())) {
                agentsList.get(i).setOriginName(agent.getOriginName());
                agentsList.get(i).setAlias(agent.getAlias());
                agentsList.get(i).setAge(agent.getAge());
                agentsList.get(i).setHeight(agent.getHeight());
                agentsList.get(i).setWeaponOfChoice(agent.getWeaponOfChoice());

            }
        }
        return agent;
    }

    public void delete(Integer id) {
        for (int i = 0; i < agentsList.size(); i++) {
            if (agentsList.get(i).getId().equals(id)) {
                agentsList.remove(agentsList.get(i));
            }
        }
    }
}

