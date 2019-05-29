package barcaNellaVasca;

/**
 *
 * @author Mauri_Davide
 */
public class Barchetta {

    private float[] puntiX;
    private float[] puntiY;
    private DatiCondivisi d;

    public Barchetta(DatiCondivisi d) {
        puntiX = new float[4];
        inizX();
        puntiY = new float[4];
        inizY();
        this.d = d;
    }

    private void inizY() {
        puntiY[0] = 55f;
        puntiY[1] = 45f;
        puntiY[2] = 55f;
        puntiY[3] = 65f;
    }

    public void inizX() {
        puntiX[0] = 30f;
        puntiX[1] = 55f;
        puntiX[2] = 80f;
        puntiX[3] = 55f;
    }

    public float[] getPuntiX() {
        return puntiX;
    }

    public float[] getPuntiY() {
        return puntiY;
    }

    public void move() {
        if (d.getInclinazioneX() > 0) {
            moveDx();
        } else if (d.getInclinazioneX() < 0) {
            moveSx();
        }
        if (d.getInclinazioneY() < 0) {
            moveUp();
        } else if (d.getInclinazioneY() > 0) {
            moveDown();
        }
    }

    public void moveDx() {
        float speed = (float) d.getInclinazioneX() * 0.05f;
        if ((puntiX[2] + speed) > d.getMaxDxScreen()) {
            speed = d.getMaxDxScreen() - puntiX[2];
            d.decrementaInclinazioneX();
        }
        for (int i = 0; i < puntiX.length; i++) {
            puntiX[i] += speed;
        }
    }

    public void moveSx() {
        float speed = (float) d.getInclinazioneX() * 0.05f;
        if ((puntiX[0] + speed) < d.getMaxSxScreen()) {
            speed = puntiX[0] - d.getMaxSxScreen();
            d.incrementaInclinazioneX();
        }
        for (int i = 0; i < puntiX.length; i++) {
            puntiX[i] += speed;
        }
    }

    private void moveUp() {
        float speed = (float) d.getInclinazioneY() * 0.05f;
        if ((puntiY[1] + speed) < d.getTopScreen()) {
            speed = puntiY[1] - d.getTopScreen();
            d.incrementaInclinazioneY();
        }
        for (int i = 0; i < puntiY.length; i++) {
            puntiY[i] += speed;
        }
    }

    private void moveDown() {
        float speed = (float) d.getInclinazioneY() * 0.05f;
        if ((puntiY[3] + speed) > d.getBottomScreen()) {
            speed = d.getBottomScreen() - puntiY[3];
            d.decrementaInclinazioneY();
        }
        for (int i = 0; i < puntiY.length; i++) {
            puntiY[i] += speed;
        }
    }

}
