package filters;

import Shipments.Shipment;

public interface Filter {
    boolean evaluate(Shipment shipment);
}
