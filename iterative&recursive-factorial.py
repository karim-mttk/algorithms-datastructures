def iterative_factorial(n):
    fact = 1
    for i in range(2, n+1):
        fact *=i
    return fact
print("Iterative method:" , iterative_factorial(5))       

def recur_factorial(n):
    if n == 1:
        return n
    else:
        temp = recur_factorial(n-1)
        temp = temp*n    
    return temp
print("Recursive method:", recur_factorial(5))    

#the iterative method is twice as fast
#recursion is taking more time and space by keep calling the function call
