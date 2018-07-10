import java.util.Scanner;

public class TimKiemNhiPhanDeQuy {
    static int[] list;

    public static int binarySearch(int list[], int low, int high, int value) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (list[mid] == value)
                return mid + 1;
            if (list[mid] > value)
                return binarySearch(list, low, mid - 1, value);
            return binarySearch(list, mid + 1, high, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao do dai mang: ");
        size = sc.nextInt();
        list = new int[size];
        System.out.println("May nhap gia tri cac phan tu trong mang: ");
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }
        System.out.println("Mang cua ban la:");
        show();
        System.out.println();
        System.out.println("Mang sau khi sap xep la:");
        sapXep(list);
        System.out.println();
        System.out.print("Nhap vao gia tri muon tim kiem: ");
        int value = sc.nextInt();
        System.out.print("Gia tri can tim o vi tri: " + binarySearch(list, 0, list.length - 1, value));
    }

    public static void show() {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void sapXep(int[] array) {
        int temp;
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
