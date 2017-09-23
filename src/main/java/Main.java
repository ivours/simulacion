import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.util.Precision;

public class Main {

    public static void main(String[] args)
    {

        //Logs
        
        for (int i=0; i<50; i++)
        {
            System.out.println(Main.calcularTiempoResolucionJunior());
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

    static Double calcularTiempoResolucionSenior()
    {
        Double fiInversa = new NormalDistribution().inverseCumulativeProbability(Math.random());

        Double numerador = (2.8721 * Math.exp((fiInversa + 0.22298) / 1.6257));

        Double denominador = (1 + Math.exp((fiInversa + 0.22298) / 1.6257));

        Double x = (numerador / denominador) + 0.42271;

        return Precision.round(x, 1);
    }

    static Double calcularTiempoResolucionSemiSenior()
    {
        Double fiInversa = new NormalDistribution().inverseCumulativeProbability(Math.random());

        Double numerador = (3.6348 * Math.exp((fiInversa - 0.67314) / 1.256));

        Double denominador = (1 + Math.exp((fiInversa - 0.67314) / 1.256));

        Double x = (numerador / denominador) + 1.8597;

        return Precision.round(x, 1);
    }

    static Double calcularTiempoResolucionJunior()
    {
        Double fiInversa = new NormalDistribution().inverseCumulativeProbability(Math.random());

        Double numerador = (5.2746 * Math.exp((fiInversa - 0.1655) / 1.2193));

        Double denominador = (1 + Math.exp((fiInversa - 0.1655) / 1.2193));

        Double x = (numerador / denominador) + 2.6717;

        return Precision.round(x, 1);
    }
}
