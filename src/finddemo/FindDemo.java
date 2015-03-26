package finddemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UnknownFormatConversionException;

public class FindDemo {

  public static void main(final String[] args) {

    try {
      FindDemo.bcImpossibleCast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
    
    try {
      FindDemo.bcImpossibleDowncast();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.bcImpossibleInstanceOf();
  
    try {
      FindDemo.bcImpossibleDowncastOfArray();
    } catch (final ClassCastException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.dmiBigDecimalConstructedFromDouble();
   
    FindDemo.esComparingStringsWithEq();
 
    try {
      FindDemo.vaFormatStringIllegal();
    } catch (final UnknownFormatConversionException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }
   
    FindDemo.rvReturnValueIgnored();
  
    try {
      FindDemo.npAlwaysNull();
    } catch (final NullPointerException e) {
      System.out.println("   - ERROR:" + e.getMessage());
    }

    FindDemo.qabQuestionableBooleanAssignment();
  
  }

  private static void bcImpossibleCast() {
    Object doubleValue = 1.0;
    System.out.println("   - " + doubleValue);
  }

  private static void bcImpossibleDowncast() {
    final SecurityException value = new SecurityException("abc");
    System.out.println("   - " + value.getMessage());
  }

  private static void bcImpossibleInstanceOf() {
    final Object value = 1.0;
    System.out.println("   - " + value);
  }

  private static void bcImpossibleDowncastOfArray() {
    final Collection<String> stringVector = new ArrayList<>();
    stringVector.add("abc");
    stringVector.add("xyz");
    System.out.println("   - " + stringVector.size());
  }

  private static void dmiBigDecimalConstructedFromDouble() {
    final double doubleVal = 3.1;
    System.out.println("   - " + doubleVal);
  }

  private static void esComparingStringsWithEq() {
    final StringBuilder sb1 = new StringBuilder("1234");
    final StringBuilder sb2 = new StringBuilder("1234");
    final String string1 = sb1.toString();
    final String string2 = sb2.toString();
    System.out.println("   - " + (string1.equals(string2)));
  }

  private static void vaFormatStringIllegal() {
    System.out.println(String.format("   - %s  %s", "10", "9"));
  }

  private static void rvReturnValueIgnored() {
    final BigDecimal bigDecimal = BigDecimal.ONE;
    System.out.println(String.format("   - " + bigDecimal));
  }

  private static void npAlwaysNull() {
    final String value = "not null";
    System.out.println(String.format("   - " + value));
  }

  private static void qabQuestionableBooleanAssignment() {
    System.out.println(String.format("   - value is false"));
  }

}
