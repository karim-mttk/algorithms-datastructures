#version 1
#using dictionary
def checkIfPangram(self, sentence: str) -> bool:
    if len(sentence) < 24:
        return False
    abc= "a b c d e f g h i j k l m n o p q r s t u v w x z y"
    L = abc.split()
    L2 = list(sentence)
    di = {}
    for i in L2:
        if i not in di:
            di[i] = 0
    for w in L:
        if w not in di:
            return False
    return True

#version 2: using hashmap
def checkIfPangram(self, sentence: str) -> bool:
    if len(sentence) < 24:
        return False
    abc = "a b c d e f g h i j k l m n o p q r s t u v w x z y"
    L = abc.split()
    L2 = list(sentence)
    di = set()
    for i in L2:
        if i not in di:
            di.add(i)
    for w in L:
        if w not in di:
            return False
    return True
