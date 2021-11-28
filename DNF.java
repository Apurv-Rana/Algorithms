import java.io.*;
public class DNF {

        static void applyDnf(int array[], int array_size)
        {
            int low = 0;
            int high = array_size - 1;
            int mid = 0, temporary=0; 
            while (mid <= high)
            {
                switch (array[mid])
                {
                    case 0:
                    {
                        temporary = array[low];
                        array[low] = array[mid];
                        array[mid] = temporary;
                        low++;
                        mid++;
                        break;
                    }
                    case 1: 
                        mid++;
                        break;
                    case 2:
                    {
                        temporary = array[mid];
                        array[mid] = array[high];
                        array[high] = temporary;
                        high--;
                        break;
                    }
                }
            }
        }
       
        static void dispayArray(int array[], int array_size)
        {
            int i;
            for (i = 0; i < array_size; i++)
                System.out.print(array[i]+" ");
            System.out.println("");
        }
        //Now we use driver function to check for above functions
        public static void main (String[] arguments)
        {
            int array[] = {0, 1, 0, 1, 2, 0, 1, 2};
            int array_size = array.length;
            System.out.println("Array Passed");
            dispayArray(array, array_size);
            applyDnf(array, array_size);
            System.out.println("DNFS algorithm outcome : ");
            dispayArray(array, array_size);
        }
    }

