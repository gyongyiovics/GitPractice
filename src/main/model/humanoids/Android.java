package main.model.humanoids;

import java.time.LocalDate;

public class Android extends Humanoid {
    private Double versionNumber;

    public Android(Double versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Android(String lastName, String firstName, LocalDate birth, Double versionNumber) {
        super(lastName, firstName, birth);
        this.versionNumber = versionNumber;
    }

    public Double getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Double versionNumber) {
        this.versionNumber = versionNumber;
    }
}
