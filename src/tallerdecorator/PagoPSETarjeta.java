package tallerdecorator;

public class PagoPSETarjeta extends PagoPSE {

  private String numTarjeta;
  private String CCV;
  private String fechaCaducidad;

  public PagoPSETarjeta(Component pago) {
    super(pago);
  }

  @Override
  public String getInformacion() {
    return super.getInformacion() + this.getNuevaInformacion();
  }

  @Override
  public void setInformacion(String informacion) {
    String[] informacionArray = informacion.split(",");
    for (int i = 0; i < informacionArray.length; i++) {
      switch (informacionArray[i]) {
        case "numTarjeta":
          this.numTarjeta = informacionArray[i + 1];
          break;
        case "CCV":
          this.CCV = informacionArray[i + 1];
          break;
        case "fechaCaducidad":
          this.fechaCaducidad = informacionArray[i + 1];
          break;
      }
    }
  }

  public String getNuevaInformacion() {
    return ",numTarjeta," + this.numTarjeta + ",CCV," + this.CCV + ",fechaCaducidad," + fechaCaducidad;
  }
}
