package jp.cstudio.codereview.findbugs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cat {
    public static void main(String... args) throws IOException
    {
        boolean ignore = ("Hello" == args[0]);
        Files.lines(Paths.get(args[0])).forEach(System.out::println);
    }
}
