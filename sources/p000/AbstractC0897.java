package p000;

/* JADX INFO: renamed from: ۥٌؔٚۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0897 implements InterfaceC4083 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5062 f3239 = new C5062();

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(mo1508());
        sb.append(", method=");
        sb.append(mo1507());
        sb.append(", line=");
        sb.append(mo1505());
        if (mo1509() != null) {
            sb.append(", file=");
            sb.append(mo1509());
        }
        if (mo1506() != null) {
            sb.append(", filePath=");
            sb.append(mo1506());
        }
        sb.append(" }");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public abstract int mo1505();

    /* JADX INFO: renamed from: ۥُ */
    public String mo1506() {
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public abstract String mo1507();

    /* JADX INFO: renamed from: ۥۣ */
    public abstract String mo1508();

    /* JADX INFO: renamed from: ۦؑ */
    public abstract String mo1509();
}
