package dk.easv.bll;

import dk.easv.be.History;

import java.util.ArrayList;
import java.util.List;

public class HistoryLogic {
    private List<History> historyArray = new ArrayList<>();
    /**
     * Adds
     * @param value
     * @param vat
     * @param result
     */
    public void AddHistory(double value, double vat, double result)
    {
        historyArray.add(new History(value, vat, result));
    }

    public History GetLatestHistory()
    {
        History history = historyArray.get(historyArray.size() - 2);
        return history;
    }

    public boolean HasAny()
    {
        return !historyArray.isEmpty();
    }
}
