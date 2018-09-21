package tallerdecorator;

abstract class PagoPSE implements Component {

  protected Component pago;

  public PagoPSE(Component pago) {
    this.pago = pago;
  }

  public String getInformacion() {
    return this.pago.getInformacion();
  }

  public void setInformacion(String informacion) {
    this.setInformacion(informacion);
  }
}
