public class Weight {
    public int pounds; 
    public int ounces;

public Weight(int ounces){
   this(ounces, 0);

}

public Weight(int pounds, int ounces){
    if(ounces >= 0){
        if(ounces <16){
            this.ounces = ounces;
        }
    }
    if(pounds > 0)
        this.pounds = pounds;
}
public int totalOunces(){
    return this.ounces + 16 * this.pounds;
}

public boolean isHeavier(Weight other){
    int totalW = totalOunces();
    int otherW = other.totalOunces();
    if(totalW > otherW)
        return true;
    else 
        return false;
}
public Weight multiple(int scale){
     int total = this.totalOunces() * scale; 
     int p = total / 16;
     int o = total % 16;
     return new Weight(o, p);
}

public void print(){
    System.out.println(this.pounds + "pounds, " + this.ounces + " ounces");
}



}