package Assig1.Model;
public class Monom implements Comparable<Monom>{
    private double coef;
    private double pow;

    public String toString(boolean i) {
        if(coef > 0)
        {if(pow!=0 && pow != 1) {
                if (i != false)
                    return "+ " + coef + "x^" + pow + " ";
                else return coef + "x^" + pow + " ";
            }
            else if(pow == 0){
                if (i != false)
                    return "+ " + coef;
                else return coef + "";
            }
            else if(pow == 1)
            {
                if (i != false)
                    return "+ " + coef + "x";
                else return coef + "x";
            }
        }
        else if(coef < 0)
        {
            if(pow!=0 && pow != 1) {
                    return coef + " x^" + pow + " ";
            }
            else if(pow == 0){
                    return coef + " ";
            }
            else if(pow == 1)
            {
                return coef + " x";
            }
        }
        return 0+"";
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public void setCoef(double coef) {
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    public double getPow() {
        return pow;
    }

    public Monom(double coef, double pow) {
        this.coef = coef;
        this.pow = pow;
    }
    public int compareTo(Monom a)
    {
        if(this.pow > a.getPow())
            return -1;
        return 1;
    }
}
