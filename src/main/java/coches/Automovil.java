package coches;

public class Automovil {
    private String marca;
    private short modelo;
    private short motor;
    private enum TipoCombustible {
        GASOLINA, DIESEL, BIODIESEL, BIOETANOL, GASNATURAL
    };
    private TipoCombustible tipoCombustible;
    private enum TipoAutomovil {
        UTILITARIO, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    };
    private TipoAutomovil tipoAutomovil;
    private byte numeroPuertas;
    private byte cantidadAsientos;
    private short cantidadVehiculos;
    private short velocidadMaxima;
    private enum Color {
        BLANCO, VERDE, AMARILLO, AZUL, VIOLETA, NEGRO, ROJO, NARANJA
    };
    private Color color;
    private short velocidadActual;
    public Automovil(String marca, short modelo, short motor, TipoCombustible tipoCombustible,
            TipoAutomovil tipoAutomovil, byte numeroPuertas, byte cantidadAsientos, short cantidadVehiculos,
            short velocidadMaxima, Color color, short velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.cantidadVehiculos = cantidadVehiculos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public short getModelo() {
        return modelo;
    }
    public void setModelo(short modelo) {
        this.modelo = modelo;
    }
    public short getMotor() {
        return motor;
    }
    public void setMotor(short motor) {
        this.motor = motor;
    }
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public byte getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(byte numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public byte getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(byte cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
    public short getCantidadVehiculos() {
        return cantidadVehiculos;
    }
    public void setCantidadVehiculos(short cantidadVehiculos) {
        this.cantidadVehiculos = cantidadVehiculos;
    }
    public short getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(short velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public short getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(short velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
}
