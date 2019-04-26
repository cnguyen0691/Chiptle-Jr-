package com.company;


import java.util.*;



public class Main {

    public static void main(String[] args) {

        ArrayList<String> riceCatalogue = new ArrayList<String>();
        riceCatalogue.add("white rice");
        riceCatalogue.add("brown rice");
        riceCatalogue.add("none");


        ArrayList<String> MeatCatalogue = new ArrayList<String>();
        MeatCatalogue.add("chicken");
        MeatCatalogue.add("steak");
        MeatCatalogue.add("carnidas");
        MeatCatalogue.add("choriza");
        MeatCatalogue.add("sofritas");
        MeatCatalogue.add("veggies");


        ArrayList<String> BeanCatalogue = new ArrayList<String>();
        BeanCatalogue.add("pinto beans");
        BeanCatalogue.add("black beans");
        BeanCatalogue.add("none");


        ArrayList<String> SalsaCatalogue = new ArrayList<String>();
        SalsaCatalogue.add("mild salsa");
        SalsaCatalogue.add("medium salsa");
        SalsaCatalogue.add("hot salsa");
        SalsaCatalogue.add("none");
        SalsaCatalogue.add("all");


        ArrayList<String> VeggiesCatalogue = new ArrayList<String>();
        VeggiesCatalogue.add("lettuce ");
        VeggiesCatalogue.add("fajita veggies");
        VeggiesCatalogue.add("veggies");
        VeggiesCatalogue.add("none");
        VeggiesCatalogue.add("all");

        ArrayList<String> Cheesechoice = new ArrayList<String>();

        Cheesechoice.add("Cheese");
        Cheesechoice.add("no");


        ArrayList<String> Guacchoice = new ArrayList<String>();
        Guacchoice.add("Guac");
        Guacchoice.add("no");
        ArrayList<String> Quesochoice = new ArrayList<String>();
        Quesochoice.add("Queso");
        Quesochoice.add("no");
        ArrayList<String> SourCream = new ArrayList<String>();
        SourCream.add("sour cream");
        SourCream.add("no");




        String[] Burito = new String[26];
        for (int i = 1; i < Burito.length; i++) {
            double itemCost = .50;
            double totalCost = 3 + (10*(itemCost));
            int nonCount = 0;
            int allCount = 0;
            String rice = randomItem(riceCatalogue);
            String meat = randomItem(MeatCatalogue);
            String bean = randomItem(BeanCatalogue);
            String salsa = randomItem(SalsaCatalogue);
            String veggies = randomItem(VeggiesCatalogue);
            String Cheese = randomItem(Cheesechoice);
            String Guac = randomItem(Guacchoice);
            String Queso = randomItem(Quesochoice);
            String cream = randomItem(SourCream);


            if (rice.equalsIgnoreCase("none")){
                rice = "no rice";
            }

            if (salsa.equalsIgnoreCase("none")){
                salsa = "no salsa";
            }

            if(salsa.equalsIgnoreCase("all")){
                salsa = "mild salsa, medium salsa, hot salsa";

            }

            if(veggies.equalsIgnoreCase("all")){
                veggies = "lettuce, fajita veggies, veggies";

            }

            String itemString = rice + ", " + meat + ", " + bean + ", " + salsa+ ", " +veggies+ ", "+ Cheese +", "+ Guac+ ", "+ Queso+", "+cream;
            String itemArray[] = itemString.split(", ");



            for(int x = 0; x < itemArray.length; x++){
                if(itemArray[x].equalsIgnoreCase("none") ||itemArray[x].equalsIgnoreCase("no") ){
                    nonCount++;
                }
                else if(itemArray[x].equalsIgnoreCase("all")){
                    allCount++;

                }

            }


            if(nonCount > 0){
                totalCost = totalCost - (nonCount*itemCost);
            }
            if (allCount > 0){
                totalCost = totalCost + ((itemCost*3)*allCount);
            }

            String newitemString = itemString.replace(", no", "");

            System.out.println("Burito " + i + ": " + newitemString );
            System.out.println("Price: " + totalCost );

        }


    }





    public static String randomItem(ArrayList<String> itemList) {
        Random rand = new Random();
        String randomItem = itemList.get(rand.nextInt(itemList.size()));

        return randomItem;

    }
}