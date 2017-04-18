package package4;

/**
 * Created by User on 016 16.04.17.
 */
public class Point2D
{
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D()
    {
        x = y = -1;
    }

    public Point2D(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    public void setX(float x)
    {
        this.x = x;
    }
    public float getX()
    {
        return x;
    }
    public void setY(float y)
    {
        this.y = y;
    }
    public float getY()
    {
        return y;
    }

    public void setXY(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float[] getXY()
    {
        float array[] = new float[2];
        array[0] = this.getX();
        array[1] = this.getY();
        return array;
    }
    public String toString()
    {
        return "(" + getX() + "," + getY() +  ")";
    }

}
