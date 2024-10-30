from dataclasses import dataclass

@dataclass
class UserInfo:
   firstName: str
   email: str
   password: str
   # add fields for the other info listed in activity 2. add input for create_account
   
class UserLogin:
   def __init__(self) -> None:
      self.UserArray = []  # holds UserInfo objects
      self.loggedinUser = None # holds Single UserInfo object
   
   def login(self):
      """
      Returns true if login was successful, else false 
      """
      email = input("Enter your email you have an account with.")
      password = input("Enter your password")
      for user in self.UserArray:
         if (user.email == email):
            if(user.password == password):
               self.loggedinUser = user
               print("Login Successful!")
               return True
      print("No Login found, try again")
      return False

   def create_account(self): # max entry length needs to be added, ex max 9 chars for ssn. should be in the second activity
      
      firstName = input("Enter your first name:\n")
      email = input("Enter your email address:\n")
      password = input("Enter your password:\n")
      # add additional fields

      #add confirm action conditional. 
      newUser = UserInfo(firstName, email, password)
      self.UserArray.append(newUser)
   

   def main(self): # do we want to bring the user to another loop once theyre logged in?

      while(self.loggedinUser is None): # Login Loop
         print("1: login, 2: create account, 3: quit")
         userIn = input("Select Option")
         if(userIn == "1"): # login
            self.login()
            while(self.loggedinUser is not None):
               # when we are logged in we might want to have diffrent options.
               pass # placeholder code
         elif(userIn == "2"): # create account
            self.create_account()
         elif(userIn == "3"): # exit
            break
      
      


if __name__=="__main__":
   UserLogin().main()
