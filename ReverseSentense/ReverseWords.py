s = "i love India"
words = s.split(' ')
string =[]
for word in words:
    string.insert(0, word)
 
print("Reversed String:")
print(" ".join(string))
