package OOP;


import static io.hexlet.Utils.gcd;

// BEGIN
class Rational {

    private int numer;
    private int denom;

    Rational(int numer, int denom) {
        var gcd = gcd(numer, denom);
        this.numer = numer / gcd;
        this.denom = denom / gcd;
    }

    public int getNumer() {
        return numer;
    }

    public int getDenom() {
        return denom;
    }

    public Rational add(Rational rational2) {
        return new Rational(
                numer * rational2.getDenom() + denom * rational2.getNumer(),
                denom * rational2.getDenom()
        );
    }

    public Rational sub(Rational rational2) {
        return new Rational(
                numer * rational2.getDenom() - denom * rational2.getNumer(),
                denom * rational2.getDenom()
        );
    }

    public String toString() {
        return numer + "/" + denom;
    }
}
