

import java.io.*;

import java.nio.file.*;
        import java.util.Scanner;

public class FileUtilityApp  {
    public static void main (String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Оберіть дію:");
            System.out.println("1. Створити файл");
            System.out.println("2. Створити директорію");
            System.out.println("3. Копіювати файл");
            System.out.println("4. Переглянути вміст директорії");
            System.out.println("5. Порівнянння файлів");
            System.out.print("Ваш вибір: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очищаємо буфер після зчитування числа

            switch (choice) {
                case 1:
                    createFile(scanner);
                    break;
                case 2:
                    createDirectory(scanner);
                    break;
                case 3:
                    copyFile(scanner);
                    break;
                case 4:
                    listFilesInDirectory(scanner);
                    break;
                case 5:
                    ComparingTwoFiles(scanner);
                    break;
                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
    }
    private static void createFile(Scanner scanner){
        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();
        File newFile = new File(fileName);
        try {
            if (newFile.createNewFile()) {
                System.out.println("Файл успішно створений ");
            } else {
                System.out.println("Помилка в створенні файла");
            }
        }
        catch (IOException e){
            System.out.println("Помилка");
        }
    }

   /* private static void createFile(Scanner scanner) {
        System.out.print("Введіть ім'я файлу: ");
        String fileName = scanner.nextLine();
        try {
            Files.createFile(Paths.get(fileName));
            System.out.println("Файл " + fileName + " успішно створено.");
        } catch (IOException e) {
            System.out.println("Помилка створення файлу: " + e.getMessage());
        }
    }


   private static void createDirectory(Scanner scanner) {
        System.out.print("Введіть ім'я директорії: ");
        String dirName = scanner.nextLine();
        try {
            Files.createDirectory(Paths.get(dirName));
            System.out.println("Директорію " + dirName + " успішно створено.");
        } catch (IOException e) {
            System.out.println("Помилка створення директорії: " + e.getMessage());
        }
    }
*/
   private static void createDirectory(Scanner scanner) {
       System.out.print("Введіть ім'я директорії: ");
       String dirName = scanner.nextLine();
       File newDirectory = new File(dirName);

       if (newDirectory.mkdirs()) {
           System.out.println("Папка успішно створена");
       } else {
           System.out.println("Помилка в створенні папки");
       }
   }
    private static void copyFile(Scanner scanner) {
        System.out.print("Введіть ім'я вихідного файлу: ");
        String sourceFileName = scanner.nextLine();
        System.out.print("Введіть ім'я цільового файлу: ");
        String targetFileName = scanner.nextLine();
        try {
            File src = new File(sourceFileName);
            File tar = new File(targetFileName);
            Files.copy(src.toPath(), tar.toPath());
            System.out.println("Файл " + sourceFileName + " успішно скопійовано в " + targetFileName + ".");
        } catch (IOException e) {
            System.out.println("Помилка копіювання файлу: " + e.getMessage());
        }
    }

    private static void listFilesInDirectory(Scanner scanner) {
        System.out.print("Введіть шлях до директорії: ");
        String directoryPath = scanner.nextLine();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            System.out.println("Вміст директорії " + directoryPath + ":");
            for (Path path : directoryStream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Помилка отримання вмісту директорії: " + e.getMessage());
        }
    }
    private static void ComparingTwoFiles(Scanner scanner){
        System.out.print ("Введіть шлях до файлу1: ");
        String filePath1 = scanner.nextLine();
        System.out.print("Введіть шлях до файлу2: ");
        String filePath2 = scanner.nextLine();
        try{
          Path filePathFirst = Path.of(filePath1);
          Path filePathSecond = Path.of(filePath2);
          long mismatch = Files.mismatch(filePathFirst,filePathSecond);
if(mismatch == -1)
    System.out.println("Файли різні");
else
    System.out.println("Файли однакові");
        }
        catch (IOException e){
            System.out.println("Помилка отримання шляху до файлу");
        }
    }
}