package code.filters;

import code.Address;
import code.Shipments.Shipment;

public class DestinationFilter implements Filter{

    private Address destination;

    public DestinationFilter(Address destination){
        this.destination = destination;
    }
    @Override
    public boolean evaluate(Shipment shipment) {
        return shipment.getDestination().getCity().equals(this.destination);
    }
}
