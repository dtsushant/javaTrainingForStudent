package exceptionhandling;

public class NumberNotInRangeException extends Exception{

    private Integer minRange;
    private Integer maxRange;
    private Integer valueEntered;

    public NumberNotInRangeException(Integer minRange,Integer maxRange,Integer valueEntered){
        super();
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.valueEntered = valueEntered;
    }

    public NumberNotInRangeException(String message,Integer minRange,Integer maxRange,Integer valueEntered){
        super(message);

        this.minRange = minRange;
        this.maxRange = maxRange;
        this.valueEntered = valueEntered;

    }

    public String toString(){
        return String.format("%s \nThe value %d is not in the range of %d & %d",super.toString(),valueEntered,minRange,maxRange);
    }



}
