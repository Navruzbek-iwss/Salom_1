package package2;

/**
 * Created by User on 013 13.04.17.
 */
public class Shipment extends WeightBox
{
    double cost;

    public Shipment(double width, double height, double depth, double weight, double cost) {
        super(width, height, depth, weight);
        this.cost = cost;
    }

    Shipment(Shipment obj)
    {
        super(obj);
        cost = obj.cost;
    }
}
