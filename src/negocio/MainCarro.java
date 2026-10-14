package negocio;

public class MainCarro {
    static void main() { //"psvm" y tab para crear el main automaticamente
        System.out.println("El numero de objetos de tipo Carro creados son: "+Carro.getNumcarros());
        System.out.println("El IVA de los vehiculos es:"+Carro.getIva());
        Carro c1 = new Carro(2,60);
        Carro c2 = new Carro(-5,-100);
        Carro c3 = new Carro();
        System.out.println("El numero de objetos  de tipo Carro creados son:"+Carro.getNumcarros());
        /*
        c1.potencia = 2;
        c1.velocidad = 60;
        c2.potencia = 5;
        c2.velocidad = 100;
        c3.potencia = 2;
        c3.velocidad = 60;*/
       /* c1.setPotencia(2);
        c1.setVelocidad(60);
        c2.setPotencia(-5);
        c2.setVelocidad(-100);*/


        System.out.println("La pontencia del carro 1 es " + c1.getPotencia() + " y la velocidad es " + c1.getVelocidad());// sout y tab para imprimir
        System.out.println("La pontencia del carro 2 es " + c2.getPotencia() + " y la velocidad es " + c2.getVelocidad());// sout y tab para imprimir
        System.out.println("La pontencia del carro 3 es " + c3.getPotencia() + " y la velocidad es " + c3.getVelocidad());// sout y tab para imprimir

        c1.acelerar();
        c1.acelerar();
        c1.frenar();
    }
}