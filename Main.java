package com.company;


import java.util.*;



public class Main {

    public static void main(String[] args) {

        ArrayList<String> riceCatalogue = new ArrayList<String>();
        riceCatalogue.add("white rice");
        riceCatalogue.add("brown rice");
        riceCatalogue.add("no rice");


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
        BeanCatalogue.add("no beans");


        ArrayList<String> SalsaCatalogue = new ArrayList<String>();
        SalsaCatalogue.add("mild salsa");
        SalsaCatalogue.add("medium salsa");
        SalsaCatalogue.add("hot salsa");
        SalsaCatalogue.add("");
        SalsaCatalogue.add("mild salsa, medium salsa, hot salsa");


        ArrayList<String> VeggiesCatalogue = new ArrayList<String>();
        VeggiesCatalogue.add("lettuce ");
        VeggiesCatalogue.add("fajita veggies");
        VeggiesCatalogue.add("veggies");
        VeggiesCatalogue.add("");
        VeggiesCatalogue.add("veggies, lettuce, fagita veggies");

        ArrayList<String> Cheesechoice = new ArrayList<String>();

        Cheesechoice.add("Cheese");
        Cheesechoice.add("no");


        ArrayList<String> Guacchoice = new ArrayList<String>();
        Guacchoice.add("Guac");
        Guacchoice.add("no ");
        ArrayList<String> Quesochoice = new ArrayList<String>();
        Quesochoice.add("Queso");
        Quesochoice.add("no ");
        ArrayList<String> SourCream = new ArrayList<String>();
        SourCream.add("sour cream");
        SourCream.add("no ");




        String[] Burito = new String[26];
        for (int i = 1; i < Burito.length; i++) {
            double itemCost = .50;
            double totalCost = 3 + (9*itemCost);
            int nonCount = 0;
            int allCount = 0;
            String rice = randomItem(riceCatalogue);
            String meat = randomItem(MeatCatalogue);
            String bean = randomItem(BeanCatalogue);
            String salsa = randomItem(SalsaCatalogue);
            String veggies = randomItem(VeggiesCatalogue);
            String Cheese = randomItem(Cheesechoice);

            if (Cheese.equalsIgnoreCase("no")){
                Cheese = "";
            }
            String Guac = randomItem(Guacchoice);
            if (Guac.equalsIgnoreCase("yes")){
                Guac = "";
            }
            String Queso = randomItem(Quesochoice);
            if (Queso.equalsIgnoreCase("yes")){
                Queso = "Queso";
            }
            String cream = randomItem(SourCream);

            if (cream.equalsIgnoreCase("yes")){
                cream = "source cream";
            }
            String itemString = rice + ", " + meat + ", " + bean + ", " + salsa+ ", " +veggies+ ","+ Cheese +","+ Guac+ ","+ Queso+","+cream;
            String itemArray[] = itemString.split(", ");



            for(int x = 0; x < itemArray.length; x++){
                if(itemArray[x].equalsIgnoreCase("no rice")||itemArray[x].equalsIgnoreCase("no beans")){
                    nonCount++;
                }
                else if(itemArray[x].equalsIgnoreCase("mild salsa, medium salsa, hot salsa")|| itemArray[x].equalsIgnoreCase("veggies, lettuce, fagita veggies")){
                    allCount++;

                }

                if(nonCount > 0){
                    totalCost = totalCost - (nonCount*itemCost);
                }
                if (allCount > 0){
                    totalCost = totalCost + ((itemCost*3)*allCount);
                }


            }




                System.out.println("Burito " + i + ": " + rice + ", " + meat + ", " + bean + ", " + salsa + ", " + veggies+ ","+ Cheese
                    +","+ Guac+ "," + Queso+","+ cream +": "+ totalCost );
        }


    }





    public static String randomItem(ArrayList<String> itemList) {
        Random rand = new Random();
        String randomItem = itemList.get(rand.nextInt(itemList.size()));

        return randomItem;

    }
}