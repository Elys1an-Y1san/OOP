public boolean cigarParty(int cigars, boolean isWeekend) {
    if (isWeekend) {
        // No upper bound on weekends, just need >= 40
        return (cigars >= 40);
    } else {
        // On weekdays, need between 40 and 60 inclusive
        return (cigars >= 40 && cigars <= 60);
    }
}

public void main() {
}