/*
	When a class A includes all the members of a class B, we
	say that A is an extension of B, and that it inherits all the
	properties of B. For example, a Professor class would be
	an extension of a Person objects. If A is an extension of B,
	we say that an A object “is a” B object. For example, a
	professor is a person.
 */
class Professor extends Person{
    public static enum Rank {INST,ASST,ASSC,PROF};
    
    private Rank rank;
    
    public Professor(String name, Rank rank){
        super(name);
        this.rank = rank;
    }
    
    public Rank getRank(){
        return rank;
    }
    
    public void setRank(Rank rank){
        this.rank = rank;
    }
}