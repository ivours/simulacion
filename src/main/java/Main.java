import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.util.Precision;

public class Main {

    public static void main(String[] args)
    {
        for (int i=0; i<50; i++)
        {
            System.out.println(Main.calcularIntervaloEntreArribos());
        }
    }

    static Double calcularIntervaloEntreArribos()
    {
        Double fiInversa = new NormalDistribution().inverseCumulativeProbability(Math.random());

        Double numerador = (0.97176 * Math.exp((fiInversa - 1.4414) / 0.98766));

        Double denominador = (1 + Math.exp((fiInversa - 1.4414) / 0.98766));

        Double x = (numerador / denominador) + 0.09811;

        return Precision.round(x, 1);
    }
}
