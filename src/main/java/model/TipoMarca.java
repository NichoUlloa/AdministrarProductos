package model;

public enum TipoMarca {
    // marcas de productos: SONY, LG, SAMSUNG, PANASONIC, PHILIPS
    SONY("Sony"), LG("LG"), SAMSUNG("Samsung"), PANASONIC("Panasonic"), PHILIPS("Philips");

    private String tipMarca;

    private TipoMarca(String tipMarca) {
        this.tipMarca = tipMarca;
    }

    public String getTipMarca() {
        return tipMarca;
    }
    public void setTipMarca(String tipMarca) {
        this.tipMarca = tipMarca;
    }

    @Override
    public String toString() {
        return tipMarca;
    }
}