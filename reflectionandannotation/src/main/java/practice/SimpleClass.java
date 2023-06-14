package main.java.practice;

import java.util.Date;

public class SimpleClass {
    
    @SetValue(value = "text")
    private String string;
    private Integer integer;
    private Date date;
    
    public String publicString;
    public Integer publicInteger;
    public Date publicDate;
    
    @Override
    public String toString() {
        return "SimpleClass{" +
               "string='" + string + '\'' +
               ", integer=" + integer +
               ", date=" + date +
               ", publicString='" + publicString + '\'' +
               ", publicInteger=" + publicInteger +
               ", publicDate=" + publicDate +
               '}';
    }
    
    @Invoke
    public void printHelloWorld() {
        System.out.println("Hello world");
    }
}
