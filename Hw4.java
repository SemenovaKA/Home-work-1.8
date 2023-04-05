/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.hw4;

import static com.sun.xml.internal.ws.api.message.HeaderList.copy;
import static java.nio.file.Files.copy;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.copy;
import java.util.List;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Home
 */
public class Hw4 {

    public static void main(String[] args) {
        System.out.println("Semenova Ksenia var№4\n");
        List<People> people=new ArrayList<>();
        people.add(new People(673490,"Смирнов Владимир Олегович","охранник",false));
        people.add(new People(239045,"Соколова Дарья Валерьевна","менеджер",true));
        people.add(new People(892715,"Егоров Михаил Андреевич","уборщик",false));
        people.add(new People(893729,"Шувалов Дмитрий Анатольевич","директор",true));
        people.add(new People(901527,"Башкиров Роман Петрович","курьер",false));
        Collections.sort(people);
        for (People p:people){
            System.out.println(p.getFIO()+", "+p.getNumber()+", "+p.getPost()+", "+p.isPass());
        }
        System.out.println("  ");
        Collections.sort(people, new SortByNumber());
        for (People p:people){
            System.out.println(p.getFIO()+", "+p.getNumber()+", "+p.getPost()+", "+p.isPass());
        }
        System.out.println("Do you want to add people, yes or no: ");
        Scanner on = new Scanner(System.in);
        String choice= on.nextLine();
        if (choice.equals("yes")){
            Scanner en = new Scanner(System.in);
            System.out.println("How many people do you want to add?: ");
            int count=en.nextInt();
            while(count!=0){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the pass number: ");
                int number= in.nextInt();
                Scanner an = new Scanner(System.in);
                System.out.println("Enter the last name first name and patronymic: ");
                String FIO= an.nextLine();
                System.out.println("Enter the post: ");
                String post= an.nextLine();
                System.out.println("Admission to the close territory, true or folse: ");
                boolean pass= in.nextBoolean();
                people.add(new People(number,FIO,post,pass));
                Collections.sort(people);
                for (People p:people){
                    System.out.println(p.getFIO()+", "+p.getNumber()+", "+p.getPost()+", "+p.isPass());
                }
                System.out.println("  ");
                Collections.sort(people, new SortByNumber());
                int counte;
                counte = Collections.frequency(people, number);
                System.out.println(counte);
                for (People p:people){
                    Collections.frequency(people, number);
                    System.out.println(p.getFIO()+", "+p.getNumber()+", "+p.getPost()+", "+p.isPass());
                }
                count=count-1;
            }
              
        }
        if(choice.equals("no")){
            System.out.println("End of the Program");
        }
        
        
    }
}
