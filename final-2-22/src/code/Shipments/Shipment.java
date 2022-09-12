package Shipments;

public abstract class Shipment {
    private Long trackingNmbr;

    public Shipment(Long trackingNmbr){
        this.trackingNmbr = trackingNmbr;
    }

    public void setTrackingNmbr(Long newNmbr){
        this.trackingNmbr = newNmbr;
    }

    public Long getTrackingNmbr(){
        return this.trackingNmbr;
    }

    public abstract String getSender();
    public abstract String getOrigin();
    public abstract Double getWeight();
    public abstract String getDestination();

}
