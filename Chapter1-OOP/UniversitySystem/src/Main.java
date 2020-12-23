import java.util.*;
/*
	 The University class is a composite of Department objects. The existence of a department is dependent upon the existence of its university. Therefore, the Department class should be completely
	controlled and insulated by the University class. This is done by defining it to be a nested private
	static class at line 2.
	The University.Department class has two fields: name (a String), and members (a Set of
	Professors). It includes an add() method at line 11 for adding professors to the department.
	The University class has two fields: name (a String), and departments (a Map of Department
	objects, indexed by their names). It includes two add() methods (at lines 28 and 36) and an accessor
	method that returns the Set of department names (at line 45).
	Note that the University.Department class is an aggregate of Professor objects. The existence of
	a professor is independent of his or her department’s existence. Therefore, the Professor class is defined
	separately from the University.Department class
 */
public class Main {
    public static void main(String args[]) {
        University Esprit = new University("Esprit");
        Professor david = new Professor("David Langlet",Professor.Rank.PROF);
        Professor alan = new Professor("Alan Snow",Professor.Rank.INST);
        Professor chirstopher = new Professor("Christopher Bianteck",Professor.Rank.ASSC);
        Set<Professor> profs = new HashSet<Professor>();
        Collections.addAll(profs,david,alan,chirstopher);
        Esprit.addDepartement("Computer Science",profs);
        profs.clear();
        Professor chaith = new Professor("Dridi Chaith",Professor.Rank.PROF);
        Professor maria = new Professor("Dridi Maria",Professor.Rank.PROF);
        Collections.addAll(profs,chaith,maria,alan);
        Esprit.addDepartement("Biology",profs);
        Esprit.showDepartementsDetails();

    }
}
