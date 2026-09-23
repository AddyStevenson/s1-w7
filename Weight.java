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

}
 