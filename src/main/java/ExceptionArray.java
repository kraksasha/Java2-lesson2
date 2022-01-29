public class ExceptionArray {

    public static void main(String[] args) {
       String massive[][] = new String[4][4];
        for (int i = 0; i < massive.length; i++){
            for (int j = 0; j < massive[0].length; j++){
                massive[i][j] = String.valueOf((int)(Math.random()*100));
            }
        }
        //massive[2][1] = "s345";
        try {
            System.out.println(arrayElementSum(massive));
        } catch (MyArraySizeException e){
            System.out.println("Не правильный размер массива");
        } catch (MyArrayDataException e){
            System.out.println("Не верные данные в ячейке " + "i = " + e.getIndexI() + " j = " + e.getIndexJ());
        }
    }

    public static int arrayElementSum(String a[][]) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        char c[];
        int h = 0;
            if ((a.length != 4) || (a[0].length != 4)){
                throw new MyArraySizeException();
            }
            for (int i = 0; i < a.length; i++){
                for (int j = 0; j < a[0].length; j++){
                    c = a[i][j].toCharArray();
                    for (int k = 0; k < c.length; k++){
                        if (Character.isDigit(c[k])){
                            h = h + 1;
                        }
                    }
                    if (h == c.length) {
                        sum = sum + Integer.parseInt(a[i][j]);
                        h = 0;
                    } else {
                        throw new MyArrayDataException(i,j);
                    }
                }
            }
        return sum;
    }

}
