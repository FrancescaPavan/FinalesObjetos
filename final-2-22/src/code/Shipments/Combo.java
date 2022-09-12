package Shipments;

import filters.Filter;

import java.util.ArrayList;

public class Combo extends Shipment{

    private ArrayList<Shipment> shipments;
    private Filter condition;

    public Combo(Filter condition, Long trackingNmbr){
        super(trackingNmbr);
        this.condition = condition;
        this.shipments = new ArrayList<>();
    }

    public void addShipment(Shipment s){
        if (condition.evaluate(s)) {
            s.setTrackingNmbr(this.getTrackingNmbr());
            shipments.add(s);

        }
        else
            System.out.print("Sorry, that shipment doesn't comply with this combo's requisites");
    }

    @Override
    public String getSender() {
        return shipments.get(0).getSender();
    }

    @Override
    public String getOrigin() {
        return shipments.get(0).getOrigin();
    }

    @Override
    public Double getWeight() {
        Double weight = 0d;
        for (Shipment s : shipments){
            weight += s.getWeight();
        }
        return weight;
    }

    @Override
    public String getDestination() {
        return shipments.get(0).getDestination();
    }
}
