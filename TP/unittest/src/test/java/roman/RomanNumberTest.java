package roman;

import java.util.HashMap;
import java.util.Map;

import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class RomanNumberTest {
  public static final HashMap<Integer, String> KNOWN_VALUES = new HashMap<>();
  static {
    KNOWN_VALUES.put(1, "I");
    KNOWN_VALUES.put(2, "II");
    KNOWN_VALUES.put(3, "III");
    KNOWN_VALUES.put(4, "IV");
    KNOWN_VALUES.put(5, "V");
    KNOWN_VALUES.put(6, "VI");
    KNOWN_VALUES.put(7, "VII");
    KNOWN_VALUES.put(8, "VIII");
    KNOWN_VALUES.put(9, "IX");
    KNOWN_VALUES.put(10, "X");
    KNOWN_VALUES.put(50, "L");
    KNOWN_VALUES.put(100, "C");
    KNOWN_VALUES.put(500, "D");
    KNOWN_VALUES.put(1000, "M");
    KNOWN_VALUES.put(31, "XXXI");
    KNOWN_VALUES.put(148, "CXLVIII");
    KNOWN_VALUES.put(294, "CCXCIV");
    KNOWN_VALUES.put(312, "CCCXII");
    KNOWN_VALUES.put(421, "CDXXI");
    KNOWN_VALUES.put(528, "DXXVIII");
    KNOWN_VALUES.put(621, "DCXXI");
    KNOWN_VALUES.put(782, "DCCLXXXII");
    KNOWN_VALUES.put(870, "DCCCLXX");
    KNOWN_VALUES.put(941, "CMXLI");
    KNOWN_VALUES.put(1043, "MXLIII");
    KNOWN_VALUES.put(1110, "MCX");
    KNOWN_VALUES.put(1226, "MCCXXVI");
    KNOWN_VALUES.put(1301, "MCCCI");
    KNOWN_VALUES.put(1485, "MCDLXXXV");
    KNOWN_VALUES.put(1509, "MDIX");
    KNOWN_VALUES.put(1607, "MDCVII");
    KNOWN_VALUES.put(1754, "MDCCLIV");
    KNOWN_VALUES.put(1832, "MDCCCXXXII");
    KNOWN_VALUES.put(1993, "MCMXCIII");
    KNOWN_VALUES.put(2074, "MMLXXIV");
    KNOWN_VALUES.put(2152, "MMCLII");
    KNOWN_VALUES.put(2212, "MMCCXII");
    KNOWN_VALUES.put(2343, "MMCCCXLIII");
    KNOWN_VALUES.put(2499, "MMCDXCIX");
    KNOWN_VALUES.put(2574, "MMDLXXIV");
    KNOWN_VALUES.put(2646, "MMDCXLVI");
    KNOWN_VALUES.put(2723, "MMDCCXXIII");
    KNOWN_VALUES.put(2892, "MMDCCCXCII");
    KNOWN_VALUES.put(2975, "MMCMLXXV");
    KNOWN_VALUES.put(3051, "MMMLI");
    KNOWN_VALUES.put(3185, "MMMCLXXXV");
    KNOWN_VALUES.put(3250, "MMMCCL");
    KNOWN_VALUES.put(3313, "MMMCCCXIII");
    KNOWN_VALUES.put(3408, "MMMCDVIII");
    KNOWN_VALUES.put(3501, "MMMDI");
    KNOWN_VALUES.put(3610, "MMMDCX");
    KNOWN_VALUES.put(3743, "MMMDCCXLIII");
    KNOWN_VALUES.put(3844, "MMMDCCCXLIV");
    KNOWN_VALUES.put(3888, "MMMDCCCLXXXVIII");
    KNOWN_VALUES.put(3940, "MMMCMXL");
    KNOWN_VALUES.put(3999, "MMMCMXCIX");
  }

  // String -> RomanNumber
  //Donner les bonnes valeurs arabes pour des valeurs romaines connues?
  @Test
  public void fromRomanKnownValues() {
    for (Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()) {
      assertThat(RomanNumber.valueOf(v.getValue()).intValue(), is(v.getKey()));
    }
  }
  

  //Donner les bonnes valeurs romaines pour des valeurs décimales connues.
@Test
public void fromArabKnownValues() {
    for (Map.Entry<Integer, String> v : KNOWN_VALUES.entrySet()) { 
    assertThat(v.getKey(),is(RomanNumber.valueOf(v.getValue()).intValue()));
    }
  }

  // int -> RomanNumber
  @Test(expected = IllegalArgumentException.class)
  public void toRomanZero() {
    RomanNumber.valueOf(0);
  }
  //junit.org class assert
  


  //Échouer (lever une exception) pour des valeurs négatives
  @Test(expected = IllegalArgumentException.class)
  public void negNumber(){
  	RomanNumber.valueOf(-1);
  }
  
  //Échouer pour des valeurs non entières
 @Test(expected = IllegalArgumentException.class)
  public void nonEntierNumber(){
  	RomanNumber.valueOf(2.25);
  }
  
 //Échouer pour des valeurs en dehors de l’intervalle [1, 3999]
 @Test(expected = IllegalArgumentException.class)
  public void nonInterNumber(){
  	RomanNumber.valueOf(4000);
  }
 //Échouer pour des valeurs avec trop de répétitions de symboles
 @Test(expected = IllegalArgumentException.class)
  public void repetNumber(){
  	RomanNumber.valueOf("IIII");
  }
  //Échouer pour des valeurs avec des répétitions de paires
  @Test(expected = IllegalArgumentException.class)
  public void repetPaireNumber(){
  	RomanNumber.valueOf("VV");
  }
 //Échouer pour des valeurs avec des antécédents incorrects
@Test(expected = IllegalArgumentException.class)
  public void antecedantNumber(){
  	RomanNumber.valueOf("IC");
  }
	
// toRoman retourne des capitales
@Test
  public void capitalNumber(){
	RomanNumber.valueOf("II");
  }

//fromRoman échoue si on n’a pas que des capitales
@Test(expected = IllegalArgumentException.class)
  public void pasCapitalNumber(){
	RomanNumber.valueOf("ii");
  }
  
}
