package agents;

import jade.core.Agent;

public class Broker extends Agent {

    int cumulativeExpenses = 0;
    int cumulativeEarnings = 0;

    @Override
    protected void setup() {
        super.setup();
        System.out.println("Broker " + this.getLocalName() + " was created.");
    }

    @Override
    protected void takeDown() {
        super.takeDown();
    }
}
