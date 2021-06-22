package com.fju;


import java.util.Scanner;
import java.io.*;




public class Tester {
    public static void main(String[] args) throws IOException{
        int total = 0;
        int num;
        int id;
        int keepgo = 1;
        int finish;
        int b = 0, c = 0;
        int[][] TicketArray = new int[100][100];
        Ticket[] tickets = new Ticket[3];
        tickets[0] = new Ticketkid();
        tickets[1] = new Ticketadult();
        tickets[2] = new Ticketold();



        System.out.println("-------------------------------------------");
        System.out.println("welom to the pervert Circus , We have three kinds of tickets");
        Scanner scan = new Scanner(System.in);


        while (keepgo==1){
            System.out.println("-------------------------------------------");
            System.out.println("ID                   Name              Price" );
            for(Ticket ticket : tickets)
            {
                System.out.println(ticket.id+"\t"+ticket.name+"\t"+ticket.price+"\t");
            }
            System.out.println("-------------------------------------------");
            System.out.println("Please enter id of the ticket and then  enter how many ticket you want in the second raw ");
            id = scan.nextInt();
            num = scan.nextInt();
            b++;
            TicketArray[b][0]= id;
            TicketArray[b][1]= num;

            for(Ticket ticket : tickets)
            {
                if(id == ticket.id)
                {
                    total = total+ticket.count(num, ticket.price);


                }
            }
            System.out.println("-------------------------------------------");
            System.out.println("total price : "+total);

            c=c+num;
            System.out.println("total  : "+c);
            System.out.println("To continue,Please press 1 \n If you have done please press 2 ");
            keepgo = scan.nextInt();


        }

        StringBuilder sb = new StringBuilder();
        sb.append("your tickets :\n");


        System.out.println("-------------------------------------------");
        System.out.println("your tickets");
        for(int i=1;i<=b;i++){
            for(Ticket ticket : tickets)
            {
                if(TicketArray[i][0]==ticket.id)
                {
                    System.out.println(ticket.name+"*"+TicketArray[i][1]);
                    sb.append(ticket.name+"*"+TicketArray[i][1]+"\n");
                }

            }
        }
        System.out.println("total money : " + total);
        sb.append("total money : " + total);
        System.out.println("-------------------------------------------");
        System.out.println("confirm please press 1, To delete please press 2");
        finish= scan.nextInt();
        if (finish == 1)

        {
            System.out.println("-------------------------------------------");
            System.out.println("your tickets have been confirm");
            System.out.println("-------------------------------------------");
        }
        else
        {
            System.out.println("Please re-register");
        }




        FileWriter fw = new FileWriter("Myfile.txt");


        fw.write(sb.toString());

        fw.close();
        System.out.println("check your ticket on my file");
    }




    }

