package ha2;

public class MeinArray{

    public boolean istGleich(float a1[], float a2[]){
        if(a1.length != a2.length){
            return false;
        }

        for(int i=0;i<a1.length;i++){
            float a = a1[i];
            float b = a2[i];

            if(a != b){
                return false;
            }
        }

        return true;
    }

    public int sucheElem(double elem, double[] arr){
        // sort the array
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        // print sorted array
        System.out.print("Sorted array: ");
        printArray(arr);
        System.out.print("\n");

        // find given element
        for(int k = 0; k<arr.length; k++){
            if(elem == arr[k]){
                return k;
            }
        }

        return -1;
    }

    public void printArray(double arr[]) {
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public int[] einfuegeSortiert(int[] arr, int elem){
        // Sort array
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j< arr.length - i -1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }

        // Check if element is already there
        for(int i = 0; i <arr.length; i++){
            if(arr[i] == elem){
                // Print out that the element is already there and return
                System.out.println("Element already in the array!");
                return arr;
            }
        }

        return arr;

    }

}