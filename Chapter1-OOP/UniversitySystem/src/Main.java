import java.util.*;
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