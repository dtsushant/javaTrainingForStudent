package dataentry;

public class NumberNotInRangeException extends Exception {

    private Integer minRange;
    private Integer maxRange;
    private Integer enteredValue;

    public NumberNotInRangeException(Integer minRange, Integer maxRange,Integer enteredValue){
        super();
        this.minRange= minRange;
        this.maxRange= maxRange;
        this.enteredValue = enteredValue;
    }

    public NumberNotInRangeException(Integer minRange, Integer maxRange, Integer enteredValue,String message){
        super(message);
        this.minRange= minRange;
        this.maxRange= maxRange;
        this.enteredValue = enteredValue;
    }

    public String toString(){
        return String.format("THe value entered %d is not in range within %d and %d",enteredValue,minRange,maxRange);
    }




}
