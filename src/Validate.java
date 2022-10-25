import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Validate {
    
    public void validateCPF(){

        String input = JOptionPane.showInputDialog(null, "Digite o CPF a ser validado: ");
        String[] splitted = input.split("");
        int x = 10;
        int total = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> listTwo = new ArrayList<>();


        if(splitted.length == 14){

            for(int i = 0; i < 14; i++){

                if(i == 3 || i == 7 || i == 11){
    
                    continue;
                }
                else if(i == 12 || i == 13){
    
                    int a = Integer.parseInt(splitted[i]);
                    listTwo.add(a);
                }
                else{
    
                    int a = Integer.parseInt(splitted[i]);
                    list.add(a);
                    listTwo.add(a);
                }    
            }
        //Calculating the first number
    
            for(int i = 0; i < 9; i++){
    
                int y = list.get(i);
    
                y *=  x;
                total += y;
    
                x -= 1;
            }
    
            int digitoUm = total%11;
    
            if(digitoUm < 2){
    
                digitoUm = 0;
                list.add(digitoUm);
            }
            else{
    
                digitoUm = 11 - digitoUm;
                list.add(digitoUm);
            }
        //Calculating the second number
        
            total = 0;
            x = 11;
    
            for(int j = 0; j < 10; j++){
    
                int y = list.get(j);
    
                y *=  x;
                total += y;
    
                x -= 1;
            }
    
            int digitoDois = total%11;
    
            if(digitoDois < 2){
    
                digitoDois = 0;
                list.add(digitoDois);
            }
            else{
    
                digitoDois = 11 - digitoDois;
                list.add(digitoDois);
            }
    
            System.out.println(list);
            System.out.println(listTwo);
            if(digitoUm == listTwo.get(9) && digitoDois == listTwo.get(10)){
    
                JOptionPane.showMessageDialog(null, "CPF válido!");
            }
            if(digitoUm != listTwo.get(9) || digitoDois != listTwo.get(10)){
    
                JOptionPane.showMessageDialog(null, "CPF inválido!");
            }
        }
        else if(splitted.length < 14){

            for(int i = 0; i < 11; i++){

                if(i == 9 || i == 10){

                    int a = Integer.parseInt(splitted[i]);
                    listTwo.add(a);
                }
                else{

                    int a = Integer.parseInt(splitted[i]);
                    list.add(a);
                    listTwo.add(a);
                }
            }

            //Calculating the first number
    
            for(int k = 0; k < 9; k++){
    
                int y = list.get(k);
    
                y *=  x;
                total += y;
    
                x -= 1;
            }
    
            int digitoUm = total%11;
    
            if(digitoUm < 2){
    
                digitoUm = 0;
                list.add(digitoUm);
            }
            else{
    
                digitoUm = 11 - digitoUm;
                list.add(digitoUm);
            }
        //Calculating the second number
        
            total = 0;
            x = 11;
    
            for(int j = 0; j < 10; j++){
    
                int y = list.get(j);
    
                y *=  x;
                total += y;
    
                x -= 1;
            }
    
            int digitoDois = total%11;
    
            if(digitoDois < 2){
    
                digitoDois = 0;
                list.add(digitoDois);
            }
            else{
    
                digitoDois = 11 - digitoDois;
                list.add(digitoDois);
            }
    
            System.out.println(list);
            System.out.println(listTwo);
            if(digitoUm == listTwo.get(9) && digitoDois == listTwo.get(10)){
    
                JOptionPane.showMessageDialog(null, "CPF válido!");
            }
            if(digitoUm != listTwo.get(9) || digitoDois != listTwo.get(10)){
    
                JOptionPane.showMessageDialog(null, "CPF inválido!");
            }
        }

        else{

            JOptionPane.showMessageDialog(null, "Erro. Tente novamente!");
        }

    }
}
