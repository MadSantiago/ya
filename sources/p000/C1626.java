package p000;

/* JADX INFO: renamed from: ۥٍٙؑٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1626 implements Comparable {

    /* JADX INFO: renamed from: ۥَ */
    public static final C1626 f5438;

    /* JADX INFO: renamed from: ۥْ */
    public static final C1626 f5439;

    /* JADX INFO: renamed from: ۥٓ */
    public static final C1626 f5440;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C1626 f5441;

    /* JADX INFO: renamed from: ۦٗ */
    public static final C1626 f5442;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C1626 f5443;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5444;

    static {
        C1626 c1626 = new C1626(100);
        C1626 c1627 = new C1626(200);
        C1626 c1628 = new C1626(300);
        C1626 c1629 = new C1626(400);
        C1626 c16210 = new C1626(500);
        C1626 c16211 = new C1626(600);
        f5443 = c16211;
        C1626 c16212 = new C1626(700);
        C1626 c16213 = new C1626(800);
        C1626 c16214 = new C1626(900);
        f5439 = c1629;
        f5440 = c16210;
        f5438 = c16211;
        f5441 = c16212;
        f5442 = c16213;
        AbstractC2164.m4188(c1626, c1627, c1628, c1629, c16210, c16211, c16212, c16213, c16214);
    }

    public C1626(int i) {
        this.f5444 = i;
        boolean z = false;
        if (1 <= i && i < 1001) {
            z = true;
        }
        if (z) {
            return;
        }
        AbstractC3767.m6644("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC3831.m6879(this.f5444, ((C1626) obj).f5444);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1626) {
            return this.f5444 == ((C1626) obj).f5444;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5444;
    }

    public final String toString() {
        return AbstractC3761.m6638(new StringBuilder("FontWeight(weight="), this.f5444, ')');
    }
}
