class Ratio{
    
    private int num;
    private int den;
    public static final Ratio ZERO= new Ratio();
    
    private Ratio(){
    	//if we used this(0,1); we will get another error because 
    	//in this situation we are calling implicitly the constructor with arguments
    	//that why we initialize the fields
        num=0;
        den=1;
    }
    
    //if we introduce a numerator as 0 then 
    //we show that instead it is better to use the Ratio.ZERO istead
    public Ratio(int num, int den){
        if(num==0){
            throw new IllegalArgumentException("use Ratio.ZERO"); 
        }
        this.num=num;
        this.den=den;
    }
    
    //getters 
    public int getNum(){
        return num;
    }
    
    public int getDen(){
        return den;
    }
    
    //to string 
    public String toString(){
        return String.format("%d/%d",num,den);
    }
    
    //equals function
    public boolean equals(Object object){
        if(this==object){
            return true;
        }else if(!(object instanceof Ratio)){
            return false;
        }
        
        Ratio that = (Ratio)object;
        return (this.num*that.den==this.den*that.num);
    }
    
   //get the value of ratio
   public double value() {
	   return (double) num/den;
   }
    
	public static void main(String[] args) {
	    System.out.println("Zero : "+Ratio.ZERO);
	    System.out.println("Zero Value: "+Ratio.ZERO.value());
	    System.out.println();
	    Ratio r = new Ratio(5,8);
	    System.out.println("The ratio of 5 per 8 :"+r+"\nIt has a value of: "+r.value());
	    System.out.println();
	    Ratio r2 = new Ratio(5,8);
	    System.out.println("The ratio of 5 per 8 :"+r2+"\nIt has a value of: "+r2.value()+"\nIs "+r+" is equal to "+r2+" :"+r.equals(r2));
	    System.out.println();
	    Ratio r3 = new Ratio(3,16);
	    System.out.println("The ratio of 5 per 8 :"+r3+"\nIt has a value of: "+r3.value()+"\nIs "+r3+" is equal to "+r2+" :"+r3.equals(r2));
	}
    
    
}