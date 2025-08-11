
public class string {
    public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             String str = "physicsWallah";
//             System.out.println(str);
//             System.out.println("Enter a string:");
//             String s=sc.next();
//             System.out.println("Next() " +s); // only till first space
            
//             // String fullInput = sc.nextLine(); //full input
//             //System.out.println("You entered: " + fullInput);
            
            
//             System.out.println(s.length());//length()
//             System.out.println(s.charAt(3));//charAt()
//             System.out.println(str.indexOf('y')); //indexOf()
//             String str1="Hello";
//             String gtr="Dello";
//             System.out.println(str1.compareTo(gtr));//compareTo()
//             System.out.println(str.contains("allah")); //contains()
//             System.out.println(str.endsWith("llah"));//endswith()
//             String s1="abc";
//             String s2="defg";
//             System.out.println(s1.concat(s2));//concat
//             System.out.println(str.substring(3,5)); //subtring(i),substring(i,j)

// //Print all substring-----------
// String s3="abcd";
// for (int i = 0; i <=3; i++) {
//     for (int j=i+1;j<=4;j++){
//         System.out.print(s3.substring(i,j)+" ");
//     }
// }
//count palindromic substrings-----
String Palin="abbcd";
int count =0;
for (int i = 0; i<Palin.length(); i++) {
    for (int j=i+1;j<=Palin.length();j++){
        if(isPalindrome(Palin.substring(i, j))==true){
            count++;
            
        }
        
    }
    
}System.out.println("the number of palindrome are :" +count);


// //Reverse the string------
// String sentence ="I am an Online Educator";
// String ans1=" ";
// StringBuilder sb =new StringBuilder("");
// for (int i = 0; i < sentence.length(); i++) {
//     char ch= sentence.charAt(i);
//     if(ch!=' '){
//         sb.append(ch);
        
//     }
//     else{
//         sb.reverse();
//         ans1+=sb;
//         ans1+=" ";
//         sb=new StringBuilder("");
//     }
// }
// sb.reverse();
// ans1 += sb;
// System.out.println(ans1);


//compress string aaabbbccdde====a3b3c2d2e
String compress = "aaabbbbcdddee";
String ans2 = "" + compress.charAt(0);
int count1 = 1;

// for (int i = 1; i < compress.length(); i++) {
//     char curr = compress.charAt(i);
//     char prev = compress.charAt(i - 1);

//     if (curr == prev) {
//         count1++;
//     } else {
//         if (count1 > 1) ans2 += count1;  // Append count if > 1
//             ans2 += curr;  // Append current character
//             count1 = 1;    // Reset count
//         }
// }
//         // Append count of last group
// if (count1 > 1) ans2 += count1;

// System.out.println(ans2);
 }

//check for palindrome -----

static boolean isPalindrome(String Palin){
    int i=0;
    int j=Palin.length()-1;
    while(i<j){
        if(Palin.charAt(i)!=Palin.charAt(j))return false;
        i++;
        j--;
    }return true;
}

}






