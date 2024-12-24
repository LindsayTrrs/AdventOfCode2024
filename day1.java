import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.PriorityQueue;

class Main{

    public static void main(String args[]){
        Scanner input = null;
        int totalDist = 0;
        String filename = "advent.txt";
        ArrayList<Integer> list1 =  new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        try{
            input = new Scanner(new File(filename));
        }
        catch(FileNotFoundException e){
            System.exit(0);
        }
        while(input.hasNextLine()){
            String line = input.nextLine();
            String nums[] = line.split("   ");
            list1.add(Integer.parseInt(nums[0]));
            list2.add(Integer.parseInt(nums[1]));
        }
        input.close();

        //Create min heap
        PriorityQueue<Integer> minHeap1 = new PriorityQueue<>();
        PriorityQueue<Integer> minHeap2 = new PriorityQueue<>();

        //Add values to min heaps
        for(int i = 0; i < list1.size(); i++){minHeap1.add(list1.get(i));}
        for(int i = 0; i < list2.size(); i++){minHeap2.add(list2.get(i));}

        //Calculate distance
        for(int i = 0; i < list1.size(); i++){totalDist += minHeap1 != null && minHeap2 != null ? Math.abs(minHeap1.poll() - minHeap2.poll()) : 0;
        }

        //Total distance
        System.out.println(totalDist);

    }
}