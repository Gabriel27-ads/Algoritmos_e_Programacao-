public class While10 {
    public static void main(String[] args) {
    double valor = 500000;
    double desgaste = 12 / 100 ;
    double manutençao = 15000;
    double aumento = 5000; 
    int cont = 0;


    while(manutençao <= valor){

    valor = valor - desgaste; 
    manutençao = manutençao + aumento;
    cont++;
    }
        System.out.println("O custo passara depois de " + cont + "anos");
    }
}
