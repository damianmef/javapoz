package RandomUser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
/**
 * Created by RENT on 2017-08-01.
 */


/**
 *  1. Wczytywanie użytkowników z pliku do tablicy.
 2. Wylosowanie 1 użytkownika z puli nieoznaczonych.
 3. Wyświetlenie wylosowanego użytkownika
 4. Oznaczenie wylosowanego użytkownika
 5. Jeśli liczba użytkowników nieoznaczonych jest większa od 0 wróć do punktu 2
 */
public class RandomUser {
    private static String[] usersList = new String[14];
    private static String[] usersRandomed = new String[14];
    private static int randomIndex = 0;

    public static void main(String[] args)  {

        try {
            usersList = AssignUsers();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();
        RandomUser();



        for (int i = 0; i <usersRandomed.length; i++){
            System.out.println(usersRandomed[i]);
        }
    }

    public static void RandomUser(){
        Random random=new Random();

        boolean doMore = true;

        while(doMore) {
            int randomNumber = random.nextInt(14);
            for (int i = 0; i < usersRandomed.length; i++) {
                if (usersList[randomNumber].equals(usersRandomed[i])) {
                    break;
                }
                else if (usersRandomed[i] == null) {
                    usersRandomed[randomIndex] = usersList[randomNumber];
                    randomIndex++;
                    doMore = false;
                    break;
                }
            }
        }
    }


    public static String[] AssignUsers () throws IOException {

        String[] usersArray = new String[14];
        FileReader file = new FileReader("src/RandomUser/users.txt");
        BufferedReader buffer = new BufferedReader(file);
        String lines; int i = 0;

        while((lines = buffer.readLine()) != null) {
            usersArray[i] = lines;
            i++;
        }
        file.close();

        return usersArray;
    }
}
