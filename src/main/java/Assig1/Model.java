package Assig1;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model {
    private Polinom polA;
    private Polinom polB;
    Model(){
        polA = new Polinom();
        polB = new Polinom();
    }
    public void descPolinoame(String t1, String t2)
    {
        Polinom pA = new Polinom();
        Polinom pB = new Polinom();
        Pattern p = Pattern.compile( "(-?\\+?\\d+\\.?\\d*)?([xX])?((\\^)(-?\\d+\\.?\\d*))?" );
        Matcher m = p.matcher( t1 );
        if(t1.length() != 0)
            while(m.find()) {
                if (m.group(5) != null && m.group(1) != null)
                    pA.add(new Monom(Double.parseDouble(m.group(1)), Double.parseDouble(m.group(5))));
                else if (m.group(5) == null && m.group(1) != null) {
                    if (m.group(2) != null)
                        pA.add(new Monom(Double.parseDouble(m.group(1)), 1));
                    else pA.add(new Monom(Double.parseDouble(m.group(1)), 0));
                } else if (m.group(1) == null && m.group(5) != null)
                    pA.add(new Monom(1, Double.parseDouble(m.group(5))));
            }
        m = p.matcher( t2 );
        if(t2.length() != 0)
            while(m.find())
            {
                if(m.group(5) != null && m.group(1) != null)
                    pB.add(new Monom(Double.parseDouble(m.group(1)), Double.parseDouble(m.group(5))));
                else if (m.group(5) == null && m.group(1) != null) {
                    if (m.group(2) != null)
                        pB.add(new Monom(Double.parseDouble(m.group(1)), 1));
                    else  pB.add(new Monom(Double.parseDouble(m.group(1)), 0));
                }
                else if (m.group(1) == null && m.group(4) != null)
                    pB.add(new Monom(1, Double.parseDouble(m.group(5))));
             }
        polA = pA;
        polB = pB;
    }

    public Polinom aduna(Polinom polA, Polinom polB)
    {
        polA.toString_2Out();
        polB.toString_2Out();
        Polinom polC = new Polinom();
        int index1 = -1;
        List<Monom> ma = polA.getMon();
        for(int i=0; i<ma.size(); i++)
        {
            double sumCoef = ma.get(i).getCoef(), exp = ma.get(i).getPow();
            for(int k = i+1; k<ma.size(); k++)
            {
                if(ma.get(k).getPow() == exp)
                {
                    sumCoef += ma.get(k).getCoef();
                    ma.remove(k--);
                }
            }
            List<Monom> mb = polB.getMon();
            for(int j=0; j<mb.size(); j++)
            {
                if(mb.get(j).getPow() == exp)
                {
                    sumCoef += mb.get(j).getCoef();
                    mb.remove(j--);
                }
            }
            ma.remove(i--);
            polC.add(new Monom(sumCoef, exp));
        }
        ma=polB.getMon();
        for(int i=0; i<ma.size(); i++)
        {
            double sumCoef = ma.get(i).getCoef(), exp = ma.get(i).getPow();
            for(int k = i+1; k<ma.size(); k++)
            {
                if(ma.get(k).getPow() == exp)
                {
                    sumCoef += ma.get(k).getCoef();
                    ma.remove(k--);
                }
            }
            List<Monom> mb = polA.getMon();
            for(int j=0; j<mb.size(); j++)
            {
                if(mb.get(j).getPow() == exp)
                {
                    sumCoef += mb.get(j).getCoef();
                    mb.remove(j--);
                }
            }
            ma.remove(i--);
            polC.add(new Monom(sumCoef, exp));
        }

        return polC;
    }

    public String addPolinoame(String t1, String t2)
    {
        String result;
        descPolinoame(t1, t2);
        Polinom polC = new Polinom();
        polC = aduna(polA, polB);
        Collections.sort(polC.getMon());
        result = polC.toString_2();
        return result;
    }

    public Polinom scade(Polinom polA, Polinom polB)
    {
        Polinom polC = new Polinom();
        int index1 = -1;
        List<Monom> ma = polA.getMon();
        for(int i=0; i<ma.size(); i++)
        {
            double sumCoef = ma.get(i).getCoef(), exp = ma.get(i).getPow();
            for(int k = i+1; k<ma.size(); k++)
            {
                if(ma.get(k).getPow() == exp)
                {
                    sumCoef += ma.get(k).getCoef();
                    ma.remove(k--);
                }
            }
            List<Monom> mb = polB.getMon();
            for(int j=0; j<mb.size(); j++)
            {
                if(mb.get(j).getPow() == exp)
                {
                    sumCoef -= mb.get(j).getCoef();
                    mb.remove(j--);
                }
            }
            ma.remove(i--);
            polC.add(new Monom(sumCoef, exp));
        }
        ma=polB.getMon();
        for(int i=0; i<ma.size(); i++)
        {
            double sumCoef = ma.get(i).getCoef(), exp = ma.get(i).getPow();
            for(int k = i+1; k<ma.size(); k++)
            {
                if(ma.get(k).getPow() == exp)
                {
                    sumCoef += ma.get(k).getCoef();
                    ma.remove(k--);
                }
            }
            List<Monom> mb = polA.getMon();
            for(int j=0; j<mb.size(); j++)
            {
                if(mb.get(j).getPow() == exp)
                {
                    sumCoef -= mb.get(j).getCoef();
                    mb.remove(j--);
                }
            }
            ma.remove(i--);
            polC.add(new Monom(sumCoef, exp));
        }

        return polC;
    }

    public String subPolinoame(String t1, String t2)
    {
        String result;
        descPolinoame(t1, t2);
        Polinom polC = new Polinom();
        polC = scade(polA, polB);
        Collections.sort(polC.getMon());
        result = polC.toString_2();
        return result;
    }

    public Polinom deriveaza(Polinom polA)
    {
        Polinom polC = new Polinom();
        polC = aduna(polA, new Polinom());
        Collections.sort(polC.getMon());
        for(Monom mon:polC.getMon())
        {
            mon.setCoef(mon.getCoef() * mon.getPow());
            if(mon.getPow() != 0)
                mon.setPow(mon.getPow() - 1);
        }
        return polC;
    }

    public String deriveazaPolinoame(String t1)
    {
        String result;
        descPolinoame(t1, "");
        polA.toString_2Out();
        Polinom polC;
        polC = deriveaza(polA);
        polC.toString_2Out();
        result = polC.toString_2();
        System.out.println(result);
        return result;
    }

    public Polinom integreaza(Polinom polA)
    {
        Polinom polC = new Polinom();
        polC = aduna(polA, new Polinom());
        Collections.sort(polC.getMon());
        for(Monom mon:polC.getMon())
        {
            mon.setPow(1 + mon.getPow());
            mon.setCoef(mon.getCoef() / mon.getPow());
        }
        return polC;
    }

    public String integreazaPolinoame(String t1)
    {
        String result;
        descPolinoame(t1, "");
        polA.toString_2Out();
        Polinom polC;
        polC = integreaza(polA);
        polC.toString_2Out();
        result = polC.toString_2();
        System.out.println(result);
        return result;
    }

    public Polinom multiplica(Polinom polA, Polinom polB)
    {
        Polinom polC = new Polinom();
        for(Monom a: polA.getMon())
        {
            for(Monom b: polB.getMon())
            {
                polC.getMon().add(new Monom(a.getCoef() * b.getCoef(), a.getPow() + b.getPow()));
            }
        }
        polC = aduna(polC, new Polinom());
        System.out.println();
        return polC;
    }

    public String multiplicaPolinoame(String t1, String t2){

        String result;
        descPolinoame(t1, t2);
        //polA.toString_2Out();
        Polinom polC;
        polC = multiplica(polA, polB);
        //System.out.println("1");
        //polC.toString_2Out();
        //System.out.println("2");
        result = polC.toString_2();
        //System.out.println(result);
        return result;
    }
}
