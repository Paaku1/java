def diagraph(text):
    dia = []
    group = 0
    for i in range(2,len(text),2):
        dia.append(text[group:i])
        group = i
    dia.append(text[group:])
    return dia
def Fillerletter(text):
    k = len(text)
    if k%2 ==0:
        for i in range(0,k,2):
            if text[i] == text[i+1]:
                new_word = text[0:i+1] + str('x') + text[i+1:]
                new_word = Fillerletter(new_word)
                break
            else:
                new_word = text
    if k%2 != 0:
        for i in range(0,k-1,2):
            if text[i] == text[i+1]:
                new_word = text[0:i+1] + str('x') + text[i+1:]
                new_word = Fillerletter(new_word)
                break
            else:
                new_word = text
    return new_word
list1 = ['a','b','c','d','e','f','h','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
plaintext = Fillerletter(input())
pt = diagraph(plaintext)
