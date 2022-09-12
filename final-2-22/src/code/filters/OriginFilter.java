package filters;

import Shipments.Shipment;

public class originFilter implements Filter{
    private String origin;

    public originFilter(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean evaluate(Shipment shipment) {
        return shipment.getOrigin().equals(this.origin);
    }
}
