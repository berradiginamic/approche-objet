package entites2;

public class Chambre extends Piece {

    /** Constructeur
     * @param etage étage
     * @param superficie superficie
     */
    public Chambre(int etage, double superficie) {
        super(etage, superficie);
    }

    @Override
    public String getType() {
        return TYPE_CHAMBRE;
    }

}
