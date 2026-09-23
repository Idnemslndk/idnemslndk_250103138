public class BulbAdapter implements SmartDevice {
    private final LegacyBulb legacyBulb;

    public BulbAdapter(LegacyBulb legacyBulb) {
        if(legacyBulb == null){
            throw new IllegalArgumentException();
        }
        this.legacyBulb = legacyBulb;
    }


    @Override
    public void turnOn() {
        legacyBulb.setBrightness(255);
    }

    @Override
    public void turnOff() {
        legacyBulb.setBrightness(0);

    }

    @Override
    public boolean isOn() {
        return legacyBulb.hasPower() && legacyBulb.readBrightness() > 0;
    }

    @Override
    public int getPowerPercent() {
        return 0;
    }
}
