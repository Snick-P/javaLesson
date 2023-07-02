package com.javalesson.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileUtils {

    public void printIOFileDetails(String path) throws IOException {
        File file = new File(path);
        System.out.println("Absolute path " + file.getAbsolutePath());
        System.out.println("Relation path " + file.getPath());
        System.out.println("Free space in MBytes " + file.getFreeSpace() / 1000000);
        System.out.println("Parent directory " + file.getParent());
        System.out.println("Is absolute path " + file.isAbsolute());

        System.out.println("Current directory is " + System.getProperty("user.dir"));

        if (file.isDirectory()) {
            System.out.println("It is a directory. Printing context: ");
            String[] list = file.list();
            if (list != null) {
                for (String el : list) {
                    System.out.println(el);
                }
            }
        } else {
            System.out.println("It is a file");
            System.out.println("Creating new file " + file.createNewFile());
            System.out.println("Can read - " + file.canRead());
            System.out.println("Can write - " + file.canWrite());
            System.out.println("Can execute - " + file.canExecute());
            System.out.println("File is hidden " + file.isHidden());
            System.out.println("Last modified " + file.lastModified());
            System.out.println("Deleting file " + file.delete());
        }

    }

    public void printNioFileDetail(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        Path path1 = FileSystems.getDefault().getPath(fileName);
        Path path2 = Paths.get(System.getProperty("user.dir", fileName));
        Path absPath = path.toAbsolutePath();
        Path path3 = Paths.get("../../");

        System.out.println("File name " + path.getFileName());
        System.out.println("Root directory " + absPath.getRoot());
        System.out.println("Absolute path " + absPath);
        System.out.println("Parents directory " + absPath.getParent());
        System.out.println("Name count " + absPath.getNameCount());
        System.out.println("Sub-paths " + absPath.subpath(0, 3));
        System.out.println("To absolute paths " + path3.toRealPath());

        System.out.println("File exist " + Files.exists(path));
        System.out.println("File does not exist " + Files.notExists(path));
        System.out.println("Is readable " + Files.isReadable(path));
        System.out.println("Is writable " + Files.isWritable(path));
        System.out.println("Is executable " + Files.isExecutable(path));
        System.out.println("Is the same file " + Files.isSameFile(path, path1));

        Path parentPath = absPath.getParent();
        Path filesPath = parentPath.resolve("files");
        if (Files.notExists(filesPath)) {
            Files.createDirectories(filesPath);
        }
        Files.move(absPath, filesPath.resolve(path), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(filesPath.resolve(path));
        Files.delete(filesPath);

    }

    public void processDir() throws IOException {
        Path dir = Paths.get("temp");
        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
        }
        Files.createDirectories(Paths.get("temp/a/b/c"));
        Files.createTempDirectory(dir, "tmp");

        Iterable<Path> rootDirectories = FileSystems.getDefault().getRootDirectories();

        for (Path rootDir : rootDirectories) {
            System.out.println(rootDir);
        }

        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isDirectory(entry);
            }
        };

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(dir, filter)) {
            for (Path p: paths){
                System.out.println(p);
            }
        }

    }
}
