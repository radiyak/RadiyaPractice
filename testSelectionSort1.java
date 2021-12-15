import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort1 {
@Test
public void test() {

testMixed();
testDuplicates();
}
    public testSelectionSort1() {
    }


    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = 0;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -8;
        Sortedarr[2] = -7;
        Sortedarr[3] = 0;
        Sortedarr[4] = 9;
        /** Test data contains with both positive, negative and zeros **/
    	SelectionSort1 x= new SelectionSort1();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         	assert(arr[i]==Sortedarr[i]);
         }
    }

    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -8;
        arr[2] = -7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -8;
        Sortedarr[1] = -8;
        Sortedarr[2] = -7;
        Sortedarr[3] = 2;
        Sortedarr[4] = 10;
        /** Test data contains duplicates **/
    	SelectionSort1 x= new SelectionSort1();
        x.basicSelectionSort(arr);
         for(int i=0;i<5;i++) {
         	assert(arr[i]==Sortedarr[i]);
         }
    }
}
