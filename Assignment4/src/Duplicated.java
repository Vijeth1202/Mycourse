//1. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
import java.util.*;
public class Duplicated
 {
  
    public static void removeDuplicates(char s[], int n)
    {
        String ans="";
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                if(s[i]==s[j]){
                    break;     
                }              
                               
            }
            if(j==i){          
                ans+=s[i];     
            }                  
        }
        System.out.print(ans);
    }


    public static void main(String[] args)
    
    {
        char s[] = "aaabaababbccbccd".toCharArray();
        int n = s.length;
        removeDuplicates(s, n);
    }
}

//==============================================================================================================

//2. WAP to print Duplicates characters from the String.

 class Duplicayes {
 public static void main(String args[]) {

  String str = "VVVijeth";
  int cnt = 0;
  char[] inp = str.toCharArray();
  System.out.println("Duplicate Characters are:");
  for (int i = 0; i < str.length(); i++) {
   for (int j = i + 1; j < str.length(); j++) {
    if (inp[i] == inp[j]) {
     System.out.println(inp[j]);
     cnt++;
     break;
    } }
  }
  }
  }

//============================================================================================================

//3. WAP to check if “2552” is palindrome or not.

class Palindrome 
{

public static void main(String[] args) 
{

String s1="2552";
String s2="";

for(int i=s1.length()-1;i>=0;i++)
{
	s2=s2+s1.charAt(i);
}
System.out.println(s2);

if(s1.equals(s2))
{
   System.out.println("Number is Palindrome");
}
else
{
   System.out.println("Number is not Palindrome");
}

}
}

//=======================================================================================================================================

//4. WAP to count the number of consonants, vowels, special characters in a String.

class Main 
{

	public static void main(String[] args) 
	{
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the string : ");
		line = sc.nextLine();
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, symbols = 0;

		line = line.toLowerCase();
		for(int i = 0; i < line.length(); ++i)
		{
			char ch = line.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
					++vowels;
			}
			else if((ch >= 'a'&& ch <= 'z')) {
				++consonants;
			}
			else if( ch >= '0' && ch <= '9')
			{
				++digits;
			}
				else if (ch ==' ')
				{
					++spaces;
				}
				else
					++symbols;
		}

		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + digits);
		System.out.println("White spaces: " + spaces);
		System.out.println("Symbols : " + symbols);
 }
}


//======================================================================================================

//5. WAP to implement Anagram Checking least inbuilt methods being used.




class Anagrams {
  public static void main(String[] args) {
    String str1 = "Race";
    String str2 = "Care";
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    if(str1.length() == str2.length()) {

      
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}

//=========================================================================================================

//6. WAP to implement Pangram Checking with least inbuilt methods being used.

class Panagram
 {
public static void main(String[] args)
 {
 	String str = "The quick brown fox jumps over the lazy dog"; 
	boolean[] value = new boolean[26]; 
	int index = 0;
	int flag = 1;
	for (int i = 0; i < str.length(); i++) 
	{
	if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
          {
		index = str.charAt(i) - 'A'; 
	  }
	else if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z')
	 {
		index = str.charAt(i) - 'a'; 
	 }
	value[index] = true; 
	}
	for (int i = 0; i <= 25; i++) 
	{
	if (value[i] == false)
	flag = 0;
	}
	if (flag == 1)
	System.out.print("The String is a Pangram String.");
	else
	System.out.print("The String is not a Pangram String.");
}
}

//======================================================================================================

//7. WAP to find if String contains all unique characters.


 class Unique
 {
   
    public static boolean is_Unique_str(String str)
 {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) 
	{
            if (chars[i] == chars[i-1]) 
	{
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) 
{
		//String str = "xyz";
		String str = "xyyz";
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+is_Unique_str(str));
}		
}

//==========================================================================================================

//8. WAP to find the maximum occurring character in a String.


class maxString
 {
 static final int N = 256;
 static char MaxOccuringChar(String str1)
 {
  int ctr[] = new int[N];
  int l = str1.length();
  for (int i = 0; i < l; i++)
   ctr[str1.charAt(i)]++;
  int max = -1;
  char result = ' ';

  for (int i = 0; i < l; i++)
 {
   if (max < ctr[str1.charAt(i)])
 {
    max = ctr[str1.charAt(i)];
    result = str1.charAt(i);
   }
  }

  return result;
 }
 public static void main(String[] args) 
{
  String str1 = "test string";
  System.out.println("The given string is: " + str1);
  System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(str1));
 }
}

//==================================================================================================================

