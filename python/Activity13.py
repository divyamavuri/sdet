def calculate(numbers) :
    sum = 0
    for num in  numbers :
        sum = sum+num
    return sum

ListOfNumbers = [2,4,6,8,1]

result = calculate(ListOfNumbers)

print("Sum of all numbers in list "+ str(result))