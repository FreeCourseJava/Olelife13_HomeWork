import java.util.Arrays;

public class Les32 {
    public static void main(String[] arg) {

        int [] massData = {1208, 1552, 732, 1438, 1552, 1917, 1708, 1714, 1718, 1773, 1804, 1905, 1920, 1927, 1939, 1990, 1991, 1992, 1994, 2006};

        System.out.println("Исходный массив: " + Arrays.toString(massData));

        int [] resultSortMassData = sortMassData(massData);

        System.out.println("Отсортированный массив: " + Arrays.toString(resultSortMassData));

    }


    public static int [] sortMassData(int[] massData) {

        int dlinMassData = massData.length - 1;
        for (int v = dlinMassData; v > 0; v--) {
            for (int i = 0; i < v; i++) {
                if (massData[i] > massData[i + 1]) {
                    int vremMass = massData[i];
                    massData[i] = massData[i + 1];
                    massData[i + 1] = vremMass;
                }
            }
        }

        return massData;
    }
}

