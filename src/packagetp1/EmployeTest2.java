package packagetp1;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest2 {
    private Employe unEmploye;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.unEmploye = new Employe("Labonte", "3444", 23, 34, 3);
    }

    @org.junit.jupiter.api.Test
    void salaireBrut() {
        assertEquals(782.00, unEmploye.salaireBrut(), 1);
    }

    @org.junit.jupiter.api.Test
    void salaireNetAvantImpot() {
        assertEquals(664.56, this.unEmploye.salaireNetAvantImpot(), 1);
    }

    @org.junit.jupiter.api.Test
    void impotFederal() {
        assertEquals(126.27, this.unEmploye.impotFederal(), 1);
    }

    @org.junit.jupiter.api.Test
    void impotProvincial() {
        assertEquals(132.91, this.unEmploye.impotProvincial(), 1);
    }

    @org.junit.jupiter.api.Test
    void salaireNetApresImpot() {
        assertEquals(405.38, this.unEmploye.salaireNetApresImpot(),1);
    }

    @org.junit.jupiter.api.Test
    void joursVacances() {
        assertEquals(18, this.unEmploye.joursVacances(), 0);
    }
}