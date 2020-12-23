class Person{
    private final String name;
    
    public Person(String name){
        this.name = name;
    }
    //with final fields you can just get
    public String getName(){
        return name;
    }
}