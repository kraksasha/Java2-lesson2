public class MyArrayDataException extends Throwable{
    private int indexI;
    private int indexJ;

    public  MyArrayDataException(int indexI, int indexJ){
        this.indexI = indexI;
        this.indexJ = indexJ;
    }

    public int getIndexI() {
        return indexI;
    }

    public void setIndexI(int indexI) {
        this.indexJ = indexI;
    }

    public int getIndexJ() {
        return indexJ;
    }

    public void setIndexJ(int indexJ) {
        this.indexJ = indexJ;
    }

}
