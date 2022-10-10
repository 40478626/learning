package Open_Close_Principle;
interface ValueCompare{
    int compare(int value1, int value2);
}

public class SortNumber {
    public static void main (String[] args){
        int[] array = {10,6,4,2,3,5,7,9,8,1};
        ArrayUtil.sortAscending(array, new DescendComparator());
        System.out.println("Value in the array are: ");
        for (int element : array){
            System.out.println(element);
        }
    }
}
class ArrayUtil{
    public static void sortAscending(int[] a, ValueCompare comparator){
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j <a.length; j++){
                if (comparator.compare(a[i],a[j]) > 0) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    /*
    public static void sortDescending(int a[]){
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j <a.length; j++){
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    */
}

//ComparatorLogic
class AscendComparator implements ValueCompare {


    @Override
    public int compare(int value1, int value2) {
        return  value1 - value2;
    }
}

class DescendComparator implements ValueCompare {


    @Override
    public int compare(int value1, int value2) {
        return  value2 - value1;
    }
}