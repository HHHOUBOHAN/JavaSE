package com.test1;
////基本类型包装类（基本数据类型和引用数据类型变量（存储的是对象的引用）） Object
//public class Main1 {
//    public static void main(String[] args) {
////        int 的包装类 Integer
//        int a=666;
//        Integer i= Integer.valueOf(666);
//        Integer j= 666;
////        Integer.valueOf可以省略 自动装箱
//        int b=i; //int b=i.intValueOf(666)自动拆箱
//        Integer m=667;
//        Integer n=667;
//        System.out.println(a == b);
//        System.out.println( m == n);
////        m n超出了缓存范围(-128~127这些对象都是提前创建好的（缓存）)所以它们分别指向两个不同的Integer 对象因此m == n 会比较这两个不同对象的引用地址它们的值相同但引用不同结果是 false。
////        Integer c=666;
////        int d=c.intValue();
//        Integer z=Integer.valueOf("666");
//        System.out.println(z);
//        //字符串也可以转换
//        Integer k=Integer.decode("0x8");
//        System.out.println(k);
//        //十六进制也可以转换
//    }
//}
//特殊包装类  BigInteger  BigDecimal
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.math.RoundingMode;
//
//public class Main1 {
//    public static void main(String[] args) {

import java.util.Arrays;

////        BigInteger i = BigInteger.valueOf(Long.MAX_VALUE);
////        System.out.println(i.pow(1000));
//////        BigInteger l =Long.MAX_VALUE;
//////        long 类型没有 multiply() 方法，导致报错。
////        System.out.println(i.bitLength());
////        System.out.println(i.multiply(i));
//////        System.out.println(l.multiply(l));
//        BigDecimal d=BigDecimal.valueOf(13);
//        System.out.println(d.divide(BigDecimal.valueOf(8),100, RoundingMode.CEILING));
//    }
//}
//数组
//public class Main1 {
//    public static void main(String[] args) {
//        创建 数组也是继承Object类（以对象形式存在）
//        int[]arr =new int[];{12,12,12};
//        int[]arr3 ={12,12,12,32,32,32,43,54,45};
//        int arr2[] =new int[10];
//        Object m=arr;
//        int[] arr = new int[10];
//        arr[0]=8;
//        arr[1]=9;
//        arr[2]=8;
//        arr[3]=9;
//        int[] arr1 = new int[]{23,233,434};
//        int[] arr2 = new int[]{23,233,434};
//        System.out.println(arr1.equals(arr2));
//        String[] arr1 = new String[]{"AAA", "BBB", "CCC", "DDD", "EEE", "FFF"};
//        String[] arr2 = arr1.clone();
//        System.out.println(Arrays.toString(arr1));
//        //打印
//        String[] arr1 = new String[]{"返回付款时间","就发生大家"};
//        for(int a = 0; a < arr1.length; a++){
//            String element = String.valueOf(arr1[a]);
//            System.out.println(element);
//        }
//        for(String element : arr1){
//            System.out.println(element);
//
//        }
//        int[] arr1=new int[10];  //不支持互转
//    }
//}
//        //多维数组
//public class Main1 {
//    public static void main(String[] args) {
//        //创建
//        int[][] arr = new int[2][10];
//        arr[0][4] = 23;
//        System.out.println(arr[0][2]);
//        int[][] arr1={
//                {1,2},{3,23},{243,2434},{198,78},{17,672},{190,245,67,78},
//        };
//        //打印
//        arr1[5][3]=23;
//    for(int[] ints:arr1){
//        for(int anInt:ints){
//            System.out.print(anInt+",");
//        }
//        System.out.print("------------");
//    }
//    }
//}
//可变长参数(必须是参数列表的最后  String[] args 自动转为数组)
//public class Main1 {
//    public static void main(String[] args) {
////        test1("房间阿里山","家里的事","AAA","HHH");
//
//    }
////    private static void test1(String... text){
////        System.out.println(text.length);
////        for(String s:text){
////            System.out.println(s);
////        }
////    }
//}
//字符串（字符串的字符一旦确定 无法进行修改 只能重新创建）
//public class Main1 {
//    public static void main(String[] args) {
////        String str = new String("Hello World");
//        String str1 =  "Hello World";
//        String str2 =  "Hello World";
//        //str1 str2指向的是同一个对象
//        System.out.println(str1 == str2);
//        String str3 =  new String("Hello World");
//        String str4 =  new String("Hello World");
//        //str3 str4指向的不是同一个对象
//        System.out.println(str3 == str4);
//        System.out.println(str3.equals(str4));
////        使用 == 比较的是两个对象的内存引用
////        equals 比较的是对象的内容而不是引用
//        //长度
//        String str5 =  "Hello World";
//        System.out.println(str5.length());//System.out.println("Hello World".length());
//        //切割
//        System.out.println(str1.substring(6));
//        //分割
//        String[] arr=str1.split(" ");
//        System.out.println(Arrays.toString(arr));
//    }
//}
//StringBuilder
//public class Main1 {
//    public static void main(String[] args) {
//        String str1="abc"+"吉林省大家";
//        String str2="abc"+"吉林省大家";
//        String str3="abc"+"吉林省大家";
//        System.out.println(str1+str2+str3);
//        StringBuilder builder=new StringBuilder();
//        builder.append("AAA");
//        builder.append("BBB");
//        builder.append("OOO");
//        builder.insert(0, "567");
//        System.out.println(builder.toString());
//
//    }
//}
//字符串增强方法
public class Main1 {
    public static void main(String[] args) {
        //去除前后空格 strip stripLeading(去除前面) stripTrailing(去除后面)  因为字符串本身不可变 则返回的是一新的字符串对象 而非对其本身的修改
        String str="ABC";
        System.out.println(str.repeat(300));
    }
}