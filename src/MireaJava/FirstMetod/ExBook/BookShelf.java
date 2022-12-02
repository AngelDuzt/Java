package MireaJava.FirstMetod.ExBook;

public class BookShelf {
    private Book[] array = new Book[10];

    public void AddBook(Book obj){
        array[0] = obj;
    }
    public int getYearyoung(){
        int x = 9999;
        for(int i = 0; i < array.length; i++){
            if(array[i].getYear() < x){
                x = array[i].getYear();
            }
        }
        return x;
    }
    public int getYearold(){
        int x = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].getYear() > x){
                x = array[i].getYear();
            }
        }
        return x;
    }
}
