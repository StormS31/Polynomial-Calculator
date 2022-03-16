package Assig1.Model;
import java.util.ArrayList;
import java.util.List;

public class Polinom{
    ArrayList<Monom> mon;

    public void toString_2Out() {
        boolean i = false;
        for (Monom a: this.mon) {
            System.out.print(a.toString(i));
            i = true;
        }
    }
    public String toString_2() {
        boolean i = false;
        String result = "";
        for (Monom a: this.mon) {
            if(a.getCoef() != 0)
                 result += a.toString(i);
            i = true;
        }
        return result;
    }

    public List<Monom> getMon() {
        return mon;
    }

    public void setMon(ArrayList<Monom> mon) {
        this.mon = mon;
    }
    public Polinom() {
        mon = new ArrayList<Monom>();
    }
    public Polinom(ArrayList<Monom> mon) {
        this.mon = new ArrayList<Monom>();
        this.mon = mon;
    }
    public void add(Monom a)
    {
        mon.add(a);
    }
}
