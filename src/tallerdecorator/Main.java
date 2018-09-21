package tallerdecorator;

import javax.swing.JOptionPane;

public class Main {

  public static void main(String[] args) {
    Component pago = new Pago();

    String valor = JOptionPane.showInputDialog("Ingrese el valor: ");
    String idConductor = JOptionPane.showInputDialog("Ingrese el id del conductor: ");
    String idPasajero = JOptionPane.showInputDialog("Ingrese el id del pasajero: ");

    pago.setInformacion("valor," + valor + ",idConductor," + idConductor + ",idPasajero," + idPasajero);

    Component pagoPSETarjeta = new PagoPSETarjeta(pago);

    String numTarjeta = JOptionPane.showInputDialog("Ingrese el número de la tarjeta: ");
    String CCV = JOptionPane.showInputDialog("Ingrese el CCV de la tarjeta: ");
    String fechaCaducidad = JOptionPane.showInputDialog("Ingrese la fecha de caducidad de la tarjeta: ");

    pagoPSETarjeta.setInformacion("numTarjeta," + numTarjeta + ",CCV," + CCV + ",fechaCaducidad," + fechaCaducidad);

    Component pagoPSECuentaBancaria = new PagoPSECuentaBancaria(pagoPSETarjeta);

    String numCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta: ");

    pagoPSECuentaBancaria.setInformacion("numCuenta," + numCuenta);

    System.out.println(pagoPSECuentaBancaria.getInformacion());
  }

}
