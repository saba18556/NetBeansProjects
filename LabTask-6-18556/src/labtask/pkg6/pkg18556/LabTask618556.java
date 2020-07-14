
package labtask.pkg6.pkg18556;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LabTask618556 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
       if (args.length != 2) {
 System.out.println(
 "Usage: java Copy sourceFile targetfile");
 System.exit(1);
 }

 File sourceFile = new File(args[0]);
 if (!sourceFile.exists()) {
 System.out.println("Source file " + args[0] + " does not exist");

    System.exit(2);
 }

 File targetFile = new File(args[1]);
 if (targetFile.exists()) {
 System.out.println("Target file " + args[1]+ " already exists");
 System.exit(3);
 }

 try (
 BufferedInputStream input =
 new BufferedInputStream(new FileInputStream(sourceFile));

 BufferedOutputStream output =
 new BufferedOutputStream(new FileOutputStream(targetFile));
 ) {
 int r, numberOfBytesCopied = 0;
 while ((r = input.read()) != -1) {
 output.write((byte)r);
 numberOfBytesCopied++;
 }
 System.out.println(numberOfBytesCopied + " bytes copied");
 }
 }
 }
    

