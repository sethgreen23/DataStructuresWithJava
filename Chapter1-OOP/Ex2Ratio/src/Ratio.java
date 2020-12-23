/*
 * here we implemented the interface
 * Comparable by the Ratio class
 * and we implemented its campareTo() 
 * function and override the equals function
 * */
class Ratio implements Comparable{
    private int num;
    private int den;
    
    public static final Ratio ZERO = new Ratio();
    private Ratio(){
        num = 0;
        den = 1;
    }
    
    public Ratio(int num , int den){
        if(num==0){
            throw new IllegalArgumentException("use Ratio.ZERO");
        }
        this.num = num;
        this.den = den;
    }
    
    public double value(){
        return (double)num/den;
    }
    
    public String toString(){
        return num+"/"+den;
    }
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }else if(!(obj instanceof Ratio)){
            return false;
        }
        
        Ratio that = (Ratio)obj;
        return (this.num*that.den==this.den*that.num);
    }
    
    public int compareTo(Object obj){
        if(this==obj){
            return 0;
        }else if(!(obj instanceof Ratio)){
            throw new IllegalArgumentException("the object is not a ratio");
        }
        Ratio that = (Ratio) obj;
        normalize(this);
        normalize(that);
        System.out.println(this+"*****"+that);
        return (this.num*that.den)-(this.den*that.num);
    }
    
    private void normalize(Ratio x){
        if(x.num==0){
            x.den=1;
        }else if(x.den<0){
            x.den*=-1;
            x.num*=-1;
        }
    }
    
}