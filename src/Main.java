//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.io.*;
import java.lang.Byte;
public class Main {
    public static void main(String[] args)  {
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println("Enter C to only Write Captial Letters or Enter other character to Write all letter: ");
    char c=sc.next().charAt(0);
    String new1="";
    if(c=='C'){
        for(int i=0;i<s.length();i++){
            char b=s.charAt(i);
            if(b>='A' && b<='Z'){
                new1=new1+b;
            }
        }
    }
    else{
        new1=s;
    }
    try{
        //location of the file
    File f=new File("C:\\filehandling\\TEXT1.txt");
     FileOutputStream fw =new FileOutputStream(f);
     byte[] b=new1.getBytes();
     fw.write(b);
     fw.close();
     System.out.println("-------Succcess-------");
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }
}