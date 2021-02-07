mylist = int(input("Enter numbers for tuples seperated by comma : ")).split(',')
print("Given List", mylist)

tuplelist = tuple(mylist)
print("Given List as tuple", tuplelist)

for num in tuplelist :
    if (num % 5 == 0) :
        print(num)
