package io.codelex.oop.runner;

public enum Runner {
    BEGGINER(300, 500),
    INTERMEDIATE(299, 200),
    ADVANCED(199, 160);

    int maxMinutes;
    int minMinutes;

    Runner(int maxMinutes, int minMinutes) {
    }

    public static Runner getFitnessLevel(int time) {
        if (time <= BEGGINER.maxMinutes || time >= BEGGINER.minMinutes) {
            return BEGGINER;
        } else if (time <= INTERMEDIATE.minMinutes || time >= INTERMEDIATE.maxMinutes) {
            return INTERMEDIATE;
        } else if (time <= ADVANCED.minMinutes || time < ADVANCED.maxMinutes) {
            return ADVANCED;
        }
        return null;
    }
}
