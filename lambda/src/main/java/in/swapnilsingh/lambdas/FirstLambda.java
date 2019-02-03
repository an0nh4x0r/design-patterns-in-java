package in.swapnilsingh.lambdas;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) {

//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        FileFilter filterLambda = (pathName) -> pathName.getName().endsWith(".java");

        File dir = new File("./src/main/java/in/swapnilsingh/");
//        File[] files = dir.listFiles(fileFilter);
        File[] files = dir.listFiles(filterLambda);

        for (File f : files) {
            System.out.println(f);
        }

    }

}
