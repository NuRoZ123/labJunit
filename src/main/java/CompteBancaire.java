public class CompteBancaire {
    private double solde;

    CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void debiterSolde(double debit) {
        if(debit > 0) {
            this.solde -= debit;
        }
    }

    public void crediterSolde(double credit) {
        if(credit > 0) {
            this.solde += credit;
        }
    }

    public double getSolde() {
        return this.solde;
    }
}
