public class LinearSearch_02 {
    public static void main(String[] args) {
        System.out.println("Question-: Write a program to search for an element in a 2D array and return its row and column index.");
        int[][] example ={
            {23,54,98},
            {67,43,90},
            {43,26,90}
        };
        int target=43;
        search2(example, target);
    }
    static void search2(int[][] arr, int target){
        if(arr.length==0){
            System.out.println("Empty array");
            // return -1;
        }
        boolean found =false;
        for(int r =0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                if (target==arr[r][c]) {
                    // return new int[]{r, c};
                    System.out.println(r+","+c);
                    // System.out.println("Found");

                    found=true;
                }
            }
            
            // return -1;

        }
        if(!found){
            System.out.println("not found");
        }
       

    }
    // System.out.println("Not found");
    
}
