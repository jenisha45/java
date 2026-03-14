 package unit6;

public class Stringsdemo {

    public static void main(String[] args) {
        String a="hello world!";
        String b="java programming";
        System.out.println("string length="+a.length()+" sting length="+b.length());
        System.out.println("concatenation of string="+a.concat(b));
        System.out.println("sting in lower case="+a.toUpperCase());
        System.out.println("to lower case="+b.toLowerCase());
        System.out.println("sub string="+b.substring(2,4) );
        System.out.println("string replace="+a.replace( 'e', 'a'));
        System.out.println("remove extra space="+a.trim());
        System.out.println(a.compareTo(b));
        String str="hello!world!hehe!hi";
        String[] str2=str.split("!");
        for(int i=0;i<str2.length;i++)
        {
            System.out.println(str2[i]);
        }
        System.out.println(str.indexOf('e'));
        // System.out.println(str2.LastIndexOf('h'));
    }
}