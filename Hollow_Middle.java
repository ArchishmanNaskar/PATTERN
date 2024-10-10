package PATTERN;
import java.util.*;
public class Hollow_Middle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
            else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=i;j<a;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==a){
                    System.out.print("*");
                }
                else{
                    System.out.print("+");
                }
            }
            System.out.println("");
        }*/
        ArrayList<String> colour= new ArrayList<>();
        colour.add("\u001B[30m");
        colour.add("\u001B[34m");
        colour.add("\u001B[32m");
        colour.add("\u001B[33m");
        colour.add("\u001B[30m");
        colour.add("\u001B[34m");
        colour.add("\u001B[32m");
        colour.add("\u001B[33m");
        colour.add("\u001B[30m");
        colour.add("\u001B[34m");
        colour.add("\u001B[32m");
        colour.add("\u001B[33m");
        System.out.print("Number of Symbol:");
        int x=sc.nextInt();
        ArrayList<String> symbol= new ArrayList<>();
        symbol.add(" ");
        for(int i=1;i<=x;i++){
            symbol.add(sc.next());
        }
        for(int i=1;i<=2*x-1;i++){
            if(i>x){
                symbol.set(0, symbol.get(symbol.size()-1-(i-x)) );
                colour.set(0, colour.get(symbol.size()-1-(i-x)) );
                for(int y=1;y<=i-x;y++){
                    symbol.set(symbol.size()-y, symbol.get(symbol.size()-1-(i-x)) );
                    colour.set(symbol.size()-y, colour.get(symbol.size()-1-(i-x)) );
                }
            }
            for(int j=i;j<2*x-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j>i){
                    int l=2*i-j;
                    if(l>x){
                        System.out.print(colour.getFirst()+symbol.getFirst());
                    }
                    else{
                        System.out.print(colour.get(l)+symbol.get(l));
                    }
                }
                else{
                    if(j>x){
                        System.out.print(colour.getFirst()+symbol.getFirst());
                    }
                    else{
                        System.out.print(colour.get(j)+symbol.get(j));
                    }
                }

            }
            System.out.println("");
        }
    }
}
