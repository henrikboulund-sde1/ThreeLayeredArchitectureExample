package dk.easv.be;

import java.util.ArrayList;
import java.util.List;

/**
 * This class takes care of everything according to historical calculations.
 * */
public class History {
    private double Value;
    private double Vat;
    private double Result;

    public double GetValue()
    {
        return Value;
    }

    public double GetVat()
    {
        return Vat;
    }

    public double GetResult()
    {
        return Result;
    }

    public History(double value, double vat, double result)
    {
        this.Value = value;
        this.Vat = vat;
        this.Result = result;
    }
}
