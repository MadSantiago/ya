package p000;

import java.io.File;

/* JADX INFO: renamed from: ۥؘٖؕؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0676 extends AbstractC0897 {

    /* JADX INFO: renamed from: ۥۗ */
    public int f2476;

    public final boolean equals(Object obj) {
        return obj instanceof C0676;
    }

    public final int hashCode() {
        int i = this.f2476;
        if (i != 0) {
            return i;
        }
        this.f2476 = -1391114360;
        return -1391114360;
    }

    @Override // p000.AbstractC0897
    /* JADX INFO: renamed from: ۥؗ */
    public final int mo1505() {
        return 44;
    }

    @Override // p000.AbstractC0897
    /* JADX INFO: renamed from: ۥُ */
    public final String mo1506() {
        return "Phlogger.java";
    }

    @Override // p000.AbstractC0897
    /* JADX INFO: renamed from: ۥۗ */
    public final String mo1507() {
        return "logInternal";
    }

    @Override // p000.AbstractC0897
    /* JADX INFO: renamed from: ۥۣ */
    public final String mo1508() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // p000.AbstractC0897
    /* JADX INFO: renamed from: ۦؑ */
    public final String mo1509() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }
}
