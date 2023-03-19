package testthreads.main;

public class Test extends Thread{
    //Atributos
    private String nome;
    private int tempo;
    
    //Construtor
    public Test(String nome,int tempo){
        this.nome = nome;
        this.tempo = tempo;
        start();
    }
    
    //Método run
    public void run(){
        
        try{
            for (int i = 0; i <= 5; i++){
            System.out.println(nome + " contador " + i);
            Thread.sleep(tempo);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        
    }
    
}
