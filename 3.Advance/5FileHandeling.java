//ByteStream
import java.io.FileInputStream;
import java.io.FileOutputStream;

class Main {

    public static void main (String[] args) {
        FileInputStream in=null;
        FileOutputStream out=null;
        
         //Use the same code in local machine compiler to do necessary operations
        
        //You may edit the location of file as desired
        
        try{
            in=new FileInputStream("input.txt");
            out=new FileOutputStream("output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally {
            if(in!=null){
                in.close();
            }if(out!=null){
                out.close();
            }
        }

    }
}

//Character Stram
import java.io.FileReader;
import java.io.FileWriter;

class Main {

    public static void main (String[] args) {
        FileReader in=null;
        FileWriter out=null;
        
         //Use the same code in local machine compiler to do necessary operations
        
        //You may edit the location of file as desired
        
        try{
            in=new FileReader("input.txt");
            out=new FileWriter("output.txt");
            int c;
            while((c=in.read())!=-1){
                out.write(c);
            }
        }finally {
            if(in!=null){
                in.close();
            }if(out!=null){
                out.close();
            }
        }

    }
}


// Create a File
import java.io.File;
import java.io.IOException;

class Main {

    public static void main (String[] args) {
        
        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code
        
        //You may edit the location of file as desired
        
        try{
            File obj=new File("D:\\File.txt");
            if(obj.createNewFile()){
                System.out.print(obj.getName());
            }else{
                System.out.print("File already exists.");
            }
        }
        catch (IOException e){
            System.out.print("An error occured");
        }
    }
}

//get Information
import java.io.File;
import java.io.IOException;

class Main {

    public static void main (String[] args) {
        
        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code
        
        //You may edit the location of file as desired
        
        try{
            File obj=new File("D:\\File.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }else{
                System.out.println("File already exists.");
            }
            if(obj.exists()){
                System.out.println(obj.getName());
                System.out.println(obj.getAbsolutePath());
                System.out.println(obj.canWrite());
                System.out.println(obj.canRead());
                System.out.println(obj.length());
            }else{
                System.out.println("File doesn't exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occured");
        }

    }
}


//Writting on file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {

    public static void main (String[] args) {
        
        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code
        
        //You may edit the location of file as desired
        
        try{
            File obj=new File("D:\\File.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }else{
                System.out.println("File already exists.");
            }
            
            
            //FileWrite object creation to write a file
            FileWriter wr=new FileWriter("D:\\File.txt");
            wr.write("Java is a programming language");
            wr.close();
            System.out.println("Successfully wrote");
        }
        catch (IOException e){
            System.out.println("An error occured");
        }

    }
}

//Reading a file
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main (String[] args) {
        
        //Use the same code in local machine compiler to generate a file named as
        //"File.txt" at location shown in the below code
        
        //You may edit the location of file as desired
        
        try{
            File obj=new File("D:\\File.txt");
            if(obj.createNewFile()){
                System.out.println(obj.getName());
            }else{
                System.out.println("File already exists.");
            }
            
            //FileWrite object creation to write a file
            FileWriter wr=new FileWriter("D:\\File.txt");
            wr.write("Java is a programming language");
            wr.close();
            System.out.println("Successfully wrote");


            //reading a file
            File obj_1=new File("D:\\File.txt");
            Scanner myReader=new Scanner(obj_1);
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (IOException e){
            System.out.println("An error occured");
        }

    }
}