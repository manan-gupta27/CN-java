package sorting;

public class selectionsort {
        public static void ss(int[] input){
            for(int i=0;i<input.length-1;i++){
                int min=input[i];
                int minIndex=i;
                    for(int j =i+1;j<input.length;j++){
                        if(input[j]<min){
                            min=input[j];
                            minIndex=j;
                        }
                    }
                    if(minIndex!=i){
                        input[minIndex]=input[i];
                        input[i]=min;
                    }
            }
            
        }


        public static void main(String[] args){
            int input[]={2,6,1,9,5};
            ss(input);
            for(int i=0;i<input.length;i++){
                System.out.println(input[i]+" ");
            }
        }
}
