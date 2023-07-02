package com.javalesson.javaio;

import com.javalesson.collection.map.treemap.AverageStudentGrade;
import com.javalesson.collection.map.treemap.SubjectGrade;
import com.javalesson.collection.map.treemap.TreeMapRunner;


import java.io.*;
import java.util.*;

public class IOMain {
    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";
    private static final String BUFFERED_FILE = "Buffered.bin";


    public static void main(String[] args) throws IOException {

        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Writer writer = new Writer();
        writer.writeFile(grades, FILE_NAME);

//        writer.writeWithFormatter(FILE_NAME);

        Reader reader = new Reader();

//        reader.readFile(FILE_NAME);

//        processGrades(grades, writer, BINARY_FILE);
//        outputObjects(reader, BINARY_FILE);

        FileUtils utils = new FileUtils();
//        utils.printIOFileDetails("./");
//        utils.printNioFileDetail(FILE_NAME);
//        reader.readFileInFull(FILE_NAME);

//        Работа с NIO
//        Работа с буферизированными объектами
//        writer.nioWriteWithBuffer(BUFFERED_FILE);
//        reader.nioReadFileWithBuffer(BUFFERED_FILE);
//        Работа с потоками
//      writer.nioWriterWithStream(BUFFERED_FILE);
//        reader.nioReaderWithStream(BUFFERED_FILE);

//        Работа с Chanel
//        writer.nioWriterWithChanel(BUFFERED_FILE);
//        reader.nioReadWithChanel(BUFFERED_FILE);

//        Работа с RandomAccess
//        writer.writeWithRandomAccess(FILE_NAME);

        utils.processDir();

    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String fileName) {

        List<Student> students = new ArrayList<>();

        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(), gradeKey.getAverageGrade(), grades.get(gradeKey)));
        }
        writer.writeObject(students, fileName);
    }

    private static void outputObjects(Reader reader, String fileName) {
        List<Student> students = reader.readObject(fileName);
        for (Student student : students) {
            System.out.printf("%s, %.2f %n", student.getStudentName(), student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }

}
