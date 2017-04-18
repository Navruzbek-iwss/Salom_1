package package2;

/**
 * Created by User on 011 11.04.17.
 */
public class WeightBox extends Box
{
    double weight;
    WeightBox(WeightBox obj)
    {
        super(obj);
        weight = obj.weight;
    }

   WeightBox(double weight)
   {
       this.weight = weight;
   }

    public WeightBox(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public WeightBox(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
