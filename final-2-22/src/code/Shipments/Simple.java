package Shipments;

public class Simple extends Shipment{

    private String destination;
    private String sender;
    private String origin;
    private Double weight;

    public Simple(String recipient, String sender,String origin, Double weight, Long trackingNmbr){
        super(trackingNmbr);
        this.destination = recipient;
        this.sender = sender;
        this.origin = origin;
        this.weight = weight;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    @Override
    public String getSender() {
        return this.sender;
    }

    @Override
    public String getOrigin() {
        return this.origin;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public String getDestination() {
        return this.destination;
    }
}
