import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.nio.file.Files;
// import javax.security.auth.kerberos.DelegationPermission;

class A {
    public static void main(String[] args) throws Exception {

        File dir = new File("./mca");
        int numberOfSubfolders = 0;
        File listDir[] = dir.listFiles();
        for (int i = 0; i < listDir.length; i++) {
            if (listDir[i].isDirectory()) {
                numberOfSubfolders++;
            }
        }
        System.out.println("No of dir " + numberOfSubfolders);

        File p1 = new File("./phd");
        if (numberOfSubfolders > 2) {
            boolean b1 = p1.mkdir();
            try {

                FileReader fr = new FileReader("./mca/a.txt");

                FileWriter fw = new FileWriter("./phd/a.txt");

                String str = "";

                int i;

                while ((i = fr.read()) != -1) {

                    str += (char) i;
                }

                System.out.println(str);

                fw.write(str);

                fr.close();
                fw.close();

                File oldFile = new File("./mca/a.txt");
                boolean b2 = oldFile.delete();

                System.out.println(
                        "File reading and writing both done");
            } catch (Exception e) {
                System.out.println(
                        "There are some IOException");

            }
        }
    }
}
