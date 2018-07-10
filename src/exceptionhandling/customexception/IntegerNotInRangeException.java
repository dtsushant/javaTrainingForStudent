package exceptionhandling.customexception;

public class IntegerNotInRangeException extends Exception {

    public int minRange=0;

    public int maxRange = 0;

    public int providedInput = 0;

    public IntegerNotInRangeException(){
        super();
    }

    public IntegerNotInRangeException(String message){
        super(message);
    }

    public String toString(){
        return String.format(super.toString()+":::: the provided value %d is not in range of between %d and %d",providedInput,minRange,maxRange);
    }
}
