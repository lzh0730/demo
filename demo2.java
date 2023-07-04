import java.util.jar.JarEntry;

public class demo2 {
    public static void main(String[] args) {
        //数组
        /*索引
        1.获取数组里面的元素
        2.格式：数组名【索引】
         */
        int[] arr = {1,2,3,4};
        int number =arr[0];
        System.out.println(number);


        //可以直接打印
        System.out.println(arr[1]);


        //快速遍历
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}

