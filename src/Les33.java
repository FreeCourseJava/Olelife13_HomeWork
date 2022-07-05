import java.util.Arrays;

public class Les33 {

     public static void main(String[] arg){

     int dataSearch = 1980;
     int [] massData = {1208, 1552, 732, 1438, 1552, 1917, 1708, 1714, 1718, 1773, 1804, 1905, 1920, 1927, 1939, 1990, 1991, 1992, 1994, 2006};

          System.out.println("Исходный массив: " + Arrays.toString(massData));

          int [] resultSortMassData = sortMassData(massData,dataSearch);

          System.out.println("Отсортированный массив: " + Arrays.toString(resultSortMassData));
}

     public static int [] sortMassData(int[] massData, int dataSearch){
          boolean resSearch = true;
          Arrays.sort(massData,0,(massData.length-1));

          int key = Arrays.binarySearch(massData, dataSearch);

             if (key>=0){
                  System.out.println ("Результат поиска даты: "+ dataSearch +" - "+resSearch+ ". Искомая дата находится на "+key+" месте");
             }
          if (key<0){
             resSearch = false;
          System.out.println ("Результат поиска даты: "+ dataSearch +" - "+resSearch+ ". Такая дата не найдена.");}
          return massData;
     }
}
