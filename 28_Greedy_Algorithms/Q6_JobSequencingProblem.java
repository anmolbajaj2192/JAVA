package Greedy_Algorithms;

import java.util.ArrayList;
import java.util.Collections;



public class Q6_JobSequencingProblem {

     static class Job{ //New Thing to Learn: jobInfo[][] -> isko humne Class ke Object ke form mein define kia hai i.e. Blueprint jismein deadline, profit aur id hogi
            int deadline;
            int profit;
            int id; // 0(A), 1(B), 2(C)

            public Job(int i, int d, int p){ 
                id=i;
                deadline=d;
                profit=p;
            }
        }

    public static void main(String[] args) {
       
        int jobsInfo[][] = {{4, 20}, {1,20}, {1, 48}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();//jitne job info thi utni size ka objects ka array bana liya. Job types ke objects hai.
        

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1])); 
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); //descending order of sorting (of profit) all objects. //Lambda function->shortform  
        

        ArrayList<Integer> seq = new ArrayList<>();
        int time=0;
        for(int i=0; i<jobs.size(); i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }

        //print seq
        System.out.println("max jobs = "+ seq.size());
        for(int i=0; i<seq.size(); i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
    
}
