def reverseStr(s,l):
    if l%2 == 0:
        j = int(l/2)
       
    else:
        j = int(l/2 + 1)
     
 
    while(j <= l - 1):
        s[j], s[l - j - 1] = s[l - j - 1], s[j]
        j += 1
     
    # return the reversed sentence
    return s;
       
# Driver Code
st = 'I love India';
str = st.split(' ')
str = reverseStr(str,len(str))
print(" ".join(str))
