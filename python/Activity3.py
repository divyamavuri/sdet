# Get user names
user1 = input("Enter User 1 name : ")
user2 = input("Enter User 2 name : ")

#Play
print("Lets start the Game")
user1_input = input(user1 +" Enter your input among rock, paper or scissors:").lower()
user2_input = input(user2 +" Enter your input among rock, paper or scissors:").lower()

# validation
if user1_input == user2_input :
    print("It's a tie.")
elif user1_input == 'rock' :
    if user2_input == 'scissors' :
        print("Rock Wins "+user1 +"wins")
    else :
        print("Scissors Wins "+user2 +"wins")
elif user1_input == 'scissors' :
    if user2_input == "paper" :
        print("Scissors Wins "+user2 +"wins")
    else :
        print("Rock Wins "+user2 +"wins")
elif user1_input == "paper" :
    if user2_input == "rock" :
        print("Paper Wins "+user1 +"wins")
    else :
        print("Scissors Wins "+user2 +"wins")

else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
