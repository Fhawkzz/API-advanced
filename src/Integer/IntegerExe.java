package Integer;

import java.util.Arrays;

//有一个字符串“91 27 46 38 50”，吧其中每一个数字存到int类型的数组中
public class IntegerExe {
    public static void main(String[] args) {
        String str="91 27 46 28 50";
        String[] s = str.split(" ");//以空格为切割点切割
        int[] ints=new int[s.length];
        for (int i = 0; i < s.length; i++) {
            ints[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(ints);//排序
        //遍历数组
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
