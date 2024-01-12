public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sumFullArr = 0;
        int sumMissingArr = 0;
        int missing = -1;
        for(int i = 0; i <= n; i++) {
            sumFullArr = sumFullArr + i;
        }
        for(int j = 0; j < n; j++) {
            sumMissingArr = sumMissingArr + array[j];
        }
        missing = sumFullArr - sumMissingArr;
        return missing;
    }

    public static int secondMaxValue(int [] array) {
       int n = array.length;
       int maxValue = 0;
       int secondMax = 0;
       for(int i = 0; i < n; i++) {
        if(maxValue < array[i]) {
            secondMax = maxValue;
            maxValue = array[i];
        } else if (secondMax < array[i]) {
            secondMax = array[i];
        }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1, int [] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        for(int i = 0; i < n1; i++) {
			int count = 0;
            for(int j = 0; j < n2; j++) {
                if(array1[i] == array2[j]) {
                    count++;
                }
            } 
            if(count == 0) {
                return false;
            }
        }
        for(int i = 0; i < n2; i++) {
			int count = 0;
            for(int j = 0; j < n1; j++) {
                if(array1[j] == array2[i]) {
                    count++;
                }
            } 
            if(count == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        int n = array.length;
        boolean increase = true;
        boolean decrease = true;
       for(int i = 0; i < (n - 1); i++) {
        if (array[i] < array[i + 1]) {
            decrease = false;
        } else if(array[i] > array[i + 1]) {
            increase = false;
        } 
    }
    if(decrease != increase) {
    return true;
    }
    return false;
}
}
