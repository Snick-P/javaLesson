package com.javalesson.javaio;

import sun.util.resources.LocaleData;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileTreeVisitor {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");
        Files.walkFileTree(path, new Visitor());

    }

    public static class Visitor extends SimpleFileVisitor<Path> {

        private static void renameFile(Path file) throws IOException {
            int nameCount = file.getNameCount();
            if (nameCount > 1) {
                Path startPath = file.subpath(0, nameCount - 1);
                Path endPath = file.subpath(nameCount - 1, nameCount);
                System.out.println(file);
                Files.move(file, Paths.get(startPath + File.separator + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "  " + endPath));
            }
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            renameFile(file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println(dir);

            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            renameFile(dir);
            return FileVisitResult.CONTINUE;
        }
    }


}
