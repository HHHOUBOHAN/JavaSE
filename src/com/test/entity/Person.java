package com.test.entity;

//public class Test3 {
//    static String name;
//    int age;
//    String gender;
//    void hello() {
//        if(name==null||age==0){
//            return;
//        }
//        System.out.println(name+" "+age+" "+gender);
//    }
//    int sum(int a, int b) {
//        return a+b;
// //        System.out.print("apple");return后面不能编写代码
//    };
//    char test(int a) {
//        if(a>1){
//            return 'a';
//        }else{
//            return 'b';
//        }
//    };
//    void test3(int a,int b) {
//        int c=a;
//        a=b;
//        b=c;
//    }
//    void modify(Test3 name ){
//        Test3.name="apple";
//    }
//    void setName(String name) {
//        name = name;
//    }
    //这是因为局部变量（即方法参数）和实例变量同名时，方法内优先使用局部变量（方法参数）
//    void setName(String name) {
//        this.name = name;
//    }
//    String getName() {
//        return name;
//    }
//    int sum(int a, int b){
//        return a+b;
//    }
//    double sum(double a, double b){
//        return a+b;
//    }
//    void hello(){
//        System.out.println("hello");
//    }
//    void goodbye(){
//        System.out.println("goodbye");
//    }
//    void  work(){
//        System.out.println("work");
//    }
//    void sleep(){
//        System.out.println("hello");
//        System.out.println("goodbye");
//        System.out.println("work");
//        hello();
//        goodbye();
//        work();
//    }
//    void   test(){
//        test();
// //        System.out.println("test");
//    }
//    int test(int n){
//        if(n==0) return 0;
//        return test(n-1) + n;
//    }
//    Test3(){
//        name = "小明";
//        age = 0;
//        gender = "678";
//    }
//}
//public class Test3 {
//    final String name="未命名";//后续无法更改 必须给初始值
//    int age=10;
//    String gender="无";
//
//    Test3(){
//        System.out.println("我是构造方法 我现在的名称"+name);
//    }
//    Test3(String name, int age, String gender) {
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//    }
//    Test3(String name, int age) {
//         this(name,age,"null");
//    }
//    Test3(int age, String gender) {
//        this.age = age;
//        this.gender = gender;
//    }
//
//    //可以写多个同名的方法 参数不一样  就可以不存在
//    void hello(){
//        System.out.println("我叫"+name+"年龄"+age+"性别"+gender);
//    }
//}
//public class Test3 {
//    String name;
//    int age;
//    String gender;
//    {
//
//    }
//    static int info=0;
//    static void test(){
//        System.out.println("hello"+info);
//    }
//}
//package com.test.entity;
//public class Test3 {
//    String name;
//    int age;
//    String gender;
// //    Test3(){
// //        System.out.println("Test3 entity");
// //    }
// //    hello(){
// //        System.out.println("hello"+name+"年龄"+age+gender);
// //    }
//}
//public class Test3 {
//    private String name;
//    private int age;
//    private String gender;
//    private static Test3 instance;
//    private Test3(){}
//    public static   Test3 getTest3(){
//        if(instance == null){
//            instance = new Test3();
//        }
//        return instance;
//    }
//}
//继承

//    public Person(String name) {
//        this.name = name;
//    }
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }

//    public boolean equal(Object obj){
//        if(obj instanceof Person another){
//            return name.equals(another.name)&&age==another.age&&gender.equals(another.gender);
//            //age==another.age  字符串不能这样比较   因为这样只比较了引用 而字符串应该比较内容
//        }
//        return false;
//
//    }


//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//    public static void test(){
//        System.out.println("test");
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender='" + gender + '\'' +
//                '}';
//    }
public sealed abstract class Person permits,Teacher {
    protected String name="人类";
    protected int age;
    protected String gender;
    public  abstract void hello();
//    通过向导生成 alt+insert

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
