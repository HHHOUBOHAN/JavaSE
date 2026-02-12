//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("YYDS");
//        System.out.println("YYDS");
//    }
//}
//public class Main {
//    static void main(String[] args) {
//        System.out.println("Hello World");
//    }
//}
//void main{
//    System.out println("Hello");
//
//        }
//注释 // /**/  /**  ///（Markdown 格式）
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//    }
//}
//    /**
//     * @since 2025
//     * @解放拉萨就
//     */
//变量与常量
//public class Main {
//    public static void main(String[] args) {
//        int a = 10, b = 100;
//        a=100;
//        final int m=100;
// //       常量
//        System.out.println(a);
//        System.out.println(a+1);
// //        变量名要有意义
//        System.out.println("Hello World");
//    }
//}
//数据类型
//8bit=1byte
//整数类型 byte short(16bit) int(32bit) long(64bit)
//public class Main {
//    public static void main(String[] args) {
//        byte b=34;
//        short s=10000;
//        int i=2000000000;
//        long l=10000000000L;
// //        加 L 是在告诉编译器：这是一个 long 类型的数字
//    }
//}
//存储类型从小的整数类型转换成大的整数类型就会发生隐式类型转换
//十六进制以0x开头的都是十六进制表示法   八进制 以0开头的都是八进制 012=10 0112=72
//public class Main {
//    public static void main(String[] args) {
//        int a=2147483647;
//        a=a+1;
//        System.out.println(a);
//    }
//}
//浮点类型
//float 32bit double 64bit
//小数存放 s(31) E(30~23控制小数点) M(22~0尾数)
//public class Main {
//    public static void main(String[] args) {
//        long l=2234567890000999990L;
//        float  f=l;
//        System.out.println(f);
//    }
//}
//字符类型
//char(16bit)
//public class Main {
//    public static void main(String[] args) {
//        char a= '9';
// //        代码执行后，控制台将输出字符 9，而不是数字 9，因为字符 '9' 和数字 9 在 Java 中是不同的类型。
//        char b='\'';
//        String str="apple\n red";
// //        定义字符串时是String 而不是 string
//        System.out.println(str);
//        System.out.println(b);
//        System.out.println(a);
//    }
//}
//public  class Main {
//    public static void main(String[] args) {
//        byte b=110;
//        short m=3000;
//        int n=100;
//        long l=1000;
//        float f=1.1f;
//        double d=1.2;
//        char c='c';
// //        布尔类型 true 真 false 假
//        boolean b1=true;
//        System.out.println(b1);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        double i=1.5;
//        System.out.println(i);
// //        var  自动类型推断
//    }
//}
//运算符  赋值 算术
//public class Main {
//    public static void main(String[] args) {
//        int a=666;
//        System.out.println(a);
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a=12;
//        float b=12.3f;
//        float c=a+b;
//        System.out.println(c);
//        String s="if";
//        String s1="if";
//        String C = s+s1;
//        System.out.println(C);
//        double t=100.0,n=200.0;
//        double m=t/n;
//        System.out.println(m);
//        int n=10;
//        int m=1000;
//        int c=n % m;
//        System.out.println(c);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a=20+4*12;
//        System.out.println(a);
//        String str="aaa"+20+5+"bbb";
//        String str1="aaa"+20/5+"bbb";
//        System.out.println(str1);
//        System.out.println(str);
//        int n=10+1-2;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int a=(10+2)*6;
//        System.out.println(a);
//        String str="AAA"+(12+12)+"AAA";
//        System.out.println(str);
//        int a=128;
//        byte b=(byte)a;
//        System.out.println(b);
//    }
//}
//自增自减
//public class Main{
//    public static void main(String[] args){
//        int a=12;
//        int b;
//        b=++a;
//        System.out.println(b);
//        --a;
//        System.out.println(a);
//        int m=8;
//        int n=-m++ + ++m;
//        System.out.println(n);
//    }
//}
//位运算符  & | ~ ^
//public class Main{
//    public static void main(String[] args){
//        int a=9,b=3;
//        int c=a&b;
//        System.out.println(c);
//        int d=a|b;
//        System.out.println(d);
//        int e=a^b;
//        System.out.println(e);
//        byte m=~127;
// //        转换成二进制 然后按位取反
//        System.out.println(m);
//        byte v=7<<3;
//        System.out.println(v);
//        int m1=111<<3;
//        System.out.println(m1);
//    }
//}
//关系运算符
//public class Main {
//    public static void main(String[] args) {
//        int a=10;
//        int b=10;
//        boolean c=a==b;
//        System.out.println(c);
//    }
//}
//逻辑运算符  && ||
//public class Main {
//    public static void main(String[] args) {
// //        int a=-1;
// //        boolean b=true&&false;
// // //        System.out.println(a);
// //        System.out.println(b);
//        int a=10;
//        boolean b1=a++>10&&++a==12;//短路
//        boolean b2=a++>10&++a==12;//不短路
//        System.out.println(a);
//        System.out.println(b1);
//        System.out.println(b2);
//        int m=10;
//        char c1=m>10?'j':'m';
//        System.out.println(c1);
//    }
//}
//代码块（花括号） 作用域（代码块会限制我们的作用域）
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        {
//            int a = 1;
//            System.out.println(a);
//        }
//    }
//}
//选择结构 if switch
//public class Main {
//    public static void main(String[] args) {
//        int a=3;
//        if(a!=12) {
//            System.out.println("hello");
//            System.out.println("apple");
//        }
//        else {
//            System.out.println("hello");
//        }
//        int b=3;
//        if(b>10){
//            System.out.println("6");
//        }
//        else if(b>=3){
//            if(b>2){
//                System.out.println("2");
//            }
//            else{
//                System.out.println("3");
//            }
//            System.out.println("3");
//        }
//        else{
//            System.out.println("0");
//        }
//    }
//}
//switch
//public class Main {
//    public static void main(String[] args) {
//        int a=78;
//        switch(a){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println(4);
//        }
//    }
//}
//switch表达式
//public class Main {
//    public static void main(String[] args) {
//        int c=9;
//        char g;
//        switch(c){
//            case 10:
//                g = 'A';
//                break;
//            case 9:
//                g = 'B';
//                break;
//            case 8:
//                g = 'C';
//                break;
//            case 7:
//                g = 'D';
//                break;
//            default:
//                g = 'E';
//        }
//        System.out.println("成绩等级:" + g);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int c=3;
//        char grade = switch (c){
//            case 1 -> 'A';
//            case 2 -> 'B';
//            case 3 -> {
//                System .out.println('A'+'B');
//                yield 'C';
//            }
//            case 4 -> 'D';
//            default -> 'E';
//        };//这种写法就要写分号
//        System.out.println(grade);
//    }
//}
//循环语句 for(continue(提前跳过本轮循环) break(提前终止整个循环)) while() do {} while{};
//public class Main {
//    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            System.out.println("hello"+i);
//        }
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        System.out.println("Hello World!");
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print("*");
//            }
//            System.out.println("end"+i);
//        }
//         out:for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (j == 1)
//                    break out;
//                System.out.print(j);
//            }
//        }
//        System.out.print("apple");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        int i=2;
//        do{
//            System.out.println("apple");
//            i++;
//        }
//        while(i<10);
//    }
//}
//寻找水仙花数
//public class Main {
//    public static void main(String[] args) {
//        for(int i=100;i<=1000;i++){
//            int m=i%10;
//            int n=i/10%10;
//            int c=i/100;
//            if(i==m*m*m+n*n*n+c*c*c){
//                System.out.println(i);
//            }
//        }
//    }
//}
//打印九九乘法表
//public class Main {
//    public static void main(String[] args) {
// //        for(int i=1;i<10;i++){
// //            for(int j=1;j<=i;j++){
// //                System.out.print(j+"*"+i+"="+i*j+" ");
// //
// //            }
// //            System.out.println("\n");
// //        }
//        for(int i=1;i<10;i++){
//            for(int j=1;j<=9;j++){
//                if(j>i)break;
//                System.out.print(j+"*"+i+"="+i*j+" ");
//            }
//            System.out.println("\n");
//        }
//    }
//}
//斐波那契数列
//public class Main {
//    public static void main(String[] args) {
//
//    //        int i=1,j=1;
//    //        int c=i+j;
//    //        System.out.println(i);
//    //        System.out.println(j);
//    //        while(c<1000){
//    //            c=i+j;
//    //            System.out.println(c);
//    //            i=j;
//    //            j=c;
//    //        }
//        int a=1,b=1,tmp,result;
//        for(int i=1;i<=10;i++){
//            tmp=a+b;
//            a=b;
//            b=tmp;
//        }
//        result=a;
//        System.out.println(result);
//
//    }
//}

