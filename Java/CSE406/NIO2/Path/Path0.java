import java.nio.file.FileSystem;  //interface
import java.nio.file.Path;        //interface
import java.nio.file.FileSystems; //class
import java.nio.file.Paths;       //class

class Path0 {
    public static void main(String[] args) {
      FileSystem fs = FileSystems.getDefault();

      // initialize paths
      Path p1 = fs.getPath("/home/umang/Desktop/main.js");
      Path p2 = Paths.get("/home/umang/Desktop/hello.txt");
      Path p3 = Paths.get("/home/umang", "Desktop", "hello.txt");

      // print paths
      System.out.println("p1: " + p1);
      System.out.println("p2: " + p2);
      System.out.println("p3: " + p3);

      // access components of path
      System.out.println("File Name: " + p1.getFileName());
      System.out.println("Parent: " + p1.getParent());
      System.out.println("Root: " + p1.getRoot());
      System.out.println("Name Count: " + p1.getNameCount());

      // operate on path
      System.out.println("p1 normalize: " + p1.normalize());
      System.out.println("p1 toUri: " + p1.toUri());
      System.out.println("p1 toAbsolutePath: " + p1.toAbsolutePath());
      System.out.println("p1 subpath(0,2): " + p1.subpath(0,2));
      System.out.println("p1 subpath(0,4): " + p1.subpath(0,4));
      System.out.println("p1 resolve: " + p1.resolve(p2));
      System.out.println("p1 relativize(p2): " + p1.relativize(p2));
      System.out.println("p2 relativize(p3): " + p2.relativize(p3));

      // compare paths
      System.out.println("p2 == p3: " + p2.equals(p3));
      System.out.println("p2 startsWith- /home: " + p2.startsWith("/home"));
      System.out.println("p1 endsWith- hello.txt: " + p2.endsWith("hello.txt"));


      System.out.println("File System: " + p1.getFileSystem());
      System.out.println("p1 isAbsolute: " + p1.isAbsolute());
      System.out.println("File Name: " + p1.getName(2));
    }
}
