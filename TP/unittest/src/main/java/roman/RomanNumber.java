
package roman;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.HashMap;

public final class RomanNumber extends Number {

  public static final long serialVersionUID = 1L;

  // Table des symboles
  private static final LinkedHashMap<String, Integer> SYMBOLS = new LinkedHashMap<>();
  static {
    SYMBOLS.put("M",  1000);
    SYMBOLS.put("CM", 900);
    SYMBOLS.put("D",  500);
    SYMBOLS.put("CD", 400);
    SYMBOLS.put("C",  100);
    SYMBOLS.put("XC", 90);
    SYMBOLS.put("L",  50);
    SYMBOLS.put("XL", 40);
    SYMBOLS.put("X",  10);
    SYMBOLS.put("IX", 9);
    SYMBOLS.put("V",  5);
    SYMBOLS.put("IV", 4);
    SYMBOLS.put("I", 1);
  }

  // Expression reguliere de validation
  private static final Pattern VALIDATION_RE = Pattern.compile(
      "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");

  private final int value;

  public RomanNumber(String romanValue) {
    this.value = fromRoman(romanValue);
  }

  public RomanNumber(int value) {
    this.value = value;
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public double doubleValue() {
    return fromRoman(String.valueOf(this.value));
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public float floatValue() {
     return fromRoman(String.valueOf(this.value));
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public int intValue() {
    return fromRoman(String.valueOf(this.value));
  }

  /**
   * @{inheritDoc}
   */
  @Override
  public long longValue() {
     return fromRoman(String.valueOf(this.value));
  }

  @Override
  public String toString() {
    return toRoman(this.value);
  }

  public static RomanNumber valueOf(String roman) {
    return new RomanNumber(roman);
  }

  public static RomanNumber valueOf(int value) {
    return new RomanNumber(value);
  }
  
  public static void valueOf(double value) {
    throw new IllegalArgumentException();
  }

	 public static String SousChaine(String s, Integer index, Integer indexMax)
  {
	  if (indexMax-index==1) {
		  return(s.substring(index));
	  }
	  else {
		  return(s.substring(index,index+1));
	  }
  }
  
  

  private static int fromRoman(String romanValue) {
    int resultat=0;
    int index=0;
    for (HashMap.Entry<String, Integer> entry : SYMBOLS.entrySet()) 
    {
        String symbole = entry.getKey();
        Integer nombre = entry.getValue();
        Integer longueur = symbole.length();
        while(SousChaine(romanValue,index,longueur).compareTo(symbole)== 0)
        {
        	resultat = resultat + nombre;
        	index = index+longueur;
        }
    }
    if (index!=romanValue.length())
	 {
		 throw new IllegalArgumentException("L'ecriture en romain n'est pas possible");
	 }
    return resultat;
  }

  private static String toRoman(int value) {
	  String resultat = "";
	  int n=value;
	  if (n<=0 || n>3999)
	  {
		  throw new IllegalArgumentException("Le nombre n'est pas pris en charge");
	  }
	  for (HashMap.Entry<String, Integer> entry : SYMBOLS.entrySet()) {
	        String symbole = entry.getKey();
	        Integer nombre = entry.getValue();
	        while(n>=nombre){
	        	resultat = resultat + symbole;
	        	n=n-nombre;
	        }
	    }
    return resultat;
  }
  
}
