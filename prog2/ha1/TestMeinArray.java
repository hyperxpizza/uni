
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMeinArray {
    private MeinArray ma;

    @Before
    public void initMeinArray(){
        ma = new MeinArray();
    }

    
    @Test
    public void testIstGleich1(){
        float[] array1  = {1.0f, 2.0f, 3.0f};
        float[] array2 = {1.0f, 2.0f, 4.0f};

        assertTrue(ma.istGleich(array1, array2) == false);
    }
    
    @Test
    public void testIstGleich2(){
    	float[] array1  = {1.0f, 2.0f, 3.0f};
        float[] array2 = {1.0f, 2.0f};
        assertTrue(ma.istGleich(array1, array2) == false);
    }


    @Test 
    public void testIstGleich3(){
    
        // two same float arrays (best case)
        float[] array1 = {1.0f, 2.0f, 3.0f};
        float[] array2 = {1.0f, 2.0f, 3.0f};    

        // istGleich() should return true
        assertTrue(ma.istGleich(array1, array2) == true);
    }
    
    @Test
    public void testIstGleich4() {
    	float[] array1 = {1.0f, 2.0f, 3.0f};
    	float[] array2 = {};
    	
    	assertTrue(ma.istGleich(array1, array2) == false);
    }
    
    @Test
    public void testSucheElem1() {
    	double[] array = {1.0, 2.0, 3.0, 4.0};
    	double elem = 4.0;
    	
    	assertTrue(ma.sucheElem(elem, array) == 3);
    }
    
    @Test
    public void testSucheElem2() {
    	double[] array = {1.0, 2.0, 3.0, 4.0};
    	double elem = 5.0;
    	
    	assertTrue(ma.sucheElem(elem, array) == -1);
    }
    
    @Test
    public void testSucheElem3() {
    	double[] array = {2.1, 3.0, 4.0, 6.9, 3.0, 2.2, 4.1, 6.0, 5.3, 3.1, 6.6};
    	double elem = 2.1;
    	
    	assertTrue(ma.sucheElem(elem, array) == 0);
    }
    
    @Test
    public void testSucheElem4() {
    	double[] array = {2.1, 3.0, 4.0, 6.9, 3.0, 2.2, 4.1, 6.0, 5.3, 3.1, 6.6};
    	double elem = 9.9;
    	
    	assertTrue(ma.sucheElem(elem, array) == -1);
    }
    
    @Test
    public void testEinfuegeSortiert1() {
    	// array already sorted, element in array
        int[] array = {1, 2, 3, 4};
        int elem = 4;
        
        assertTrue(ma.einfuegeSortiert(array, elem) == array);
    }

    @Test
    public void einfuegeSortiertMitNegativenElement() { 
        int[] a1 = {2, 3, 4, 5, 6};
        Assert.assertArrayEquals(new int[]{-2, 2, 3, 4, 5, 6}, meinArray.einfuegeSortiert(a1, -2));
    }

    @Test
    public void einfuegeSortiertFuegtElementInSortiertemArrayEin() {
        int[] a1 = {2, 3, 4, 5, 6};
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, meinArray.einfuegeSortiert(a1, 1));
    }
    @Test
    public void einfuegeSortiertFuegeMaxEin() { //Grenzfall mit max int value
        int[] a1 = {2, 3, 4, 5, 6};
        int a = Integer.MAX_VALUE;
        Assert.assertArrayEquals(new int[]{2, 3, 4, 5, 6, a}, meinArray.einfuegeSortiert(a1, a));
    }
    @Test
    public void einfuegeSortiertFuegeMinEin() { //Grenzfall mit miin int value
        int[] a1 = {2, 3, 4, 5, 6};
        int a = Integer.MIN_VALUE;
        Assert.assertArrayEquals(new int[]{a,2, 3, 4, 5, 6}, meinArray.einfuegeSortiert(a1, a));
    }

}