def fibonacciNumber(num) :
    if num <=1 :
        return num
    else :
        return fibonacciNumber(num-1)+fibonacciNumber(num-2)

noOfTerms = int(input("Enter a number :"))

for i in range(noOfTerms) :
    print(fibonacciNumber(i))
