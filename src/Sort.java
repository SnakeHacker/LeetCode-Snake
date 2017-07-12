/**
 * Created by K40-1 on 2017/7/11.
 */
public class Sort {
    //冒泡排序
    public void bubblesort(int data[]) {
        for (int i = 0; i < data.length -1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    //选择排序
    public void selectsort(int data[]) {
        int minVal;
        int minIndex;
        for (int i = 0; i < data.length - 1; i++) {
            minVal = data[i];
            minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < minVal) {
                    minVal = data[j];
                    minIndex = j;
                }
            }
            if (minVal != data[i] && minIndex != i) {
                data[minIndex] = data[i];
                data[i] = minVal;
            }
        }
    }
    //插入排序
    public void insertsort(int data[]) {
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    int temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }
    //归并排序
    public void mergesort(int data[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergesort(data, start, mid);
            mergesort(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public void merge(int data[], int start, int mid, int end) {
        int temp[] = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (data[i] < data[j]) {
                temp[k++] = data[i++];
            } else {
                temp[k++] = data[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = data[i++];
        }
        while (j <= end) {
            temp[k++] = data[j++];
        }

        for (k = 0, i = start; k < temp.length; k++, i++) {
            data[i] = temp[k];
        }
    }
    //快速排序
    public void quicksort(int data[], int start, int end) {
        if (end - start <= 0) {
            return;
        }
        int last = start;
        for (int i = start + 1; i <= end; i++) {
            if (data[i] < data[start]) {
                int temp = data[++last];
                data[last] = data[i];
                data[i] = temp;
            }
        }
        int temp = data[last];
        data[last] = data[start];
        data[start] = temp;
        quicksort(data, start, last - 1);
        quicksort(data, last + 1, end);
    }

}
