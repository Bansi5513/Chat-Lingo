package ChatLingo;

import java.util.Scanner;

class UserInfo{
    Scanner sc = new Scanner(System.in);
    public String name, lang;

    public String getName(){
        return name;
    }

    public String getLang(){
        return lang;
    }

    public void start(){
        try {
            System.out.print("\nEnter your name : ");
            name = sc.nextLine();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty.");
            }

            System.out.print("Enter the language you are comfortable to talk in : ");
            lang = sc.nextLine();

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }

}