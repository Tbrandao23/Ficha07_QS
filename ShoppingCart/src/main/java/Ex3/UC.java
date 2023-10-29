package Ex3;

import java.util.ArrayList;

public class UC {
    String nameCu;
    ArrayList<Mark> marks;
    int totalStudents;

    public UC(String nameCu, int totalStudents) {
        this.nameCu = nameCu;
        this.totalStudents = totalStudents;
        marks = new ArrayList<Mark>(totalStudents);
    }


    public void insertMarkCU(int numStudent, double mark){
        int i = 0;
        Mark nova = new Mark(numStudent,mark);
        if(marks.isEmpty()){
            marks.add(nova);
        }else{
            while(i < marks.size() && marks.get(i).getNumStudent() != numStudent){
                i++;
            }
            if(i >= marks.size()){
                marks.add(nova);
            }else{
                System.out.println("Mark already exists");
            }
        }

    }

    public double searchStudent(int numStudend){
        double res = 0;
        int i = 0;
        while(i < marks.size() && marks.get(i).getNumStudent() != numStudend){
            i++;
            }
        if (i <= marks.size()){
            res = marks.get(i).getMark();
        }else{
            res = -1;
        }

        return res;
    }

    public double averageCU (){
        double res = 0;
        double add = 0;


        for(int i = 0; i < marks.size();i++){
            add = add +  marks.get(i).getMark();
        }

        res = add / marks.size();

        return res;
    }

    public boolean isApproved (int numStudent){
        boolean res = false;
        int i = 0;

        while(i < marks.size() && marks.get(i).getNumStudent() != numStudent){
            i++;
        }

        if(i <= marks.size()){
            if(marks.get(i).getMark() >= 9.5){
                res = true;
            }
        }else{
            System.out.println("Student doesn't exist");
        }

        return res;
    }

}
