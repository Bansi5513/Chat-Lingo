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
        System.out.print("\nEnter your name : ");
        name = sc.nextLine();
        System.out.print("Enter the language you are comfortable to talk in : ");
        lang = sc.nextLine();
    }

}