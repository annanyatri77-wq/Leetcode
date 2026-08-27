class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int i=0;
    int j=letters.length-1;

    while(i<=j)
    { int mid = i + (j-i)/2;
      if(letters[mid]>target)
      {
        j = mid -1;
      }
      else
      {
        i=mid+1;
      }
    }
return letters[i % letters.length];
}
public static void main(String[]args){
Solution obj = new Solution();
char[]letters = {'c','f','j'};
char target = 'a' ;
System.out.print(obj.nextGreatestLetter(letters, target));
}
}
