import getpass

# create database
database = {"jon.snow": "wammy2", "steve.austin": "316"}

# input username and password
username = input("Enter Username:")
password = getpass.getpass("Enter Password:")

while username not in database or password != database[username]:
    print("Invalid username or password!")
    username = input("Enter Username:")
    password = getpass.getpass("Enter Password:")
   

print("User verified!")



