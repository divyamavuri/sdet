# method
def calculateSum(num) :
    if num:
        return num + calculateSum(num-1)
    else :
        return 0

#start execution call method
result = calculateSum(3)
print('Recursive Sum of 3 is :',result)