package Day2;

public class myMethod {
    public static double calPer (double mark , double fullMark){
        return (mark / fullMark * 100);
    }


    public static String getStatus(double pct){
        if (pct > 85) return "EXCELLENT" ;
        else if (pct > 75) return "v.good" ;
        else if (pct > 65) return "good" ;
        else if (pct >= 50) return "pass" ;
        else  return "faild";

    }
}
