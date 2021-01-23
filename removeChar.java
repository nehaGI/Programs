// Java program to remove 
// a particular character
// from a string.
class Main 
{
static void removeChar(String s, char c)
{
    int j, count = 0, n = s.length();
    char []t = s.toCharArray();
    for (int i = j = 0; i < n; i++)
    {
        if (t[i] != c)
        t[j++] = t[i];
        else
            count++;
    }
    //to fill remaing space with null
    while(count > 0)
    {
        t[j++] = '\0';
        count--;
    }
     
    System.out.println(t);
}
 

public static void main(String[] args) 
{
    String s = "Google";
    removeChar(s, 'g');
}
}
