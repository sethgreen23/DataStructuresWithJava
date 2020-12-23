import java.util.*;

class University{
    /*
     class A contains references to instances of a class B and controls all access to those
	 instances, we say that A is a composition of B.For example, a University class would be a
	 composition of Department objects. Each Department object belongs to a unique University
	 object, which controls access to its department.If A is a composition of B, we say that an A object
	 “owns a” B object. For example, a university owns a department.
     */
    private static class Departement{
    	/* 
    	When a class A contains references to a class B whose
		instances exist and are accessible outside of A, we say that A
		is an aggregation of B. For example, in a university software
		system, a Department class would contain references to
		Professor objects who are members of the department, but
		who also exist outside the department. In fact, a professor
		could be a member of two different departments. If A is an
		aggregation of B, we say that an A object “has a” B object.
		For example, a department has a professor.this is achieved by
		making the Departement class an inner class of the University class
    	 */
        public final String name;
        private Set<Professor> members;
        
        Departement(String name){
            this.name = name;
            members = new HashSet<Professor>();
        }
        
        public void add(Professor professor){
            members.add(professor);
        }
        public Set<Professor> getProfessors(){
            return members;
        }
    }
    
    private final String name;
    private Map<String,Departement> departements;
    
    public University(String name){
        this.name = name;
        departements = new HashMap<String,Departement>();
    }
    
    public void addDepartement(String name,Set<Professor> members){
        Departement dept = new Departement(name);
        for(Professor prof:members){
            dept.add(prof);
        }
        departements.put(name,dept);
    }
    
    public void add(String name, Professor professor){
        Departement dept = departements.get(name);
        if(dept==null)
            throw new RuntimeException("this "+name+" departement doesnt exist");
        dept.add(professor);
    }
    
    public Map<String,Departement> getDepartements(){
        return departements;
    }
    
    public void showDepartementsDetails(){
        for(Map.Entry<String,Departement> e : departements.entrySet()){
            String key  = e.getKey();
            Departement value  = e.getValue();
            System.out.println("Departement of "+key+" :");
            for(Professor prof: value.getProfessors()){
                System.out.println(prof.getName());
            }
            System.out.println("******************************");
        }
    }
    
}